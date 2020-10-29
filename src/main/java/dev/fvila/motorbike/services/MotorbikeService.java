package dev.fvila.motorbike.services;

import dev.fvila.motorbike.dto.MotorbikeDTO;
import dev.fvila.motorbike.models.Motorbike;
import dev.fvila.motorbike.repositories.MotorbikeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ScheduledExecutorTask;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MotorbikeService {
    @Autowired
    private MotorbikeRepository repository;

    @Autowired
    private ModelMapper modelMapper;
    private static final double USD_VALUE= 175.0;
    double precioFinal;


    public List<MotorbikeDTO> findAll(){
        return repository.findAll().stream().map(motorbike -> convertToDTO(motorbike)).collect(Collectors.toList());
    }

    private MotorbikeDTO convertToDTO(Motorbike motorbike) {
        MotorbikeDTO dto = modelMapper.map(motorbike, MotorbikeDTO.class);
        precioFinal= (USD_VALUE* motorbike.getUsdPrice());
        dto.setPrecioarg(precioFinal);
        //dto es la clase/objeto
        return dto;

    }
}
