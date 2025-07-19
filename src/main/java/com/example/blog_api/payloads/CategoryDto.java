package com.example.blog_api.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer categoryId;
    @NotBlank
    @Size(min = 4, message = "Size of Title should be more than 4")
    private String categoryTitle;
    @NotBlank
    @Size(min = 10, message = "Size of Description should be more than 10")
    private String categoryDescription;
}
