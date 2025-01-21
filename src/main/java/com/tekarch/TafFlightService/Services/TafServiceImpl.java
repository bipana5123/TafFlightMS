package com.tekarch.TafFlightService.Services;

import com.tekarch.TafFlightService.Repository.TafRepository;
import com.tekarch.TafFlightService.Services.Interface.TafServiceInterface;
import com.tekarch.TafFlightService.models.Taf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TafServiceImpl  implements TafServiceInterface {

    @Autowired
    private TafRepository tafRepository;

    @Override
    public List<Taf> getAllTaf()
    {

        return tafRepository.findAll();
    }

    @Override
    public Taf getTafById(Long tafId) {

        return tafRepository.findById(tafId).orElse(null);
    }


    @Override
    public Taf postTaf(Taf taf) {

        return tafRepository.save(taf);
    }

    @Override
    public Taf putUpdateTaf(Taf taf) {

        return tafRepository.save(taf);
    }


    @Override
    public void deleteTaf(Long tafId) {

        tafRepository.deleteById(tafId);
    }

}
