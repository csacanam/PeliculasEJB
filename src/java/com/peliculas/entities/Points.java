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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author csacanam
 */
@Entity
@Table(name = "points")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Points.findAll", query = "SELECT p FROM Points p"),
    @NamedQuery(name = "Points.findById", query = "SELECT p FROM Points p WHERE p.id = :id"),
    @NamedQuery(name = "Points.findByPoints", query = "SELECT p FROM Points p WHERE p.points = :points")})
public class Points implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"ID\"")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"POINTS\"")
    private int points;

    public Points() {
    }

    public Points(Integer id) {
        this.id = id;
    }

    public Points(Integer id, int points) {
        this.id = id;
        this.points = points;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Points)) {
            return false;
        }
        Points other = (Points) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.peliculas.entities.Points[ id=" + id + " ]";
    }
    
}
