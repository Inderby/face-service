package com.example.wellibee.dto;

import com.example.wellibee.dto.aiLandmark.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "AI_landmark")
public class AILandmark {
    @Id @Field(name = "_id", targetType = FieldType.OBJECT_ID) String id;
    @Id @Field(name = "eye") Eye eye;
    @Field(name = "face") Face face;
    @Field(name = "mouth") Mouth mouth;
    @Field(name = "nose") Nose nose;
    @Field(name = "created_at") LocalDateTime createdAt;
}
