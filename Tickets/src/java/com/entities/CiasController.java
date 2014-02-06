package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "ciasController")
@ViewScoped
public class CiasController extends AbstractController<Cias> implements Serializable {

    public CiasController() {
        super(Cias.class);
    }

}
