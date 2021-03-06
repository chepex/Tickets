/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mario
 */
@Stateless
public class RequerimientoFacade extends AbstractFacade<Requerimiento> {
    @PersistenceContext(unitName = "TicketsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RequerimientoFacade() {
        super(Requerimiento.class);
    }
    
}
