package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Currency implements Serializable {
    private String name;
    private String symbol;
}
