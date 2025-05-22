package com.giftbox.db.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

/**
 * Incoming JSON for /auth/signup
 */
public record signuprequest(
        @Email String email,
        @Size(min = 8) String password
) {}
