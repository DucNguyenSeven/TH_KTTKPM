package ngduc.orderservice.external;

import ngduc.orderservice.dto.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public ProductDTO getProductById(Long productId) {
        return restTemplate.getForObject(
                "http://localhost:8081/products/" + productId,
                ProductDTO.class
        );
    }
}
