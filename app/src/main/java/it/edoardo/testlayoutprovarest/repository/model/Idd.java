package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Idd implements Serializable {
    private String root;
    private List<String> suffixes;
}