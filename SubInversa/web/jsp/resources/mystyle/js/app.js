function  agregarSub() {
    $.ajax({
        type: "GET",
        url: "../../../SubInversaControl",
        data: "opc=2&pujaSub=" + $("#pujaSub").val()
//  data: "opc=0&descripcion=" + $("#descripcion").val() + "&precio=" + $("#precio").val()
        ,
        success: function(datos) {
            $("#idVentasServ").val(0);
            $("#cantidad").val("");
            $("#precio").val("");
            $("#precioTo").val("");
            $("#reporteSubInver").html(datos);
            $("#reporteSubInver").show();
//                     validaUpdFormulario();
//                     $("#"+divAcordion).accordion({collapsible: true});
//                     $("#"+btnRegistar).button();
//                     $("#"+btnCancelar).button();
        }
    });
}

function  participar() {
    $.ajax({
        type: "GET",
        url: "../../../PreeleccionControl",
        data: "opc=2"
//  data: "opc=0&descripcion=" + $("#descripcion").val() + "&precio=" + $("#precio").val()
        ,
        success: function(datos) {
            $("#idVentasServ").val(0);
            $("#cantidad").val("");
            $("#precio").val("");
            $("#precioTo").val("");
            $("#reporteSubInver").html(datos);
            $("#reporteSubInver").show();
            $("#participar").hide();
//                     validaUpdFormulario();
//                     $("#"+divAcordion).accordion({collapsible: true});
//                     $("#"+btnRegistar).button();
//                     $("#"+btnCancelar).button();
        }
    });
}

function verSubInver() {
    $.ajax({
        type: "GET",
        url: "../../../SubInversaControl",
        data: "opc=0"
//  data: "opc=0&descripcion=" + $("#descripcion").val() + "&precio=" + $("#precio").val()
        ,
        success: function(datos) {
            $("#idVentasServ").val(0);
            $("#cantidad").val("");
            $("#precio").val("");
            $("#precioTo").val("");
            $("#reporteSubInver").html(datos);
            $("#reporteSubInver").show();
            $("#participar").hide();
//                     validaUpdFormulario();
//                     $("#"+divAcordion).accordion({collapsible: true});
//                     $("#"+btnRegistar).button();
//                     $("#"+btnCancelar).button();
        }
    });
}