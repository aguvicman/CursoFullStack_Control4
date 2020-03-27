function Controlador(action) {
	$('#msg').html("");
	
	switch(action) {
	case 'insertar':
		$.get('Controller', {
			opcion : action,
			alumno_rut : $("#alumno_rut").val(),
			alumno_dv: $("#alumno_dv").val(),
			alumno_nombre: $("#alumno_nombre").val(),
			alumno_correo: $("#alumno_correo").val()
		}, function(responseText) {
			$('#msg').html(responseText);
		});
		break;
	case 'modificar':
		$.get('Controller', {
			opcion : action,
			alumno_rut : $("#alumno_rut").val(),
			alumno_dv: $("#alumno_dv").val(),
			alumno_nombre: $("#alumno_nombre").val(),
			alumno_correo: $("#alumno_correo").val()
		}, function(responseText) {
			$('#msg').html(responseText);
		});
		break;		
	default:
		break;
	};
}