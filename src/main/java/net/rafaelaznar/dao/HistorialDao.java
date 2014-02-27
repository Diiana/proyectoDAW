/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.rafaelaznar.dao;

import net.rafaelaznar.bean.HistorialBean;
import net.rafaelaznar.helper.Conexion;

/**
 *
 * @author Diana
 */
public class HistorialDao  extends GenericDaoImplementation<HistorialBean> {
    
    public HistorialDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"historial");
    }
    
}
