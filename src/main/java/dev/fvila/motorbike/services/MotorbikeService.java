package dev.fvila.motorbike.services;

import dev.fvila.motorbike.dto.MotorbikeDTO;
import dev.fvila.motorbike.repositories.MotorbikeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MotorbikeService {
    @Autowired
    private MotorbikeRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public List<MotorbikeDTO> findAll(){
        return repository.findAll().stream().map(motorbike -> modelMapper.map(motorbike, MotorbikeDTO.class)).collect(Collectors.toList());
    }
}
