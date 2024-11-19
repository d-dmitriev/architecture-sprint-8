package ru.yandex.practicum.report.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ReportController {
    @GetMapping("reports")
    public Mono<List<String>> getReports() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(UUID.randomUUID().toString());
        }
        return Mono.just(list);
    }
}
