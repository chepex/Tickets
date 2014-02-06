package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "categoriaController")
@ViewScoped
public class CategoriaController extends AbstractController<Categoria> implements Serializable {

    public CategoriaController() {
        super(Categoria.class);
    }

}
