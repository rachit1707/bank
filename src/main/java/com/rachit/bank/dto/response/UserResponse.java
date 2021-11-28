package com.rachit.bank.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Data
public class UserResponse {
    @JsonProperty("userId")
    private Long userId;
}
