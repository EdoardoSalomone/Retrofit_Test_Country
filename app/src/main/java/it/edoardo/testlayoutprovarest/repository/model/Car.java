package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Car implements Serializable {
    private List<String> signs;
    private String side;
}