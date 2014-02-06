package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "calificacionController")
@ViewScoped
public class CalificacionController extends AbstractController<Calificacion> implements Serializable {

    public CalificacionController() {
        super(Calificacion.class);
    }

}
