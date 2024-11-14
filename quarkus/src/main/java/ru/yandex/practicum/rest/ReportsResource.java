package ru.yandex.practicum.rest;

import io.quarkus.security.Authenticated;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import ru.yandex.practicum.rest.dto.Report;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Path("/reports")
@Authenticated
public class ReportsResource {
    @GET
    @RolesAllowed("${app.role.reports}")
    public List<Report> getReports() {
        List<Report> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Report(UUID.randomUUID(), LocalDateTime.now()));
        }
        return list;
    }
}
