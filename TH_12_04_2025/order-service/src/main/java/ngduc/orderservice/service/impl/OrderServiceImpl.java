package ngduc.orderservice.service.impl;

import ngduc.orderservice.dto.OrderResponse;
import ngduc.orderservice.dto.ProductDTO;
import ngduc.orderservice.external.ProductClient;
import ngduc.orderservice.model.Order;
import ngduc.orderservice.repository.OrderRepository;
import ngduc.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private ProductClient productClient;

    @Override
    public Order save(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        return repository.save(order);
    }

    @Override
    public List<OrderResponse> getAll() {
        return repository.findAll().stream().map(order -> {
            ProductDTO product = productClient.getProductById(order.getProductId());
            double total = product.getPrice() * order.getQuantity();

            return OrderResponse.builder()
                    .id(order.getId())
                    .productId(order.getProductId())
                    .quantity(order.getQuantity())
                    .createdAt(order.getCreatedAt())
                    .productDetail(product)
                    .totalAmount(total)
                    .build();
        }).collect(Collectors.toList());
    }

    @Override
    public Order getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    public Order update(Long id, Order updated) {
        Order existing = getById(id);
        existing.setProductId(updated.getProductId());
        existing.setQuantity(updated.getQuantity());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}