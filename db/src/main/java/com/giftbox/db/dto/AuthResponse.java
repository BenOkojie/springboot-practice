package com.giftbox.db.dto;

/**
 * Returned by /auth/signup and /auth/login.
 * You can add more fields later (userId, expiresAt, role, etc.).
 */
public record AuthResponse(String token) {}
