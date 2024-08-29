package com.authAuten.authAuten.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
