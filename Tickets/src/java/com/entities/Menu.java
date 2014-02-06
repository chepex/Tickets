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
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByIdMenu", query = "SELECT m FROM Menu m WHERE m.idMenu = :idMenu"),
    @NamedQuery(name = "Menu.findByDescripcion", query = "SELECT m FROM Menu m WHERE m.descripcion = :descripcion"),
    @NamedQuery(name = "Menu.findByDireccion", query = "SELECT m FROM Menu m WHERE m.direccion = :direccion"),
    @NamedQuery(name = "Menu.findByCorelativo", query = "SELECT m FROM Menu m WHERE m.corelativo = :corelativo")})
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MENU")
    private Integer idMenu;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "CORELATIVO")
    private Integer corelativo;
    @JoinColumn(name = "ID_MODULO", referencedColumnName = "ID_MODULO")
    @ManyToOne
    private Modulo idModulo;
    @OneToMany(mappedBy = "idMenu")
    private List<RolesXMenu> rolesXMenuList;

    public Menu() {
    }

    public Menu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCorelativo() {
        return corelativo;
    }

    public void setCorelativo(Integer corelativo) {
        this.corelativo = corelativo;
    }

    public Modulo getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Modulo idModulo) {
        this.idModulo = idModulo;
    }

    @XmlTransient
    public List<RolesXMenu> getRolesXMenuList() {
        return rolesXMenuList;
    }

    public void setRolesXMenuList(List<RolesXMenu> rolesXMenuList) {
        this.rolesXMenuList = rolesXMenuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMenu != null ? idMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idMenu == null && other.idMenu != null) || (this.idMenu != null && !this.idMenu.equals(other.idMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Menu[ idMenu=" + idMenu + " ]";
    }
    
}
