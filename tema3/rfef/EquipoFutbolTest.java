package tema3.rfef;
import java.time.LocalDate;

public class EquipoFutbolTest {

	public static void main(String[] args) {
		// Crear instancias de las clases
		LocalDate fecha = LocalDate.of(1902, 3, 6);
        Entrenador entrenador = new Entrenador("Carlos Gómez", 45, 20, 15); // Nombre, Edad, Años de Experiencia, Títulos
        Portero portero = new Portero("Manuel Ruiz", 30); // Nombre, Edad, Goles Recibidos
        Defensa defensa1 = new Defensa("Luis Martínez", 28); // Nombre, Edad, Penaltis Cometidos
        Defensa defensa2 = new Defensa("Jorge Pérez", 26); 
        Defensa defensa3 = new Defensa("José Fernández", 29); 
        Defensa defensa4 = new Defensa("Antonio Díaz", 32); 
        Centrocampista centrocampista1 = new Centrocampista("Sergio González", 25); // Nombre, Edad, Asistencias
        Centrocampista centrocampista2 = new Centrocampista("Ricardo Sánchez", 27); 
        Centrocampista centrocampista3 = new Centrocampista("David López", 24); 
        Delantero extremoIzq = new Delantero("Miguel Silva", 23); // Nombre, Edad, Goles Anotados
        Delantero extremoDcha = new Delantero("Juan Martín", 24); 
        Delantero delanteroCentro = new Delantero("Fernando García", 26);
        
        LocalDate.of(1902, 3, 6);
        // Crear el equipo
        EquipoFutbol equipo = new EquipoFutbol(
            "Real Madrid", // Nombre del equipo
            "Madrid", // Ciudad
            "Santiago Bernabéu", // Nombre del campo
            fecha, // Fecha de fundación
            entrenador, 
            portero, 
            defensa1, 
            defensa2, 
            defensa3, 
            defensa4, 
            centrocampista1, 
            centrocampista2, 
            centrocampista3, 
            extremoIzq, 
            extremoDcha, 
            delanteroCentro
        );
        
        System.out.print(equipo.toString());
}
}