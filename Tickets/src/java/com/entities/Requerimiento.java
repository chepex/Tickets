/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mario
 */
@Entity
@Table(name = "requerimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requerimiento.findAll", query = "SELECT r FROM Requerimiento r"),
    @NamedQuery(name = "Requerimiento.findByIdRequerimiento", query = "SELECT r FROM Requerimiento r WHERE r.idRequerimiento = :idRequerimiento"),
    @NamedQuery(name = "Requerimiento.findByTitulo", query = "SELECT r FROM Requerimiento r WHERE r.titulo = :titulo"),
    @NamedQuery(name = "Requerimiento.findByDescripcion", query = "SELECT r FROM Requerimiento r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "Requerimiento.findByDescCliente", query = "SELECT r FROM Requerimiento r WHERE r.descCliente = :descCliente"),
    @NamedQuery(name = "Requerimiento.findByDescTecnico", query = "SELECT r FROM Requerimiento r WHERE r.descTecnico = :descTecnico")})
public class Requerimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_REQUERIMIENTO")
    private Integer idRequerimiento;
    @Size(max = 45)
    @Column(name = "TITULO")
    private String titulo;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "DESC_CLIENTE")
    private String descCliente;
    @Size(max = 45)
    @Column(name = "DESC_TECNICO")
    private String descTecnico;
    @JoinColumn(name = "ID_SOLUCION", referencedColumnName = "ID_SOLUCION")
    @ManyToOne
    private Solucion idSolucion;
    @JoinColumn(name = "ID_CATEGORIA", referencedColumnName = "ID_CATEGORIA")
    @ManyToOne
    private Categoria idCategoria;
    @JoinColumn(name = "ID_STATUS", referencedColumnName = "ID_STATUS")
    @ManyToOne
    private Status idStatus;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
    @ManyToOne
    private Clientes idCliente;
    @JoinColumn(name = "ID_COD_CIA", referencedColumnName = "id_COD_CIA")
    @ManyToOne
    private Cias idCodCia;
    @JoinColumn(name = "ID_TECNICO", referencedColumnName = "ID_TECNICO")
    @ManyToOne
    private Tecnico idTecnico;
    @JoinColumn(name = "ID_CALIFICACION", referencedColumnName = "ID_CALIFICACION")
    @ManyToOne
    private Calificacion idCalificacion;

    public Requerimiento() {
    }

    public Requerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescCliente() {
        return descCliente;
    }

    public void setDescCliente(String descCliente) {
        this.descCliente = descCliente;
    }

    public String getDescTecnico() {
        return descTecnico;
    }

    public void setDescTecnico(String descTecnico) {
        this.descTecnico = descTecnico;
    }

    public Solucion getIdSolucion() {
        return idSolucion;
    }

    public void setIdSolucion(Solucion idSolucion) {
        this.idSolucion = idSolucion;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Status getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Status idStatus) {
        this.idStatus = idStatus;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    public Cias getIdCodCia() {
        return idCodCia;
    }

    public void setIdCodCia(Cias idCodCia) {
        this.idCodCia = idCodCia;
    }

    public Tecnico getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Tecnico idTecnico) {
        this.idTecnico = idTecnico;
    }

    public Calificacion getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Calificacion idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requerimiento)) {
            return false;
        }
        Requerimiento other = (Requerimiento) object;
        if ((this.idRequerimiento == null && other.idRequerimiento != null) || (this.idRequerimiento != null && !this.idRequerimiento.equals(other.idRequerimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Requerimiento[ idRequerimiento=" + idRequerimiento + " ]";
    }
    
}
