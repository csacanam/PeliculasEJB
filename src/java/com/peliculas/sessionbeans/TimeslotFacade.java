/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliculas.sessionbeans;

import com.peliculas.entities.Timeslot;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author csacanam
 */
@Stateless
public class TimeslotFacade extends AbstractFacade<Timeslot> {
    @PersistenceContext(unitName = "PeliculasEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TimeslotFacade() {
        super(Timeslot.class);
    }
    
}
