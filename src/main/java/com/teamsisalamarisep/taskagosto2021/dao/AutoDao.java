/*
package com.teamsisalamarisep.taskagosto2021.dao;

import com.teamsisalamarisep.taskagosto2021.model.Auto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AutoDao {

    int insertAuto(UUID id, Auto auto);

    default int insertAuto(Auto auto){
        UUID id = UUID.randomUUID();
        return insertAuto(id, auto);
    };

    List<Auto> selectAllAuto();

    Optional<Auto> selectAutoByID(UUID id);

    int deleteAutoByID(UUID id);

    int updateAutoByID(UUID id, Auto auto);

}
*/
