package dev.fvila.motorbike.controllers;

import dev.fvila.motorbike.dto.MotorbikeDTO;
import dev.fvila.motorbike.models.Brand;
import dev.fvila.motorbike.services.MotorbikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/motorbike")
public class MotorbikeController {
    @Autowired
    private MotorbikeService service;

    @GetMapping(value = "")
    public ResponseEntity<List<MotorbikeDTO>> index(){
        return ResponseEntity.status(OK).body(service.findAll());
    }
}
