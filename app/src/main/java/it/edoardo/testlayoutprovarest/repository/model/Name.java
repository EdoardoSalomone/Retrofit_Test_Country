package it.edoardo.testlayoutprovarest.repository.model;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

@Data
public class Name implements Serializable {
    private String common;
    private String official;
    private Map<String, NativeName> nativeName;
}
