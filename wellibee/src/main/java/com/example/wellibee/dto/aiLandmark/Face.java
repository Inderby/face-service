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
public class Face {
    @Field(name = "face_contour_right") List<Coordinate> faceContourRight;
    @Field(name = "face_contour_left") List<Coordinate> faceContourLeft;
    @Field(name = "face_hairLine") List<Coordinate> faceHairLine;
}
