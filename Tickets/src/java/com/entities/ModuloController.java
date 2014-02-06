package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "moduloController")
@ViewScoped
public class ModuloController extends AbstractController<Modulo> implements Serializable {

    public ModuloController() {
        super(Modulo.class);
    }

}
