package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class PostalCode implements Serializable {
    private String format;
    private String regex;
}
