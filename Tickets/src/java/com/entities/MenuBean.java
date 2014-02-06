
package com.entities;
  
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import javax.inject.Named;
import org.primefaces.model.menu.DefaultMenuItem;

import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;

import org.primefaces.model.menu.MenuModel;
@Named(value = "menuBean")

@ViewScoped


public class MenuBean {
    @EJB
    private ModuloFacade moduloFacade;
    
    @EJB
    private MenuFacade menuFacade;
    private MenuModel menus;
    private MenuModel modulos;

    public MenuModel getModulos() {
       // modulos=generarModulos();
        this.modulos = generarModulos();
        return modulos;
    }

    public void setModulos(MenuModel modulos) {
         
        this.modulos = modulos;
    }
    
    public  MenuModel generarModulos(){
        MenuModel vmodulos =  new DefaultMenuModel();
        DefaultSubMenu firstSubmenu = new DefaultSubMenu("Modulos");
        List <Modulo> modulos =moduloFacade.findAll();
           for( Modulo mm : modulos ){
            DefaultMenuItem item = new DefaultMenuItem(mm.getNombre());
            item.setId(FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
            item.setUrl("http://www.primefaces.org");
            item.setIcon("ui-icon-home");
            firstSubmenu.addElement(item);          
          
            } 
             vmodulos.addElement(firstSubmenu);                	
          return vmodulos;
    }
    
    public  MenuModel generarMenus(){
        MenuModel vmodulos =  new DefaultMenuModel();
             DefaultSubMenu firstSubmenu = null;
             
             DefaultMenuItem item = new DefaultMenuItem("Home");
             vmodulos.addElement(item); 
             item.setUrl("http://www.primefaces.org");
             item.setIcon("ui-icon-home");
                    
        List <Menu> menus =menuFacade.findAll();
           for( Menu mm : menus ){
               if(mm.getCorelativo()==0){
                    firstSubmenu = new DefaultSubMenu(mm.getDescripcion());
                    vmodulos.addElement(firstSubmenu); 
               }else{
                    item = new DefaultMenuItem(mm.getDescripcion());
            item.setId(FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
            item.setUrl(mm.getDireccion());
            item.setIcon("ui-icon-home");
            firstSubmenu.addElement(item);          
               }
            
          
            } 
                            	
          return vmodulos;
    }    

    public MenuModel getMenus() {
        menus = generarMenus();
        return menus;
    }


  

    public void save() {

        addMessage("Data saved");
    }

      
    public void update() {
        addMessage("Data updated");
    }
      
    public void delete() {
        addMessage("Data deleted");

    }
  
    public String redirect() {

        return "home?faces-redirect=true";
    }
      
    public void addMessage(String summary) {

        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);

        FacesContext.getCurrentInstance().addMessage(null, message);

    }
} 