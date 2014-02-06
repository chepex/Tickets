package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "usuariosController")
@ViewScoped
public class UsuariosController extends AbstractController<Usuarios> implements Serializable {

    public UsuariosController() {
        super(Usuarios.class);
    }

}
