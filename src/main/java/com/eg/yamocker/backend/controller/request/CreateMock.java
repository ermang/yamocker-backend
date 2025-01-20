package com.eg.yamocker.backend.controller.request;

import jakarta.validation.constraints.NotBlank;

public class CreateMock {

    @NotBlank
    public String requestUrl;
    @NotBlank
    public String response;
}
