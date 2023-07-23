package com.example.wellibee.dto.aiLandmark;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Nose {
    @Field(name = "nose_left") List<Coordinate> noseLeft;
    @Field(name = "nose_right") List<Coordinate> noseRight;
    @Field(name = "nose_middle") List<Coordinate> noseMiddle;
    @Field(name = "left_nostril") Coordinate leftNostril;
    @Field(name = "right_nostril") Coordinate rightNostril;

}
