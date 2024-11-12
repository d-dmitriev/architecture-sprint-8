package ru.yandex.practicum.report.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import ru.yandex.practicum.report.dto.ReportDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ReportController {
    @GetMapping("reports")
    public Flux<ReportDto> getReports() {
        List<ReportDto> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ReportDto item = new ReportDto(UUID.randomUUID(), LocalDateTime.now());
            list.add(item);
        }
        return Flux.fromIterable(list);
    }
}
