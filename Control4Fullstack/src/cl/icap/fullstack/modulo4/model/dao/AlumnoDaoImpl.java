package cl.icap.fullstack.modulo4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import cl.icap.fullstack.modulo4.model.dto.AlumnoDto;

public class AlumnoDaoImpl implements AlumnoDao {
	private Connection conn;
	public String insert = "INSERT INTO alumno VALUES (?,?,?,?)";
	public String update = "UPDATE alumno SET alumno_rut=?, alumno_dv=?, alumno_nombre=?, alumno_correo=? WHERE alumno_rut=?";
	
	public AlumnoDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int insert(AlumnoDto alumnoDto) {
		int retorno=0;
		try {
			PreparedStatement stmt=conn.prepareStatement(insert);  
			stmt.setInt(1,alumnoDto.getALUMNO_RUT());
			stmt.setString(2,alumnoDto.getALUMNO_DV());
			stmt.setString(3,alumnoDto.getALUMNO_NOMBRE());  
			stmt.setString(4,alumnoDto.getALUMNO_CORREO());  
			retorno = stmt.executeUpdate();  
		} catch(Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}

	@Override
	public int update(AlumnoDto alumnoDto) {
		int retorno=0;
		try {
			PreparedStatement stmt=conn.prepareStatement(update);  
			stmt.setInt(1,alumnoDto.getALUMNO_RUT());
			stmt.setString(2,alumnoDto.getALUMNO_DV());
			stmt.setString(3,alumnoDto.getALUMNO_NOMBRE());  
			stmt.setString(4,alumnoDto.getALUMNO_CORREO());
			stmt.setInt(5,alumnoDto.getALUMNO_RUT());  
			retorno = stmt.executeUpdate();  
		} catch(Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
}
