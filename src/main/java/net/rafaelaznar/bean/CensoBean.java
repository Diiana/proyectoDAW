/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.bean;

import java.util.Date;

/**
 *
 * @author al037684
 */
public class CensoBean {

    private Integer id = 0;
    private Integer id_comision = 0;
    private String nombreApellidos = "";
    private String domicilio = "";
    private String localidad = "";
    private String dni = "";
    private Date nacimiento = new Date();
    private Date alta = new Date();   
    private Integer telefono = 0;
    private String historial = "";
    private Integer id_recompensa = 0;
    private Integer añoConcesion = 0;
    private Integer edad = 0;

    
    
    
    public CensoBean() {
    }

    public CensoBean(Integer id) {
        this.id = id;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_comision() {
        return id_comision;
    }

    public void setId_comision(Integer id_comision) {
        this.id_comision = id_comision;
    }


    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public Integer getId_recompensa() {
        return id_recompensa;
    }

    public void setId_recompensa(Integer id_recompensa) {
        this.id_recompensa = id_recompensa;
    }

    public Integer getAñoConcesion() {
        return añoConcesion;
    }

    public void setAñoConcesion(Integer añoConcesion) {
        this.añoConcesion = añoConcesion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

  
    
   
   
}
