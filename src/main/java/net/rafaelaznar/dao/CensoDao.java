/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.dao;

import net.rafaelaznar.bean.CensoBean;
import net.rafaelaznar.helper.Conexion;

/**
 *
 * @author al037684
 */
public class CensoDao extends GenericDaoImplementation<CensoBean> {
    
    public CensoDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"censo");
    }
    
}
