package com.pandcarvalidation.PanCardValidation;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "PanCard Validation",
                description = "Demo Springboot application to test validtion of Custom PanCard Number",
                version = "v1",
                contact = @Contact(
                        name = "Jaisai",
                        email = "jaisaisarkates5@gmail.com"
                )
        )
)
public class PanCardValidationApplication {

    public static void main(String[] args) {
        SpringApplication.run(PanCardValidationApplication.class, args);
    }

}
