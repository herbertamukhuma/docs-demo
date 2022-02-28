package com.example.docsdemo.controllers;

import com.example.docsdemo.models.Policy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    @GetMapping
    public ResponseEntity<List<Policy>> getPolicies(){
        return ResponseEntity.ok(
                Arrays.asList(
                        Policy.builder()
                                .policyNo("PLN/2345/2309")
                                .sumAssured(10000)
                                .clientName("Herbert Amukhuma")
                                .build(),
                        Policy.builder()
                                .policyNo("PLN/2345/2310")
                                .sumAssured(12000)
                                .clientName("John Doe")
                                .build()
                )
        );
    }
}
