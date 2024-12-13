package tema4.gramola;

import javax.sound.sampled.LineUnavailableException;

public class NotaTest {
	public static void main(String[] args) {
		try {
			Nota.suena(597 , 100);
			Thread.sleep(500);
			
	        // Establecemos las notas y sus duraciones en milisegundos
	        int duracionNota = 400;  // Duración estándar de una nota en milisegundos
	        int duracionLarga = 800; // Duración de notas más largas
	        
	        // Primera parte de "Daisy Bell"
	        Nota.suena(261, duracionNota); // C4 (Do)
	        Thread.sleep(100);  // Pausa entre notas
	        Nota.suena(261, duracionNota); // C4 (Do)
	        Thread.sleep(100);
	        Nota.suena(392, duracionNota); // G4 (Sol)
	        Thread.sleep(100);
	        Nota.suena(523, duracionNota); // C5 (Do superior)
	        Thread.sleep(100);
	        
	        Nota.suena(392, duracionNota); // G4 (Sol)
	        Thread.sleep(100);
	        Nota.suena(523, duracionNota); // C5 (Do superior)
	        Thread.sleep(100);
	        Nota.suena(392, duracionNota); // G4 (Sol)
	        Thread.sleep(100);
	        Nota.suena(261, duracionLarga); // C4 (Do) (nota larga)
	        Thread.sleep(500); // Pausa entre frases
	        
	        // Segunda parte de "Daisy Bell"
	        Nota.suena(261, duracionNota); // C4 (Do)
	        Thread.sleep(100);
	        Nota.suena(261, duracionNota); // C4 (Do)
	        Thread.sleep(100);
	        Nota.suena(392, duracionNota); // G4 (Sol)
	        Thread.sleep(100);
	        Nota.suena(523, duracionNota); // C5 (Do superior)
	        Thread.sleep(100);
	        
	        Nota.suena(392, duracionNota); // G4 (Sol)
	        Thread.sleep(100);
	        Nota.suena(523, duracionNota); // C5 (Do superior)
	        Thread.sleep(100);
	        Nota.suena(392, duracionNota); // G4 (Sol)
	        Thread.sleep(100);
	        Nota.suena(261, duracionLarga); // C4 (Do) (nota larga)
	        Thread.sleep(500); // Pausa entre frases

	        // Finalizar con una nota larga (por ejemplo, C4)
	        Nota.suena(261, 1000); // C4 (Do) (nota final larga)
		} catch (LineUnavailableException | InterruptedException e ){
			e.printStackTrace();
		}
	}
}
