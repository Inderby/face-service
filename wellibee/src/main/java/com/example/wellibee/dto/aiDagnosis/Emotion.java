package com.example.wellibee.dto.aiDagnosis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Emotion {
    float anger;
    float disgust;
    float fear;
    float happiness;
    float neutral;
    float sadness;
}
