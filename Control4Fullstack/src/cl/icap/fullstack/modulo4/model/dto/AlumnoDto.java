package cl.icap.fullstack.modulo4.model.dto;

public class AlumnoDto {
	private int ALUMNO_RUT;
	private String ALUMNO_DV;
	private String ALUMNO_NOMBRE;
	private String ALUMNO_CORREO;
	
	public AlumnoDto() {
		
	}
	
	public int getALUMNO_RUT() {
		return ALUMNO_RUT;
	}
	public void setALUMNO_RUT(int aLUMNO_RUT) {
		ALUMNO_RUT = aLUMNO_RUT;
	}
	public String getALUMNO_DV() {
		return ALUMNO_DV;
	}
	public void setALUMNO_DV(String aLUMNO_DV) {
		ALUMNO_DV = aLUMNO_DV;
	}
	public String getALUMNO_NOMBRE() {
		return ALUMNO_NOMBRE;
	}
	public void setALUMNO_NOMBRE(String aLUMNO_NOMBRE) {
		ALUMNO_NOMBRE = aLUMNO_NOMBRE;
	}
	public String getALUMNO_CORREO() {
		return ALUMNO_CORREO;
	}
	public void setALUMNO_CORREO(String aLUMNO_CORREO) {
		ALUMNO_CORREO = aLUMNO_CORREO;
	}	
}
