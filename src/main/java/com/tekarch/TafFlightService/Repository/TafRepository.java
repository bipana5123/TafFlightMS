package com.tekarch.TafFlightService.Repository;

import com.tekarch.TafFlightService.models.Taf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TafRepository extends JpaRepository<Taf, Long> {

}