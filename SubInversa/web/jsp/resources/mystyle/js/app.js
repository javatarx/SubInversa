function  agregarSub() {
                $.ajax({
                    type: "GET",
                    url: "../../../SubInversaControl",
                    data: "opc=0"
//                    data: "opc=0&descripcion=" + $("#descripcion").val() + "&precio=" + $("#precio").val()
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
