package com.rachit.bank.service.impl;

import com.rachit.bank.dto.request.RegisterRequest;
import com.rachit.bank.entity.User;
import com.rachit.bank.repository.UserRepository;
import com.rachit.bank.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public Long register(RegisterRequest request) {
        User user = modelMapper.map(request,User.class);
        User data = userRepository.save(user);
        return data.getUuid();
    }
}
