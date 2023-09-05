package com.taps.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taps.location.entities.Location;

public interface Locationrepository extends JpaRepository<Location, Integer> {

}
