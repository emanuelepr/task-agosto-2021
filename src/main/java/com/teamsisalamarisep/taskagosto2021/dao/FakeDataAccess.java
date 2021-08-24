/*
package com.teamsisalamarisep.taskagosto2021.dao;

import com.teamsisalamarisep.taskagosto2021.model.Auto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao") //classe trattata come repository, accesso ai dati da qui
public class FakeDataAccess implements AutoDao{

    private static List<Auto> DB = new ArrayList<>();

    @Override
    public int insertAuto(UUID id, Auto auto) {
        DB.add(new Auto(id, auto.getTarga(), auto.getMarca(), auto.getModello(), auto.getAnno()));
        return 1;
    }

    @Override
    public List<Auto> selectAllAuto(){
        return DB;
    }

    @Override
    public Optional<Auto> selectAutoByID(UUID id) {
        return DB.stream()
                .filter(auto -> auto.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteAutoByID(UUID id) {
        Optional<Auto> iaAuto = selectAutoByID(id);
        if(iaAuto.isEmpty()) {
            return 0;
        }

        DB.remove(iaAuto.get());
        return 1;
    }

    @Override
    public int updateAutoByID(UUID id, Auto update) {
        return selectAutoByID(id)
                .map(auto -> {
                    int indexOfPersonToUpdate = DB.indexOf(auto);

                    if (indexOfPersonToUpdate >= 0) {
                        DB.set(indexOfPersonToUpdate, new Auto(id, update.getTarga(), update.getMarca(), update.getModello(), update.getAnno()));
                        return 1;
                    };
                    return 0;
                })
                .orElse(0);
    }
}
*/
