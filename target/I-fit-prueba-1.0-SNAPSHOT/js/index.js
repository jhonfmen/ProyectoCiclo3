

$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });
    
    $("#aceptar-eliminar-cuenta-btn").click(function (event) {
        event.preventDefault();
        eliminarCuenta();
    });

});

function autenticarUsuario() {

    let correo = $("#correo").val();
    let contrasena = $("#contrasena").val();
    console.log("estoy aqui");
    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            correo: correo,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult !== false) {
                $("#login-error").addClass("d-none");
                let correo = parsedResult['correo'];
                document.location.href = "home.html?correo="+correo;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}

function registrarUsuario() {

    let nombre = $("#input-nombre").val();
    let contrasena = $("#input-contrasena").val();
    let contrasenaConfirmacion = $("#input-contrasena-repeat").val();
    let correo = $("#input-correo").val();
    
    console.log(contrasena);
    console.log(contrasenaConfirmacion);

    if (contrasena === contrasenaConfirmacion) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegister",
            data: $.param({
                nombre: nombre,
                contrasena: contrasena,
                correo: correo
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult !== false) {
                    $("#register-error").addClass("d-none");
                    let correo = parsedResult['correo'];
                    document.location.href = "home.html?correo=" + correo;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del usuario");
                }
            }
        });
    } else {
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Las contraseñas no coinciden");
    }
}

function eliminarCuenta() {
        let correo = new URL(location.href).searchParams.get("correo");
        $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioEliminar",
        data: $.param({
            correo: correo
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult !== false) {
                document.location.href = "index.html";
                console.log("Usuario eliminado");

            } else {
                console.log("Error eliminando el usuario");
            }
        }
    });
   
}