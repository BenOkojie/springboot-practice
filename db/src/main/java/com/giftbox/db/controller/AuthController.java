package com.giftbox.db.controller;

import com.giftbox.db.dto.AuthResponse;
import com.giftbox.db.dto.signuprequest;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@Valid @RequestBody signuprequest req) {

        // Later: save user & generate real JWT
        String dummyJwt = "jwt-goes-here";

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new AuthResponse(dummyJwt));
    }
}
