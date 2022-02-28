package com.example.docsdemo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PolicyDto {

    @JsonProperty("policy_no")
    @ApiModelProperty(required = true, example = "PLN/234/2345")
    String policyNo;

    @JsonProperty("sum_assured")
    @ApiModelProperty(required = true, example = "10000")
    float sumAssured;

    @JsonProperty("client_name")
    @ApiModelProperty(required = true, example = "Herbert Amukhuma")
    String clientName;
}
