package dev.fvila.motorbike.controllers;

import dev.fvila.motorbike.models.Brand;
import static org.springframework.http.HttpStatus.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/brands")
public class BrandsController {

    @GetMapping(value = "")
    public ResponseEntity<List<Brand>> index(){
        return ResponseEntity.status(OK).body(Arrays.stream(Brand.values()).collect(Collectors.toList()));
    }
}
