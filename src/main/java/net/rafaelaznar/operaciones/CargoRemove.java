/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.operaciones;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.rafaelaznar.helper.Conexion;
import net.rafaelaznar.bean.CargoBean;
import net.rafaelaznar.dao.CargoDao;

/**
 *
 * @author Diana
 */
public class CargoRemove implements GenericOperation {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            CargoDao oCargoDAO = new CargoDao(Conexion.getConection());
            CargoBean oCargo = new CargoBean();                                           
            oCargo.setId(Integer.parseInt(request.getParameter("id")));            
            Map<String, String> data = new HashMap<>();
            if (oCargo != null) {
                oCargoDAO.remove(oCargo);
                data.put("status", "200");
                data.put("message", "se ha eliminado el registro con id=" + oCargo.getId());
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            Gson gson = new Gson();
            String resultado = gson.toJson(data);
            return resultado;        
        } catch (Exception e) {
            throw new ServletException("CargoRemoveJson: View Error: " + e.getMessage());
        }
    }
}
