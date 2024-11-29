package tema3.profesor;

import java.util.Calendar;

public class ProfesorTest{

    public static void main(String[] args) {
        
    	// Crear una instancia de Calendar para la fecha de inicio de interinidad
        Calendar fechaInicio1 = Calendar.getInstance();
        // Establecer la fecha: 1 de junio de 2020 (año, mes, día)
        fechaInicio1.set(2020, Calendar.JUNE, 1);  // Mes 5 en Calendar es junio (0 basado)
        
        Calendar fechaInicio2 = Calendar.getInstance();
        // Establecer la fecha: 15 de agosto de 2018
        fechaInicio2.set(2018, Calendar.AUGUST, 15); // Mes 7 en Calendar es agosto (0 basado)

        // Crear profesores interinos
        ProfesorInterinoFernandezVenturaLopez profInterino1 = new ProfesorInterinoFernandezVenturaLopez(
            "12345678A", "Juan Antonio", "García", 35, 
            ProfesorFernandezVenturaLopez.modulo.PROGRAMACION, fechaInicio1);
        
        ProfesorInterinoFernandezVenturaLopez profInterino2 = new ProfesorInterinoFernandezVenturaLopez(
            "23456789B", "Laura", "García", 42, 
            ProfesorFernandezVenturaLopez.modulo.MARCAS, fechaInicio2);
        
        // Calcular nómina para profesores interinos
        profInterino1.importeNomina(2000.0f, 500.0f);
        profInterino2.importeNomina(2200.0f, 450.0f);
        
        // Crear profesores titulares
        ProfesorTitularFernandezVenturaLopez profTitular1 = new ProfesorTitularFernandezVenturaLopez(
            "34567890C", "Juan Antonia", "García", 50, 
            ProfesorFernandezVenturaLopez.modulo.BBDD, 15);
        
        ProfesorTitularFernandezVenturaLopez profTitular2 = new ProfesorTitularFernandezVenturaLopez(
            "45678901D", "Carlos", "López", 38, 
            ProfesorFernandezVenturaLopez.modulo.ENTORNOS, 10);
        
        // Calcular nómina para profesores titulares
        profTitular1.importeNomina(3000.0f, 700.0f);
        profTitular2.importeNomina(2800.0f, 600.0f);
        
        // Imprimir información de los profesores
        System.out.println(profInterino1);
        System.out.println(profInterino2);
        System.out.println(profTitular1);
        System.out.println(profTitular2);
    }
}

