/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.operaciones;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author al037684
 */
public class CensoGetminicolumns implements GenericOperation {
  
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try { 
            String data = "{\"data\": [ \"nombreApellidos\", \"domicilio\", \"localidad\", \"dni\", \"nacimiento\", \"historial\", \"edad\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("CensoGetpagesJson: View Error: " + e.getMessage());
        }
    }
    
}
