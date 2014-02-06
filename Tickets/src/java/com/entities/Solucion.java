/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
 * @author mario
 */
@Entity
@Table(name = "solucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solucion.findAll", query = "SELECT s FROM Solucion s"),
    @NamedQuery(name = "Solucion.findByIdSolucion", query = "SELECT s FROM Solucion s WHERE s.idSolucion = :idSolucion"),
    @NamedQuery(name = "Solucion.findByDescripcion", query = "SELECT s FROM Solucion s WHERE s.descripcion = :descripcion"),
    @NamedQuery(name = "Solucion.findByStatus", query = "SELECT s FROM Solucion s WHERE s.status = :status")})
public class Solucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SOLUCION")
    private Integer idSolucion;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "STATUS")
    private String status;
    @OneToMany(mappedBy = "idSolucion")
    private List<Requerimiento> requerimientoList;

    public Solucion() {
    }

    public Solucion(Integer idSolucion) {
        this.idSolucion = idSolucion;
    }

    public Integer getIdSolucion() {
        return idSolucion;
    }

    public void setIdSolucion(Integer idSolucion) {
        this.idSolucion = idSolucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public List<Requerimiento> getRequerimientoList() {
        return requerimientoList;
    }

    public void setRequerimientoList(List<Requerimiento> requerimientoList) {
        this.requerimientoList = requerimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolucion != null ? idSolucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solucion)) {
            return false;
        }
        Solucion other = (Solucion) object;
        if ((this.idSolucion == null && other.idSolucion != null) || (this.idSolucion != null && !this.idSolucion.equals(other.idSolucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Solucion[ idSolucion=" + idSolucion + " ]";
    }
    
}
