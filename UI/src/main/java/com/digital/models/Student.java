package com.digital.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode

public class Student {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String currentAddress;

}
