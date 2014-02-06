package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "rolesXMenuController")
@ViewScoped
public class RolesXMenuController extends AbstractController<RolesXMenu> implements Serializable {

    public RolesXMenuController() {
        super(RolesXMenu.class);
    }

}
