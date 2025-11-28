package com.mintshock.tasks.mappers;

import com.mintshock.tasks.domain.dtos.TaskDto;
import com.mintshock.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
