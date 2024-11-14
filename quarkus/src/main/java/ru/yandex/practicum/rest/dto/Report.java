package ru.yandex.practicum.rest.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record Report(UUID id, LocalDateTime date) {
}
