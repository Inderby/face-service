package com.example.wellibee.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collation = "Diagnosis")
public class Diagnosis {
    @Id @Field(name = "_id", targetType = FieldType.OBJECT_ID) String id;
    @Field(name = "frontalis_muscle") boolean frontalis_muscle;
    @Field(name = "CSM") boolean CSM;
    @Field(name = "LLS_1") boolean LLS1;
    @Field(name = "upper_eyelid") boolean upperEyelid;
    @Field(name = "lower_eyelid") boolean lowerEyelid;
    @Field(name = "orbicularis_oculi_1") boolean orbicularisOculi1;
    @Field(name = "orbicularis_oculi_2") boolean orbicularisOculi2;
    @Field(name = "orbital_margin") boolean orbitalMargin;
    @Field(name = "LLS_2") boolean LLS_2;
    @Field(name = "zygomaticus_minor") boolean zygomaticusMinor;
    @Field(name = "risorius") boolean risorius;
    @Field(name = "buccinator") boolean buccinator;
    @Field(name = "orbicularis_oris") boolean orbicularisOris;
    @Field(name = "DAO") boolean DAO;
    @Field(name = "masseter_muscle") boolean masseterMuscle;
    @Field(name = "mentalis") boolean mentalis;
    @Field(name = "DLI") boolean DLI;

}
