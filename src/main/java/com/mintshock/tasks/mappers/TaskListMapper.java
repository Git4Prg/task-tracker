package com.mintshock.tasks.mappers;

import com.mintshock.tasks.domain.dtos.TaskListDto;
import com.mintshock.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    
    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
