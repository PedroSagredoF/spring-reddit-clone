package com.testproject.redditclone.service;

import com.testproject.redditclone.dto.RegisterRequest;

public interface AuthService {
    public void signUp(RegisterRequest registerRequest);
}
