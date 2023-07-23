package com.example.wellibee.dto.aiLandmark;

import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.data.mongodb.core.mapping.Document;
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
public class Eye {
    @Field(name = "right_eye_eyelid") List<Coordinate> rightEyelid;
    @Field(name = "left_eye_eyelid") List<Coordinate> leftEyelid;
    @Field(name = "right_eye_pupil_center") Coordinate rightEyePupilCenter;
    @Field(name = "left_eye_pupil_center") Coordinate leftEyePupilCenter;
    @Field(name = "right_eye_arr") List<Coordinate> rightEye;
    @Field(name = "left_eye_arr") List<Coordinate> leftEye;
    @Field(name = "left_eye_brow") List<Coordinate> leftEyeBrow;
    @Field(name = "right_eye_brow") List<Coordinate> rightEyeBrow;
}
