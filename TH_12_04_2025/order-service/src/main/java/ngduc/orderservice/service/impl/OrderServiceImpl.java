package ngduc.orderservice.service.impl;

import ngduc.orderservice.model.Order;
import ngduc.orderservice.repository.OrderRepository;
import ngduc.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    public Order save(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        return repository.save(order);
    }

    @Override
    public List<Order> getAll() {
        return repository.findAll();
    }

    @Override
    public Order getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
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