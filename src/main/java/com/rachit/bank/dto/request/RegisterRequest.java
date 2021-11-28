package com.rachit.bank.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RegisterRequest {
    @JsonProperty("name")
    private String name;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("contact")
    private String contact;
    @JsonProperty("password")
    private String password;
    @JsonProperty("email")
    private String email;
}
