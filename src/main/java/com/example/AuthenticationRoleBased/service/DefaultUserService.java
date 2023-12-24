package com.example.AuthenticationRoleBased.service;

import com.example.AuthenticationRoleBased.dto.UserRegisteredDTO;

import com.example.AuthenticationRoleBased.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface DefaultUserService extends UserDetailsService {

    User save(UserRegisteredDTO userRegisteredDTO);
}
