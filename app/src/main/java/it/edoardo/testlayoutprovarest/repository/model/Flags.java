package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Flags implements Serializable {
    private String png;
    private String svg;
    private String alt;
}