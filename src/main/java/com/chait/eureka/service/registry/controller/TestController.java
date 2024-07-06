package com.chait.eureka.service.registry.controller;

import com.netflix.discovery.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    EurekaClient eurekaClient;

    @GetMapping
    public ResponseEntity<List<String>> getApplications() {
        return ResponseEntity.ok(
                eurekaClient.getApplications()
                        .getRegisteredApplications()
                        .stream()
                        .map(application -> application.getName())
                        .collect(Collectors.toList())
        );
    }

}
