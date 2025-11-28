package com.mintshock.tasks.domain.dtos;

public record ErrorResponse(
    int status,
    String message,
    String details
) {

}
