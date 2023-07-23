package com.example.wellibee.dto;

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
@Document(collection = "User")
public class User {
    @Id @Field(name = "_id", targetType = FieldType.OBJECT_ID)String id;
    @Field(name = "nickname") String nickname;
    @Field(name = "birthday") LocalDateTime birthday;
    @Field(name = "phone_number") String phoneNumber;
    @Field(name = "Diagnosis") List<String> diagnosis;
    @Field(name = "AI_Diagnosis") List<String> aiDiagnoses;
    @Field(name = "AI_landmark") List<String> aiLandmarks;
    @Field(name = "created_at") LocalDateTime createdAt;
    @Field(name = "last_modified_at") LocalDateTime lastModifiedTime;
}
