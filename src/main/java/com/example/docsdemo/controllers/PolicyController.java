package com.example.docsdemo.controllers;

import com.example.docsdemo.dtos.PolicyDto;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    @ApiOperation(value = "Gets a list of policies", response = PolicyDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @GetMapping
    public ResponseEntity<List<PolicyDto>> getPolicies(){
        return ResponseEntity.ok(
                Arrays.asList(
                        PolicyDto.builder()
                                .policyNo("PLN/2345/2309")
                                .sumAssured(10000)
                                .clientName("Herbert Amukhuma")
                                .build(),
                        PolicyDto.builder()
                                .policyNo("PLN/2345/2310")
                                .sumAssured(12000)
                                .clientName("John Doe")
                                .build()
                )
        );
    }

    @ApiOperation(value = "Adds a policy", response = PolicyDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successfully created policy"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @PostMapping
    public ResponseEntity<PolicyDto> addPolicy(@RequestBody PolicyDto policyDto){
        return ResponseEntity.ok(policyDto);
    }
}
