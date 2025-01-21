package com.tekarch.TafFlightService.Services.Interface;

import com.tekarch.TafFlightService.models.Taf;
import java.util.List;

public interface TafServiceInterface {

    List<Taf> getAllTaf();
    Taf getTafById(Long tafID);

    Taf postTaf(Taf taf);
    Taf putUpdateTaf(Taf taf);
    void deleteTaf(Long tafId);
}