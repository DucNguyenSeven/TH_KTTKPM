package ngduc.orderservice.service;

import ngduc.orderservice.dto.OrderResponse;
import ngduc.orderservice.model.Order;

import java.util.List;

public interface OrderService {
    Order save(Order order);
    List<OrderResponse> getAll();
    Order getById(Long id);
    Order update(Long id, Order order);
    void delete(Long id);
}