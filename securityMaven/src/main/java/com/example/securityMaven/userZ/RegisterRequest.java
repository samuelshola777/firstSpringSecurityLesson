package com.example.securityMaven.userZ;

import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class RegisterRequest {


    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
