package com.example.wellibee.dto;

import com.example.wellibee.dto.aiDagnosis.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "AI_Diagnosis")
public class AIDiagnosis {
    @Id @Field(name = "_id", targetType = FieldType.OBJECT_ID) String id;
    @Field(name  = "face_rectangle")
    FaceRectangle faceRectangle;
    @Field(name = "headpose") HeadPose headPose;
    @Field(name = "blur") float blur;
    @Field(name = "eye_status") EyeStatus eyeStatus;
    @Field(name = "emotion") Emotion emotion;
    @Field(name = "face_quality") float faceQuality;
    @Field(name = "beauty") Beauty beauty;
    @Field(name = "mouth_status") MouthStatus mouthStatus;
    @Field(name = "skin_status") SkinStatus skinStatus;
    @Field(name = "face_num") int faceNum;
    @Field(name = "created_at") LocalDateTime createdAt;
}
