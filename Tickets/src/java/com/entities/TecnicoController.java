package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "tecnicoController")
@ViewScoped
public class TecnicoController extends AbstractController<Tecnico> implements Serializable {

    public TecnicoController() {
        super(Tecnico.class);
    }

}
