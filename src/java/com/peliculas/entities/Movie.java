/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliculas.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author csacanam
 */
@Entity
@Table(name = "movie")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m"),
    @NamedQuery(name = "Movie.findById", query = "SELECT m FROM Movie m WHERE m.id = :id"),
    @NamedQuery(name = "Movie.findByName", query = "SELECT m FROM Movie m WHERE m.name = :name"),
    @NamedQuery(name = "Movie.findByActors", query = "SELECT m FROM Movie m WHERE m.actors = :actors")
})
public class Movie implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"ID\"")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "\"NAME\"")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "\"ACTORS\"")
    private String actors;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movieId")
    private List<ShowTiming> showTimingList;

    public Movie()
    {
    }

    public Movie(Integer id)
    {
        this.id = id;
    }

    public Movie(Integer id, String name, String actors)
    {
        this.id = id;
        this.name = name;
        this.actors = actors;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getActors()
    {
        return actors;
    }

    public void setActors(String actors)
    {
        this.actors = actors;
    }

    @XmlTransient
    public List<ShowTiming> getShowTimingList()
    {
        return showTimingList;
    }

    public void setShowTimingList(List<ShowTiming> showTimingList)
    {
        this.showTimingList = showTimingList;
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
        if (!(object instanceof Movie))
        {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.peliculas.entities.Movie[ id=" + id + " ]";
    }

}
