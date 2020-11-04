package dev.fvila.motorbike.services;

import dev.fvila.motorbike.dto.MotorbikeDTO;
import dev.fvila.motorbike.models.Motorbike;
import dev.fvila.motorbike.repositories.MotorbikeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${usdvalue}")
    private Double usdValue;

    public List<MotorbikeDTO> findAll(){
        return repository.findAll().stream().map(motorbike -> convertToDTO(motorbike)).collect(Collectors.toList());
    }

    private MotorbikeDTO convertToDTO(Motorbike motorbike) {
        Double finalPrice;
        MotorbikeDTO dto = modelMapper.map(motorbike, MotorbikeDTO.class);
        System.out.println("USD VALUE PROPERTY: " + usdValue);
        finalPrice= (usdValue* motorbike.getUsdPrice());
        dto.setArsPrice(finalPrice);
        //dto es la clase/objeto
        return dto;

    }
}
