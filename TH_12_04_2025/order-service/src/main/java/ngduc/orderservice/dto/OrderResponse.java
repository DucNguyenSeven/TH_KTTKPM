package ngduc.orderservice.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {
    private Long id;
    private Long productId;
    private int quantity;
    private LocalDateTime createdAt;
    private ProductDTO productDetail;
    private double totalAmount;
}
