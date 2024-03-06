package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Maps implements Serializable {
    private String googleMaps;
    private String openStreetMaps;
}