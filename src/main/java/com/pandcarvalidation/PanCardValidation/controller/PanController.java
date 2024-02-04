package com.pandcarvalidation.PanCardValidation.controller;

import com.pandcarvalidation.PanCardValidation.dto.ErrorResponseDto;
import com.pandcarvalidation.PanCardValidation.dto.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
@Tag(
        name = "Save User for Demo",
        description = "Save User for Demo"
)
public class PanController {

    @Operation(summary = "Create User REST API", description = "REST API to create new User")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTP Status Success"
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "HTTP Bad Request",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            )
    })
    @PostMapping("/save")
    public ResponseEntity<String> checkValidation(@Valid @RequestBody UserDto userDto) {

        return ResponseEntity.ok("Validation Check");
    }
}
