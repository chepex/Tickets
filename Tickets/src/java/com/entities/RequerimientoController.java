package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "requerimientoController")
@ViewScoped
public class RequerimientoController extends AbstractController<Requerimiento> implements Serializable {

    public RequerimientoController() {
        super(Requerimiento.class);
    }

}
