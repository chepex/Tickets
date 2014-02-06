package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "menuController")
@ViewScoped
public class MenuController extends AbstractController<Menu> implements Serializable {

    public MenuController() {
        super(Menu.class);
    }

}
