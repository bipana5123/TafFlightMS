package com.tekarch.TafFlightService.models;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Taf {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tafId;

    @Column(name = "user_id", nullable = false, unique = true, length = 20)
    private String userId;

    @Column(name = "flight_id", nullable = false, length = 50)
    private String flightId;

    @Column(name = "status", nullable = false, length = 50)
    private String status;



    @Column(name = "created_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "updated_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist()
    {
        this.createdAt= LocalDateTime.now();

    }
    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}