package tema3.rfef;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LigaTest {

    public static void main(String[] args) {
        // Crear los jugadores de los equipos
    	Portero portero1_1 = new Portero("Marc-André ter Stegen", 31);
    	Portero portero1_2 = new Portero("Thibaut Courtois", 31);       
    	Portero portero1_3 = new Portero("Jan Oblak", 31);        
    	Portero portero1_4 = new Portero("Bono", 32);

        Defensa central1_1 = new Defensa("Gerard Piqué", 36);
        Defensa central2_1 = new Defensa("Jordi Alba", 35);
        Defensa central3_1 = new Defensa("Clement Lenglet", 28);
        Defensa central4_1 = new Defensa("Éric García", 23);
        
        Defensa central1_2 = new Defensa("Sergio Ramos", 38);
        Defensa central2_2 = new Defensa("Éder Militão", 26);
        Defensa central3_2 = new Defensa("David Alaba", 31);
        Defensa central4_2 = new Defensa("Antonio Rudiger", 31);
        
        Defensa central1_3 = new Defensa("José María Giménez", 29);
        Defensa central2_3 = new Defensa("Stefan Savić", 33);
        Defensa central3_3 = new Defensa("Mario Hermoso", 28);
        Defensa central4_3 = new Defensa("Felipe Monteiro", 34);
        
        Defensa central1_4 = new Defensa("Jules Koundé", 25);
        Defensa central2_4 = new Defensa("Diego Carlos", 31);
        Defensa central3_4 = new Defensa("Karim Rekik", 29);
        Defensa central4_4 = new Defensa("Fernando", 35);
        
        Centrocampista centro1_1 = new Centrocampista("Sergio Busquets", 35);
        Centrocampista centro2_1 = new Centrocampista("Frenkie de Jong", 26);
        Centrocampista centro3_1 = new Centrocampista("Pedri González", 21);
        
        Centrocampista centro1_2 = new Centrocampista("Luka Modrić", 38);
        Centrocampista centro2_2 = new Centrocampista("Casemiro", 32);
        Centrocampista centro3_2 = new Centrocampista("Toni Kroos", 34);
        
        Centrocampista centro1_3 = new Centrocampista("Koke", 32);
        Centrocampista centro2_3 = new Centrocampista("Saúl Ñíguez", 29);
        Centrocampista centro3_3 = new Centrocampista("Rodri Hernández", 28);
        
        Centrocampista centro1_4 = new Centrocampista("Ivan Rakitić", 36);
        Centrocampista centro2_4 = new Centrocampista("Jordán Oliver", 29);
        Centrocampista centro3_4 = new Centrocampista("Oscar Rodríguez", 26);
        
        Delantero delantero1_1 = new Delantero("Robert Lewandowski", 35);
        Delantero delantero2_1 = new Delantero("Ansu Fati", 21);
        Delantero delantero3_1 = new Delantero("Ferran Torres", 24);

        Delantero delantero1_2 = new Delantero("Karim Benzema", 36);
        Delantero delantero2_2 = new Delantero("Vinícius Júnior", 23);
        Delantero delantero3_2 = new Delantero("Rodrygo Goes", 23);
        
        Delantero delantero1_3 = new Delantero("Antoine Griezmann", 33);
        Delantero delantero2_3 = new Delantero("Álvaro Morata", 31);
        Delantero delantero3_3 = new Delantero("João Félix", 24);
        
        Delantero delantero1_4 = new Delantero("Youssef En-Nesyri", 27);
        Delantero delantero2_4 = new Delantero("Lucas Ocampos", 29);
        Delantero delantero3_4 = new Delantero("Erik Lamela", 32);

        Entrenador entrenador1_1 = new Entrenador("Xavi Hernández", 44, 15, 2);
        Entrenador entrenador1_2 = new Entrenador("Carlo Ancelotti", 64, 28, 5);
        Entrenador entrenador1_3 = new Entrenador("Diego Simeone", 54, 18, 11);
        Entrenador entrenador1_4 = new Entrenador("Jorge Sampaoli", 63, 21, 4);

        // Crear los equipos
        EquipoFutbol equipo1 = new EquipoFutbol("FC Barcelona", "Barcelona", "Camp Nou", LocalDate.of(1899, 11, 29), 
                                                entrenador1_1, portero1_1, central1_1, central2_1, central3_1, central4_1, 
                                                centro1_1, centro2_1, centro3_1, delantero1_1, delantero2_1, delantero3_1);
        EquipoFutbol equipo2 = new EquipoFutbol("Real Madrid", "Madrid", "Santiago Bernabéu", LocalDate.of(1902, 3, 6), 
								        		entrenador1_2, portero1_2, central1_2, central2_2, central3_2, central4_2, 
								                centro1_2, centro2_2, centro3_2, delantero1_2, delantero2_2, delantero3_2);
        EquipoFutbol equipo3 = new EquipoFutbol("Atlético Madrid", "Madrid", "Wanda Metropolitano", LocalDate.of(1903, 4, 26), 
								        		entrenador1_3, portero1_3, central1_3, central2_3, central3_3, central4_3, 
								                centro1_3, centro2_3, centro3_3, delantero1_3, delantero2_3, delantero3_3);
        EquipoFutbol equipo4 = new EquipoFutbol("Sevilla FC", "Sevilla", "Ramón Sánchez Pizjuán", LocalDate.of(1890, 1, 1), 
								        		entrenador1_4, portero1_4, central1_4, central2_4, central3_4, central4_4, 
								                centro1_4, centro2_4, centro3_4, delantero1_4, delantero2_4, delantero3_4);

        // Crear una liga con estos equipos
        Liga liga = new Liga(equipo1, equipo2, equipo3, equipo4);

        // Simular partidos (aquí puedes agregar la simulación de los partidos si deseas)
        // Por ejemplo, podrías simular un partido entre el equipo 1 y el equipo 2:
        System.out.print("****EMPIEZA LIGA****\n");
        Partido partido1 = new Partido(equipo1, equipo2);
        /**Partido partido2 = new Partido(equipo1, equipo3);
        Partido partido3 = new Partido(equipo2, equipo3);
        Partido partido4 = new Partido(equipo2, equipo4);
        Partido partido5 = new Partido(equipo3, equipo4);
        Partido partido6 = new Partido(equipo4, equipo1);**/
        
        partido1.resultado();
        partido1.golesLocal();
        partido1.golesVisitante();
        partido1.asistenciasLocal();
        partido1.asistenciasVisitante();
        //partido1.faltastarjetasprueba();
        partido1.faltasTarjetasLocal();
        partido1.faltasTarjetasVisitante();
        /**partido2.resultado();
        partido3.resultado();
        partido4.resultado();
        partido5.resultado();
        partido6.resultado();**/
        List<Object> lista = new ArrayList<>();
        lista = equipo1.jugadores();
        System.out.println("\n");
        for (Object obj : lista) {
        	if (obj instanceof Delantero) {
				Delantero delantero = (Delantero) obj;
				System.out.println(delantero.toString());
			} else if (obj instanceof Defensa) {
				Defensa defensa = (Defensa) obj;
				System.out.println(defensa.toString());
			} else if (obj instanceof Centrocampista) {
				Centrocampista centrocampista = (Centrocampista) obj;
				System.out.println(centrocampista.toString());
			} else if (obj instanceof Portero) {
				Portero portero = (Portero) obj;
				System.out.println(portero.toString());
			}
        }
        
        System.out.println("\n****PUNTOS****\n");
        liga.listarPuntos();
    }
}
