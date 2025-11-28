package com.mintshock.tasks.domain.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import com.mintshock.tasks.domain.entities.TaskPriority;
import com.mintshock.tasks.domain.entities.TaskStatus;

public record TaskDto(
    UUID id,
    String title,
    String description,
    LocalDateTime dueDate,
    TaskPriority priority,
    TaskStatus status
) {
}
