package com.example.JavaAssessment.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document("users")
public class Users {
    
    @Id
    private String id;

    @NonNull
    private String name;
    private List<UserAddress> address;


    public Users(String id, String name, List<UserAddress> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
