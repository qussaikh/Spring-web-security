package com.qussai.security.webService.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@Tag(name = "user")
public class DemoUserController {


    @Operation(
            description = "Get endpoint for user",
            summary = "This is a summary for user get endpoint",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid Token",
                            responseCode = "403"
                    )
            }

    )
    @GetMapping
    public String get() {
        return "GET:: user controller";
    }
    @PostMapping
    public String post() {
        return "POST:: user controller";
    }
    @PutMapping
    public String put() {
        return "PUT:: user controller";
    }
    @DeleteMapping
    public String delete() {
        return "DELETE:: user controller";
    }
}
