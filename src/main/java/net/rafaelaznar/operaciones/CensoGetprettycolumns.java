/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.operaciones;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Diana
 */
public class CensoGetprettycolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try { 
            String data = "{\"data\": [\"id\", \"comision\", \"nombreApellidos\", \"domicilio\", \"localidad\", \"dni\", \"nacimiento\", \"alta\", \"telefono\", \"historial\", \"recompensa\", \"añoConcesion\", \"edad\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("CensoGetpagesJson: View Error: " + e.getMessage());
        }
    }
}
