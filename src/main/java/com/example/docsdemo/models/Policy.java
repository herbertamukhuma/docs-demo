package com.example.docsdemo.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Policy {

    String policyNo;
    float sumAssured;
    String clientName;
}
