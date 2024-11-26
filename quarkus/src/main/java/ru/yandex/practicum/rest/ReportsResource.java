package ru.yandex.practicum.rest;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Path("/reports")
public class ReportsResource {
    @GET
    @RolesAllowed("${app.role.reports}")
    public List<String> getReports() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(UUID.randomUUID().toString());
        }
        return list;
    }
}
