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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tecnico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tecnico.findAll", query = "SELECT t FROM Tecnico t"),
    @NamedQuery(name = "Tecnico.findByIdTecnico", query = "SELECT t FROM Tecnico t WHERE t.idTecnico = :idTecnico"),
    @NamedQuery(name = "Tecnico.findByNombres", query = "SELECT t FROM Tecnico t WHERE t.nombres = :nombres"),
    @NamedQuery(name = "Tecnico.findByApellidos", query = "SELECT t FROM Tecnico t WHERE t.apellidos = :apellidos"),
    @NamedQuery(name = "Tecnico.findByTel", query = "SELECT t FROM Tecnico t WHERE t.tel = :tel"),
    @NamedQuery(name = "Tecnico.findByCorreo", query = "SELECT t FROM Tecnico t WHERE t.correo = :correo"),
    @NamedQuery(name = "Tecnico.findByStatus", query = "SELECT t FROM Tecnico t WHERE t.status = :status")})
public class Tecnico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TECNICO")
    private Integer idTecnico;
    @Size(max = 45)
    @Column(name = "NOMBRES")
    private String nombres;
    @Size(max = 45)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Size(max = 45)
    @Column(name = "TEL")
    private String tel;
    @Size(max = 45)
    @Column(name = "CORREO")
    private String correo;
    @Size(max = 45)
    @Column(name = "STATUS")
    private String status;
    @OneToMany(mappedBy = "idTecnico")
    private List<Requerimiento> requerimientoList;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuarios idUsuario;

    public Tecnico() {
    }

    public Tecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public Integer getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTecnico != null ? idTecnico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecnico)) {
            return false;
        }
        Tecnico other = (Tecnico) object;
        if ((this.idTecnico == null && other.idTecnico != null) || (this.idTecnico != null && !this.idTecnico.equals(other.idTecnico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Tecnico[ idTecnico=" + idTecnico + " ]";
    }
    
}
