package com.teamsisalamarisep.taskagosto2021.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Document
public class Auto {
    @Id
    private String id;
    //@Indexed(unique = true)
    private String targa;
    private String marca;
    private String modello;
    private Integer anno;
    private LocalDateTime dataCreazione;

    public Auto(String targa, String marca, String modello, Integer anno, LocalDateTime dataCreazione) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.dataCreazione = dataCreazione;
    }
}
