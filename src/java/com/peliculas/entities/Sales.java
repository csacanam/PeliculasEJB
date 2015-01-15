/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliculas.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author csacanam
 */
@Entity
@Table(name = "sales")
@XmlRootElement
@NamedQueries(
        {
            @NamedQuery(name = "Sales.findAll", query = "SELECT s FROM Sales s"),
            @NamedQuery(name = "Sales.findById", query = "SELECT s FROM Sales s WHERE s.id = :id"),
            @NamedQuery(name = "Sales.findByAmount", query = "SELECT s FROM Sales s WHERE s.amount = :amount")
        })
public class Sales implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"ID\"")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"AMOUNT\"")
    private double amount;
    @JoinColumn(name = "\"ID\"", referencedColumnName = "\"ID\"", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ShowTiming showTiming;

    public Sales()
    {
    }

    public Sales(Integer id)
    {
        this.id = id;
    }

    public Sales(Integer id, double amount)
    {
        this.id = id;
        this.amount = amount;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public ShowTiming getShowTiming()
    {
        return showTiming;
    }

    public void setShowTiming(ShowTiming showTiming)
    {
        this.showTiming = showTiming;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sales))
        {
            return false;
        }
        Sales other = (Sales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return id + " - " + amount;
    }

}
