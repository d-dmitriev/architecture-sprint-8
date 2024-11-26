package ru.yandex.practicum.report.security;

import org.springframework.security.core.GrantedAuthority;

public class RoleGrantedAuthority implements GrantedAuthority {
    private final String ROLE_PREFIX = "ROLE_";
    private final String auth;

    public RoleGrantedAuthority(String auth) {
        this.auth = auth;
    }

    @Override
    public String getAuthority() {
        return ROLE_PREFIX + auth;
    }
}
