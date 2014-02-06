package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "rolController")
@ViewScoped
public class RolController extends AbstractController<Rol> implements Serializable {

    public RolController() {
        super(Rol.class);
    }

}
