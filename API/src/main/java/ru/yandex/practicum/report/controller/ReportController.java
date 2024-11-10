package ru.yandex.practicum.report.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.report.dto.ReportDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ReportController {
    @GetMapping("reports")
    public ResponseEntity<List<ReportDto>> getReports() {
        List<ReportDto> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ReportDto item = new ReportDto(UUID.randomUUID(), LocalDateTime.now());
            list.add(item);
        }
        return ResponseEntity.ok().body(list);
    }
}
