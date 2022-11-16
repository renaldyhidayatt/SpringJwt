package com.springjwtexample.springjwt.payload.request;

import javax.validation.constraints.NotBlank;

public class TutorialRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private boolean published;

}
