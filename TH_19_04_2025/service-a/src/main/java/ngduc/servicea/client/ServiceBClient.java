package ngduc.servicea.client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceBClient {

    @Autowired
    private RestTemplate restTemplate;

    @CircuitBreaker(name = "serviceB", fallbackMethod = "getDefaultResponse")
    public String callServiceB() {
        return restTemplate.getForObject("http://localhost:8082/b/hello", String.class);
    }

    public String getDefaultResponse(Throwable t) {
        return "Fallback from Service A: Service B is down!";
    }
}