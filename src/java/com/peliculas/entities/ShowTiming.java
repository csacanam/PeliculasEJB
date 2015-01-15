/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliculas.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "show_timing")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "ShowTiming.findAll", query = "SELECT s FROM ShowTiming s"),
    @NamedQuery(name = "ShowTiming.findById", query = "SELECT s FROM ShowTiming s WHERE s.id = :id"),
    @NamedQuery(name = "ShowTiming.findByDay", query = "SELECT s FROM ShowTiming s WHERE s.day = :day")
})
public class ShowTiming implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"ID\"")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"DAY\"")
    private int day;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "showTiming")
    private Sales sales;
    @JoinColumn(name = "\"TIMING_ID\"", referencedColumnName = "\"ID\"")
    @ManyToOne(optional = false)
    private Timeslot timingId;
    @JoinColumn(name = "\"THEATER_ID\"", referencedColumnName = "\"ID\"")
    @ManyToOne(optional = false)
    private Theater theaterId;
    @JoinColumn(name = "\"MOVIE_ID\"", referencedColumnName = "\"ID\"")
    @ManyToOne(optional = false)
    private Movie movieId;

    public ShowTiming()
    {
    }

    public ShowTiming(Integer id)
    {
        this.id = id;
    }

    public ShowTiming(Integer id, int day)
    {
        this.id = id;
        this.day = day;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public Sales getSales()
    {
        return sales;
    }

    public void setSales(Sales sales)
    {
        this.sales = sales;
    }

    public Timeslot getTimingId()
    {
        return timingId;
    }

    public void setTimingId(Timeslot timingId)
    {
        this.timingId = timingId;
    }

    public Theater getTheaterId()
    {
        return theaterId;
    }

    public void setTheaterId(Theater theaterId)
    {
        this.theaterId = theaterId;
    }

    public Movie getMovieId()
    {
        return movieId;
    }

    public void setMovieId(Movie movieId)
    {
        this.movieId = movieId;
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
        if (!(object instanceof ShowTiming))
        {
            return false;
        }
        ShowTiming other = (ShowTiming) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return id + " - " + day;
    }

}
