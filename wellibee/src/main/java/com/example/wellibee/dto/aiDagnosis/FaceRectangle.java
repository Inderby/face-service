package com.example.wellibee.dto.aiDagnosis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FaceRectangle {
    int top;
    int left;
    int width;
    int height;
}
