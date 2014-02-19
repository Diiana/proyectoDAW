<%-- 
    Document   : list.jsp
    Author     : Diana
--%>
<%@page import="net.rafaelaznar.helper.Conexion"%>
<%@page import="net.rafaelaznar.dao.CensoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%
    CensoDao oCensoDao = new CensoDao(Conexion.getConection());
    ArrayList<String> alColumnsNames = (ArrayList<String>) oCensoDao.getColumnsNames();
    Iterator<String> oIterador = alColumnsNames.listIterator();
    String strNombreMantenimiento = "censo";
%>
<div id="<%=strNombreMantenimiento%>_list">
    <div class="span12">
        <div class="row-fluid">
            <div class="span7">       
                <h2>Censo Fallero</h2>
             
            
                <div id="pagination"></div>
            </div>
            <div class="span5">
                <div class="text-right">
                    <legend>Buscar por:</legend> 
                    <form class="navbar-form pull-right" action="Controller" method="post" id="empresaForm">
                        <fieldset>                                                                     
                            <span>
                                <select id="selectFilter" name="filter" width="80" style="width: 100px">
                            
                                    <option value="nombreApellidos" >Nombre</option>
                                    <option value="localidad" >Localidad</option>
                                    <option value="edad" >Edad</option>
                                    <option value="añoConcesion" >Año de concesión</option>
                            
                                </select>
                            </span>
                             &nbsp igual a  &nbsp  
                                <input id="inputFiltervalue" name="filtervalue" type="text" size="20" maxlength="50" value=""  width="100" style="width: 90px"/>
                          <br/>
                            <span>
                                <input type="submit" class="btn" id="btnFiltrar" name="btnFiltrar" value="Buscar <%=strNombreMantenimiento%>" />
                            </span>
                        </fieldset>
                    </form>
                </div>
                <div class="text-right">
                    <legend>Registros por página</legend> 
                    <form class="navbar-form pull-right" action="Controller" method="post" id="nrrpForm" >
                        <fieldset>                                               
                            <span>
                                <select  id="rpp" name="nrpp" value="select" style="width: 80px">                        
                                    <option>5</option>
                                    <option>10</option>
                                    <option>20</option>
                                  
                                </select>  
                            </span>                   
                        </fieldset>
                    </form>                
                </div> 
                <button class="btn" id="crear">Alta fallero</button>
            </div>
        </div>
        <br>
        <div id="datos"></div>
        <div id="datos2"></div>
    </div>

    <!-- Modales -->
    <div id="modal01" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-header"></div>
        <div class="modal-body"></div>
        <div class="modal-footer"></div>
    </div>
    <div id="modal02" class="modal container hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-header"></div>
        <div class="modal-body"></div>
        <div class="modal-footer"></div>
    </div>
</div>

