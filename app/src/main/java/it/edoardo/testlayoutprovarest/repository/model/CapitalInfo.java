package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CapitalInfo implements Serializable {
    private List<Double> latlng;
}
