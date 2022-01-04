package com.tonyvo.hibernatespringdemo.controller;

import com.tonyvo.hibernatespringdemo.dto.ProductDto;
import com.tonyvo.hibernatespringdemo.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private ProductService productService;

    @Operation(summary = "return data of Surcharge Tax based on year", tags = {"MCR Admin Surcharge Tax Controller"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return data of Surcharge Tax",
                    content = @Content(schema = @Schema(implementation = ProductDto.class))),
            @ApiResponse(responseCode = "404", description = "No data found for requested resource",
                    content = @Content(schema = @Schema(implementation = ProductDto.class)))
    })
    @GetMapping("/")
    public ResponseEntity<List<ProductDto>> greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return ResponseEntity.ok(productService.getAllProduct());
    }
}
