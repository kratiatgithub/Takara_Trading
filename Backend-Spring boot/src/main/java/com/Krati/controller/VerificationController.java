package com.Krati.controller;

import com.Krati.service.EmailService;
import com.Krati.service.UserService;
import com.Krati.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationController {
    private final VerificationService verificationService;
    private final UserService userService;

    @Autowired
    private EmailService emailService;

    @Autowired
    public VerificationController(VerificationService verificationService, UserService userService) {
        this.verificationService = verificationService;
        this.userService = userService;
    }




}
