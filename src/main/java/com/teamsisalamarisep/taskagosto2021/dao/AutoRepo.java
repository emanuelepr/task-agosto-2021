package com.teamsisalamarisep.taskagosto2021.dao;

import com.teamsisalamarisep.taskagosto2021.model.Auto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AutoRepo extends MongoRepository<Auto, String> {
}
