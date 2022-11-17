package com.springjwtexample.springjwt.payload.response;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorialResponseDto {
    private Long id;
    private String title;
    private String description;
    private boolean published;
    private CommentResponseDto comment;
}
