package com.example.day27.domain.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseStatus {
    private boolean success;
    private String message;
}
