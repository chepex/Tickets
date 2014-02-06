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
@Table(name = "cias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cias.findAll", query = "SELECT c FROM Cias c"),
    @NamedQuery(name = "Cias.findByIdCODCIA", query = "SELECT c FROM Cias c WHERE c.idCODCIA = :idCODCIA"),
    @NamedQuery(name = "Cias.findByDescripcion", query = "SELECT c FROM Cias c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Cias.findByStatus", query = "SELECT c FROM Cias c WHERE c.status = :status")})
public class Cias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_COD_CIA")
    private Integer idCODCIA;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "STATUS")
    private String status;
    @OneToMany(mappedBy = "idCodCia")
    private List<Requerimiento> requerimientoList;

    public Cias() {
    }

    public Cias(Integer idCODCIA) {
        this.idCODCIA = idCODCIA;
    }

    public Integer getIdCODCIA() {
        return idCODCIA;
    }

    public void setIdCODCIA(Integer idCODCIA) {
        this.idCODCIA = idCODCIA;
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
        hash += (idCODCIA != null ? idCODCIA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cias)) {
            return false;
        }
        Cias other = (Cias) object;
        if ((this.idCODCIA == null && other.idCODCIA != null) || (this.idCODCIA != null && !this.idCODCIA.equals(other.idCODCIA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Cias[ idCODCIA=" + idCODCIA + " ]";
    }
    
}
