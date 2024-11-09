package ru.yandex.practicum.report.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.server.resource.authentication.BearerTokenAuthentication;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.report.dto.ReportDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class ReportController {

    @GetMapping("reports")
//    @PreAuthorize("hasRole('realms:prothetic_user')")
//    @PreAuthorize("hasAuthority('SCOPE_email')")
    @PreAuthorize("principal?.attributes['realm_access']['roles'].contains('prothetic_user')")
    public ResponseEntity<List<ReportDto>> getReports(BearerTokenAuthentication authentication, @RequestHeader HttpHeaders requestHeaders) {
//        System.out.println(authentication.getTokenAttributes());
//        System.out.println(authentication.getCredentials());
        List<ReportDto> list = new ArrayList<>();
        ReportDto r1 = new ReportDto(UUID.randomUUID(), LocalDateTime.now());
        list.add(r1);
        return ResponseEntity.ok().headers(requestHeaders).body(list);
    }
}
