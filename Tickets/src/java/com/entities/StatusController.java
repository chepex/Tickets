package com.entities;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "statusController")
@ViewScoped
public class StatusController extends AbstractController<Status> implements Serializable {

    public StatusController() {
        super(Status.class);
    }

}
