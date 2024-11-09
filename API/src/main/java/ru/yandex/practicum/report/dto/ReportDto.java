package ru.yandex.practicum.report.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record ReportDto(UUID id, LocalDateTime lastUpdated) { }
