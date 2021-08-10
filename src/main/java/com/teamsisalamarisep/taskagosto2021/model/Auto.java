package com.teamsisalamarisep.taskagosto2021.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

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

    public Auto( UUID id,
                 String targa,
                 String marca,
                 String modello,
                 Integer anno) {
        this.id = id;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public UUID getId() {
        return id;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public Integer getAnno() {
        return anno;
    }
}
