package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Demonym implements Serializable {
    private String f;
    private String m;
}
