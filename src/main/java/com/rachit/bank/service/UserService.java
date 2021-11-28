package com.rachit.bank.service;

import com.rachit.bank.dto.request.RegisterRequest;

public interface UserService {
    public Long register(RegisterRequest request);
}
