package cl.icap.fullstack.modulo4.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.icap.fullstack.modulo4.model.dao.AlumnoDaoImpl;
import cl.icap.fullstack.modulo4.model.dao.OracleConnection;
import cl.icap.fullstack.modulo4.model.dto.AlumnoDto;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

    public Controller() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OracleConnection oracleConnection = new OracleConnection();
		AlumnoDaoImpl alumnoDaoImpl;
		String retorno="Sin cambios";
		
		switch(request.getParameter("opcion")) {
		case "insertar":
			if (oracleConnection.openConn()) {
				alumnoDaoImpl = new AlumnoDaoImpl(oracleConnection.getConn());
				AlumnoDto alumnoDto = new AlumnoDto();
				alumnoDto.setALUMNO_RUT(Integer.parseInt(request.getParameter("alumno_rut")));
				alumnoDto.setALUMNO_DV(request.getParameter("alumno_dv"));
				alumnoDto.setALUMNO_NOMBRE(request.getParameter("alumno_nombre"));
				alumnoDto.setALUMNO_CORREO(request.getParameter("alumno_correo"));
				if (alumnoDaoImpl.insert(alumnoDto) > 0) {
					retorno = "Alumno insertado";
				};
				oracleConnection.closeConn();
			}
			break;
		case "modificar":
			if (oracleConnection.openConn()) {
				alumnoDaoImpl = new AlumnoDaoImpl(oracleConnection.getConn());
				AlumnoDto alumnoDto = new AlumnoDto();
				alumnoDto.setALUMNO_RUT(Integer.parseInt(request.getParameter("alumno_rut")));
				alumnoDto.setALUMNO_DV(request.getParameter("alumno_dv"));
				alumnoDto.setALUMNO_NOMBRE(request.getParameter("alumno_nombre"));
				alumnoDto.setALUMNO_CORREO(request.getParameter("alumno_correo"));
				if (alumnoDaoImpl.update(alumnoDto) > 0 ) {
					retorno = "Alumno modificado";
				};
				oracleConnection.closeConn();
			}
			break;
		};
	
	  response.setContentType("text/plain");
	  response.setCharacterEncoding("UTF-8");
	  response.getWriter().write(retorno);  
	}
}
