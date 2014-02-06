package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "solucionController")
@ViewScoped
public class SolucionController extends AbstractController<Solucion> implements Serializable {

    public SolucionController() {
        super(Solucion.class);
    }

}
