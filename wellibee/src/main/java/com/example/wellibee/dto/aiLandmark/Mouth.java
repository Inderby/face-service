package com.example.wellibee.dto.aiLandmark;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mouth {
    @Field(name = "upper_lip") List<Coordinate> upperLip;
    @Field(name = "lower_lip") List<Coordinate> lowerLip;
}
