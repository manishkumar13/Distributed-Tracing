package com.distributed.tracing.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class HealthController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/health")
    public String health() {
        return orderService.inventoryService();
    }
}
