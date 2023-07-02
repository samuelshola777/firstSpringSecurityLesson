package com.example.securityMaven.userZ;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_user")
public class User {

    @Id
  @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String password;
}
