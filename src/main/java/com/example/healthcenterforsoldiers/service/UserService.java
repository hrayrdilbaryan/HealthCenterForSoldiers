package com.example.healthcenterforsoldiers.service;

import com.example.healthcenterforsoldiers.excaption.DuplicateResourceException;
import com.example.healthcenterforsoldiers.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(User user) throws DuplicateResourceException {
        if (userRepository.findByEmail(user.getEmail()).isPresent()){
            throw new DuplicateResourceException("User already exists");
        }
        userRepository.save(user);

    }




}
