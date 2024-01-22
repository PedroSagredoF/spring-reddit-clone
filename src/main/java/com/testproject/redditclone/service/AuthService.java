package com.testproject.redditclone.service;

import com.testproject.redditclone.dto.AuthenticationResponse;
import com.testproject.redditclone.dto.LoginRequest;
import com.testproject.redditclone.dto.RegisterRequest;

public interface AuthService {
    public void signUp(RegisterRequest registerRequest);

    void verifyAccount(String token);

    AuthenticationResponse login(LoginRequest loginRequest);
}
