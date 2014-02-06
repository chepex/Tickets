package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "clientesController")
@ViewScoped
public class ClientesController extends AbstractController<Clientes> implements Serializable {

    public ClientesController() {
        super(Clientes.class);
    }

}
