package org.example.ims_backend.dto.user.user.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateUserRequest {
    String username;
    String fullName;
    String lastName;
    String firstName;
    String email;
    String phone;
    String homeTown;
    Integer gender;
    LocalDate dateOfBirth;
}
