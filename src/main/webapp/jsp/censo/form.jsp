<%-- 
    Document   : form
    Author     : Diana
--%>
<form class="form-horizontal" action="#" id="formulario" name="formulario">
    <h2>Datos Fallero</h2>
    <div class="control-group">
        <label class="control-label" for="inputId">Id: </label>
        <div class="controls">
            <input type="text" id="id" name="id" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputComision">Comisión: </label>
        <div class="controls">
            <input type="text" id="comision" name="comision" size="4" />
        </div>
        <a class="btn btn-mini" id="id_comision_button" href="#"><i class="icon-search"></i></a>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputNombreApellidos">Nombre y Apellidos: </label>
        <div class="controls">
            <input type="text" id="nombreApellidos" name="nombreApellidos" size="15" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="inputDomicilio" >Domicilio: </label>
        <div class="controls">
            <input type="text" id="domicilio" name="domicilio" size="40" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputLocalidad">Localidad: </label>
        <div class="controls">
            <input type="text" id="localidad" name="localidad" size="15" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputDni">DNI: </label>
        <div class="controls">
            <input type="text" id="dni" name="dni" size="9" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputNacimiento">Nacimiento: </label>
        <div class="controls">
            <input type="text" id="nacimiento" name="nacimiento" size="15" />
        </div>
    </div>
    <script>$("#nacimiento").datepicker({
            showOn: 'both',
            buttonImageOnly: true,
            changeYear: true,
            numberOfMonths: 1});
    </script>


    
    <div class="control-group">
        <label class="control-label"  for="inputAlta">Alta: </label>
        <div class="controls">
            <input type="text" id="alta" name="alta" size="15" />
        </div>
    </div>
    <script>$("#alta").datepicker({
            showOn: 'both',
            buttonImageOnly: true,
            changeYear: true,
            numberOfMonths: 1});
    </script>

    
    <div class="control-group">
        <label class="control-label"  for="inputTelefono">Telefono: </label>
        <div class="controls">
            <input type="text" id="telefono" name="telefono" size="9" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputEdad">Historial: </label>
        <div class="controls">
            <input type="text" id="edad" name="edad" size="2" />
        </div>
    </div>

    
    <div class="control-group">
        <label class="control-label"  for="inputRecompensa">Recompensa: </label>
        <div class="controls">
            <input type="text" id="recompensa" name="recompensa" size="4" />
        </div>
        <a class="btn btn-mini" id="id_recompensa_button" href="#"><i class="icon-search"></i></a>
    </div>
    
    
    <div class="control-group">
        <label class="control-label"  for="inputAño">Año concesion: </label>
        <div class="controls">
            <input type="text" id="año" name="añoRecompensa" size="4" />
        </div>
    </div>

    
    <div class="control-group">
        <label class="control-label"  for="inputEdad">Edad: </label>
        <div class="controls">
            <input type="text" id="edad" name="edad" size="2" />
        </div>
    </div>

    

    
    <div class="control-group">
        <div class="controls">
            <button type="submit" id="submitForm" class="btn submitForm">Submit</button>
        </div>
    </div>
</form>

<script>
    $(function() {
        $("#datepicker").datepicker();
    });
</script>
