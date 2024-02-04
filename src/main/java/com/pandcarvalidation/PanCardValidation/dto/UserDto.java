package com.pandcarvalidation.PanCardValidation.dto;

import com.pandcarvalidation.PanCardValidation.custom.PanCarValidation;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name = "UserDto",
        description = "Schema to hold User information"
)
public class UserDto {
    @Schema(description = "The ID of the user")
    private long id;

    @Schema(description = "The email address of the user")
    @Email(message = "Email should be in proper format")
    private String email;

    @Schema(description = "The PAN card number of the user", example = "FRJSS2055Q")
    @PanCarValidation(message = "PAN card number should be in proper format")
    private String panCarNumber;
}
