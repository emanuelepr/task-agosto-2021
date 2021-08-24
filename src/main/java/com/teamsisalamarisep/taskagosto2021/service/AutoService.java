package com.teamsisalamarisep.taskagosto2021.service;

import com.teamsisalamarisep.taskagosto2021.model.Auto;
import com.teamsisalamarisep.taskagosto2021.dao.AutoRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AutoService {

    // @Autowired
    private final AutoRepo autoRepo;

    public List<Auto> getAllAuto(){
        return autoRepo.findAll();
    }

    /*public Auto addAuto(Auto auto) {
        return autoRepo.insert(auto);
    }*/

/*
    public Optional<Auto> getAutoByID(UUID id){

        return autoDao.selectAutoByID(id);
    }

    public int deleteAuto(UUID id){

        return autoDao.deleteAutoByID(id);
    }

    public int updateAuto(UUID id, Auto newAuto){

        return autoDao.updateAutoByID(id, newAuto);
    }*/
}