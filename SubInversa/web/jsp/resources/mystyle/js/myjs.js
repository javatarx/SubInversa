
function validaxion(){
     var error = "";

	if (!$("#usuario").val()){
		error += "Introduce el usuario<br>";
		$('#usuario').focus();
	}
	if (!$("#clave").val()){
		error += "Introduce la contraseña";
		if ($("#clave").val())
		 $('#clave').focus();
	}      
    if(error.length > 0){
	   $("#msg").html('');
	   $("#msg").append(error);
	   $("#msg").slideDown();           
	}else{
	$('#msg').css('display','none');	
        var objParameter = "";

        $.ajax({
                type:'POST',
		url: '../../UsuarioControl',		
		data: 'username=' + encodeURIComponent($('#usuario').val()) + '&password=' + encodeURIComponent($('#clave').val())+'&opc='+encodeURIComponent($('#opc').val()),
		success: function(data){  
                    //alert(data);
                    objParameter=$.trim(data).split("|");                    
                    if($.trim(objParameter[0])=="5"){
                                if($.trim(objParameter[1])=='Exito'){
                                        window.location=$.trim(objParameter[2]);
                                        cerrarLogin();
                                }
                                else {
				$('#msg').html("Acceso no Autorizado");
				$('#msg').css('display','block');                                
                                }                         
                         }else{
				$('#msg').html($.trim(objParameter[1]));
				$('#msg').css('display','block');
				$('#usuario').focus();                                
                         } 
            }
         })        
	}
}