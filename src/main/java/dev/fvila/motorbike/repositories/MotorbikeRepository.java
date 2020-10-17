package dev.fvila.motorbike.repositories;

import dev.fvila.motorbike.models.Motorbike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorbikeRepository extends JpaRepository<Motorbike, Integer> {
}
