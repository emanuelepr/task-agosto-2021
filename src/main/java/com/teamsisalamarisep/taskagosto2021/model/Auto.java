package com.teamsisalamarisep.taskagosto2021.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class Auto {
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("targa")
    private String targa;
    @JsonProperty("marca")
    private String marca;
    @JsonProperty("modello")
    private String modello;
    @JsonProperty("anno")
    private Integer anno;
}
