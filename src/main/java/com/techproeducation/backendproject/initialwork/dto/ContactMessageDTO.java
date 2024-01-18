package com.techproeducation.backendproject.initialwork.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContactMessageDTO {

    //private Long id;

    @NotNull(message = "Name does not be null.!")
    private String name;

    @Email(message = "Email does not be null.!")
    @NotNull(message = "Please prove valid email.!")
    private String email;

    @NotNull(message = "Subject does not be null.!")
    private String subject;

    @NotNull(message = "Message does not be null.!")
    private String message;
}
