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
@Table(name = "timeslot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Timeslot.findAll", query = "SELECT t FROM Timeslot t"),
    @NamedQuery(name = "Timeslot.findById", query = "SELECT t FROM Timeslot t WHERE t.id = :id"),
    @NamedQuery(name = "Timeslot.findByStartTime", query = "SELECT t FROM Timeslot t WHERE t.startTime = :startTime"),
    @NamedQuery(name = "Timeslot.findByEndTime", query = "SELECT t FROM Timeslot t WHERE t.endTime = :endTime")})
public class Timeslot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"ID\"")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "\"START_TIME\"")
    private String startTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "\"END_TIME\"")
    private String endTime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "timingId")
    private List<ShowTiming> showTimingList;

    public Timeslot() {
    }

    public Timeslot(Integer id) {
        this.id = id;
    }

    public Timeslot(Integer id, String startTime, String endTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @XmlTransient
    public List<ShowTiming> getShowTimingList() {
        return showTimingList;
    }

    public void setShowTimingList(List<ShowTiming> showTimingList) {
        this.showTimingList = showTimingList;
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
        if (!(object instanceof Timeslot)) {
            return false;
        }
        Timeslot other = (Timeslot) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.peliculas.entities.Timeslot[ id=" + id + " ]";
    }
    
}
