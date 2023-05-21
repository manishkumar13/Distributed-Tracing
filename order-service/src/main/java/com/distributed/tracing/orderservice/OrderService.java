package com.distributed.tracing.orderservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public String inventoryService() {
        logger.info("Calling Inventory Service");
        URI uri = URI.create("http://localhost:8081/inventory/health");
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        logger.info("Result from inventory Service : " + response.getBody());
        return response.getBody();
    }
}
