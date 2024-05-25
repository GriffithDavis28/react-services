package com.example.JavaAssessment.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserAddress {
    private String address;
    private String city;

    public UserAddress(String address, String city) {
        this.address = address;
        this.city = city;
    }
}
