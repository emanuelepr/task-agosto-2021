package com.teamsisalamarisep.taskagosto2021.service;

import com.teamsisalamarisep.taskagosto2021.dao.AutoDao;
import com.teamsisalamarisep.taskagosto2021.model.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AutoService {

    // @Autowired
    private final AutoDao autoDao;

    @Autowired //injecting dei dati dalla fakeRepository
    public AutoService(@Qualifier("fakeDao") AutoDao autoDao) {
        this.autoDao = autoDao;
    }

    public int addAuto(Auto auto) {
        return autoDao.insertAuto(auto);
    }

    public List<Auto> getAllAuto(){
        return autoDao.selectAllAuto();
    }

    public Optional<Auto> getAutoByID(UUID id){
        return autoDao.selectAutoByID(id);
    }

    public int deleteAuto(UUID id){
        return autoDao.deleteAutoByID(id);
    }

    public int updateAuto(UUID id, Auto newAuto){
        return autoDao.updateAutoByID(id, newAuto);
    }
}