package pio.daw.mfl.encriptador;

public class PwServicesMiguelFernandezTest {
	public static void main(String[] args) {
		PwServicesMiguelFernandez servicio = new PwServicesMiguelFernandez();
        String password = "miSuperPassword";
        String passwordEncriptada = servicio.encriptarContrasena(password);
        System.out.println("Prueba de Miguel Fernandez");
        System.out.println("La contraseña encriptada es: " + passwordEncriptada);

        // Verificar si la contraseña es válida
        boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
        System.out.println("La contraseña encriptada es válida: " + esValida);
    }
}
