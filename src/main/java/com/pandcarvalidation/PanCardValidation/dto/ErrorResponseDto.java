package com.pandcarvalidation.PanCardValidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ErrorResponseDto {
   private String message;
   private int statusCode;
   private String error;

   public ErrorResponseDto(String message, int statusCode, String error) {
      this.message = message;
      this.statusCode = statusCode;
      this.error = error;
   }
}
