package cl.icap.fullstack.modulo4.model.dao;

import cl.icap.fullstack.modulo4.model.dto.AlumnoDto;

public interface AlumnoDao {
	public int insert(AlumnoDto alumnoDto);
	public int update(AlumnoDto alumnoDto);
}
