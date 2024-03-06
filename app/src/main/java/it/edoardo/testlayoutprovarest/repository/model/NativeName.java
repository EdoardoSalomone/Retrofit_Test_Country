package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class NativeName implements Serializable {
    private String official;
    private String common;
}