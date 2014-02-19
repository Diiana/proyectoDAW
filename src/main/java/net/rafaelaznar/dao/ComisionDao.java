/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.dao;

import net.rafaelaznar.bean.ComisionBean;
import net.rafaelaznar.helper.Conexion;

/**
 *
 * @author al037684
 */
public class ComisionDao extends GenericDaoImplementation<ComisionBean> {
    
     public ComisionDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"comision");
    }    
}
