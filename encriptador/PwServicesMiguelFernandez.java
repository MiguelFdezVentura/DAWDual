package pio.daw.mfl.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServicesMiguelFernandez {
	private BasicPasswordEncryptor passwordEncryptor;
		
	public PwServicesMiguelFernandez() {
		this.passwordEncryptor = new BasicPasswordEncryptor();
	}
	
	public String encriptarContrasena(String contrasena) {
		return passwordEncryptor.encryptPassword(contrasena);
	}
	
	public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
		return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
	}
}
