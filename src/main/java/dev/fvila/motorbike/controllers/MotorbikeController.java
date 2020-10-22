package dev.fvila.motorbike.controllers;

import dev.fvila.motorbike.dto.MotorbikeDTO;
import dev.fvila.motorbike.services.MotorbikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/motorbike")
public class MotorbikeController {
    @Autowired
    private MotorbikeService service;

    @GetMapping(value = {"", "/all"})
    public ResponseEntity<List<MotorbikeDTO>> index(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

}
