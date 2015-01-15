/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliculas.sessionbeans;

import com.peliculas.entities.ShowTiming;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author csacanam
 */
@Stateless
public class ShowTimingFacade extends AbstractFacade<ShowTiming>
{

    @PersistenceContext(unitName = "PeliculasEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager()
    {
        return em;
    }

    public ShowTimingFacade()
    {
        super(ShowTiming.class);
    }

}
