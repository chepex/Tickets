/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author mario
 */
@Stateless
public class ModuloFacade extends AbstractFacade<Modulo> {
    @PersistenceContext(unitName = "TicketsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ModuloFacade() {
        super(Modulo.class);
    }
    
    @Override
    public List<Modulo> findAll() {
       	TypedQuery<Modulo> q;
        q = em.createNamedQuery("Modulo.findAll", Modulo.class );
        return q.getResultList();
    } 
    
}
