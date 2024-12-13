package tema3.rfef;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

//goles realizados, asistencias, faltas realizadas y goles recibidos
public class Partido {
	private EquipoFutbol equipoLocal;
	private EquipoFutbol equipoVisitante;
	private int faltasLocal;
	private int faltasVisitante;
	private int golesLocal;
	private int golesVisitante;
	private int penaltisLocal;
	private int penaltisVisitante;
	private int tarjetasALocal;
	private int tarjetasRLocal;
	private int tarjetasAVisitante;
	private int tarjetasRVisitante;
	private List<Object> jugadoresFaltasLocal = new ArrayList<>();
	private List<Object> jugadoresFaltasVisitante = new ArrayList<>();
	private List<Object> jugadoresGolesLocal = new ArrayList<>();
	private List<Object> jugadoresGolesVisitante = new ArrayList<>();
	private List<Object> jugadoresAsistenciasLocal = new ArrayList<>();
	private List<Object> jugadoresAsistenciasVisitante = new ArrayList<>();
	private List<Object> jugadoresPenaltisLocal = new ArrayList<>();
	private List<Object> jugadoresPenaltisVisitante = new ArrayList<>();
	private List<Object> jugadoresTarjetasALocal = new ArrayList<>();
	private List<Object> jugadoresTarjetasAVisitante = new ArrayList<>();
	private List<Object> jugadoresTarjetasRLocal = new ArrayList<>();
	private List<Object> jugadoresTarjetasRVisitante = new ArrayList<>();
	// Random para generar los números aleatorios
	Random random = new Random();

	public Partido(EquipoFutbol equipo1, EquipoFutbol equipo2) {
		super();
		this.equipoLocal = equipo1;
		this.equipoVisitante = equipo2;
		this.simularPartido();
	}

	public List<Object> getjugadoresTarjetasALocal() {
		return jugadoresTarjetasALocal;
	}

	public void setjugadoresTarjetasALocal(List<Object> jugadoresTarjetasALocal) {
		this.jugadoresTarjetasALocal = jugadoresTarjetasALocal;
	}

	public List<Object> getjugadoresTarjetasAVisitante() {
		return jugadoresTarjetasAVisitante;
	}

	public void setjugadoresTarjetasAVisitante(List<Object> jugadoresTarjetasAVisitante) {
		this.jugadoresTarjetasAVisitante = jugadoresTarjetasAVisitante;
	}

	public List<Object> getjugadoresTarjetasRLocal() {
		return jugadoresTarjetasRLocal;
	}

	public void setjugadoresTarjetasRLocal(List<Object> jugadoresTarjetasRLocal) {
		this.jugadoresTarjetasRLocal = jugadoresTarjetasRLocal;
	}

	public List<Object> getjugadoresTarjetasRVisitante() {
		return jugadoresTarjetasRVisitante;
	}

	public void setjugadoresTarjetasRVisitante(List<Object> jugadoresTarjetasRVisitante) {
		this.jugadoresTarjetasRVisitante = jugadoresTarjetasRVisitante;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public EquipoFutbol getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(EquipoFutbol equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public EquipoFutbol getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(EquipoFutbol equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getFaltasLocal() {
		return faltasLocal;
	}

	public void setFaltasLocal(int faltasLocal) {
		this.faltasLocal = faltasLocal;
	}

	public int getFaltasVisitante() {
		return faltasVisitante;
	}

	public void setFaltasVisitante(int faltasVisitante) {
		this.faltasVisitante = faltasVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public int getPenaltisLocal() {
		return penaltisLocal;
	}

	public void setPenaltisLocal(int penaltisLocal) {
		this.penaltisLocal = penaltisLocal;
	}

	public int getPenaltisVisitante() {
		return penaltisVisitante;
	}

	public void setPenaltisVisitante(int penaltisVisitante) {
		this.penaltisVisitante = penaltisVisitante;
	}

	public int getTarjetasALocal() {
		return tarjetasALocal;
	}

	public void setTarjetasALocal(int tarjetasALocal) {
		this.tarjetasALocal = tarjetasALocal;
	}

	public int getTarjetasRLocal() {
		return tarjetasRLocal;
	}

	public void setTarjetasRLocal(int tarjetasRLocal) {
		this.tarjetasRLocal = tarjetasRLocal;
	}

	public int getTarjetasAVisitante() {
		return tarjetasAVisitante;
	}

	public void setTarjetasAVisitante(int tarjetasAVisitante) {
		this.tarjetasAVisitante = tarjetasAVisitante;
	}

	public int getTarjetasRVisitante() {
		return tarjetasRVisitante;
	}

	public void setTarjetasRVisitante(int tarjetasRVisitante) {
		this.tarjetasRVisitante = tarjetasRVisitante;
	}

	public List<Object> getJugadoresTarjetasALocal() {
		return jugadoresTarjetasALocal;
	}

	public void setJugadoresTarjetasALocal(List<Object> jugadoresTarjetasALocal) {
		this.jugadoresTarjetasALocal = jugadoresTarjetasALocal;
	}

	public List<Object> getJugadoresTarjetasAVisitante() {
		return jugadoresTarjetasAVisitante;
	}

	public void setJugadoresTarjetasAVisitante(List<Object> jugadoresTarjetasAVisitante) {
		this.jugadoresTarjetasAVisitante = jugadoresTarjetasAVisitante;
	}

	public List<Object> getJugadoresTarjetasRLocal() {
		return jugadoresTarjetasRLocal;
	}

	public void setJugadoresTarjetasRLocal(List<Object> jugadoresTarjetasRLocal) {
		this.jugadoresTarjetasRLocal = jugadoresTarjetasRLocal;
	}

	public List<Object> getJugadoresTarjetasRVisitante() {
		return jugadoresTarjetasRVisitante;
	}

	public void setJugadoresTarjetasRVisitante(List<Object> jugadoresTarjetasRVisitante) {
		this.jugadoresTarjetasRVisitante = jugadoresTarjetasRVisitante;
	}

	public List<Object> getJugadoresFaltasLocal() {
		return jugadoresFaltasLocal;
	}

	public void setJugadoresFaltasLocal(List<Object> jugadoresFaltasLocal) {
		this.jugadoresFaltasLocal = jugadoresFaltasLocal;
	}

	public List<Object> getJugadoresFaltasVisitante() {
		return jugadoresFaltasVisitante;
	}

	public void setJugadoresFaltasVisitante(List<Object> jugadoresFaltasVisitante) {
		this.jugadoresFaltasVisitante = jugadoresFaltasVisitante;
	}

	public List<Object> getJugadoresGolesLocal() {
		return jugadoresGolesLocal;
	}

	public void setJugadoresGolesLocal(List<Object> jugadoresGolesLocal) {
		this.jugadoresGolesLocal = jugadoresGolesLocal;
	}

	public List<Object> getJugadoresGolesVisitante() {
		return jugadoresGolesVisitante;
	}

	public void setJugadoresGolesVisitante(List<Object> jugadoresGolesVisitante) {
		this.jugadoresGolesVisitante = jugadoresGolesVisitante;
	}

	public List<Object> getJugadoresAsistenciasLocal() {
		return jugadoresAsistenciasLocal;
	}

	public void setJugadoresAsistenciasLocal(List<Object> jugadoresAsistenciasLocal) {
		this.jugadoresAsistenciasLocal = jugadoresAsistenciasLocal;
	}

	public List<Object> getJugadoresAsistenciasVisitante() {
		return jugadoresAsistenciasVisitante;
	}

	public void setJugadoresAsistenciasVisitante(List<Object> jugadoresAsistenciasVisitante) {
		this.jugadoresAsistenciasVisitante = jugadoresAsistenciasVisitante;
	}

	public List<Object> getJugadoresPenaltisLocal() {
		return jugadoresPenaltisLocal;
	}

	public void setJugadoresPenaltisLocal(List<Object> jugadoresPenaltisLocal) {
		this.jugadoresPenaltisLocal = jugadoresPenaltisLocal;
	}

	public List<Object> getJugadoresPenaltisVisitante() {
		return jugadoresPenaltisVisitante;
	}

	public void setJugadoresPenaltisVisitante(List<Object> jugadoresPenaltisVisitante) {
		this.jugadoresPenaltisVisitante = jugadoresPenaltisVisitante;
	}

	public void simularPartido() {
		// Número máximo de goles posibles por equipo en un partido (ajustable según lo
		// que consideres realista1)
		int maxGoles = 5;

		// Generar el número de goles para el equipo local y visitante (aleatorio entre
		// 0 y maxGoles)
		golesLocal = random.nextInt(maxGoles + 1); // Genera un número entre 0 y maxGoles
		golesVisitante = random.nextInt(maxGoles + 1); // Genera un número entre 0 y maxGoles

		// Sumar puntos según el resultado
		if (golesLocal > golesVisitante) {
			equipoLocal.partidoPuntos(3);
		} else if (golesLocal < golesVisitante) {
			equipoVisitante.partidoPuntos(3);
		} else {
			equipoLocal.partidoPuntos(1);
			equipoVisitante.partidoPuntos(1);
		}
		// Probabilidad de que un jugador marque
		// (más probabilidades para delanteros, menos para defensas)
		double[] probabilidadesGoles = { 0.3, 0.15, 0.15, // Delanteros 0,6
				0.1, 0.1, 0.1, // Centrocampistas 0,3
				0.05, 0.05, 0.05, 0.05 // Defensores 0,2
		};
		double probabilidadAleatoria; // Variable de probabilidad aleatoria
		double sumaProbabilidades; // Variable para buscar probabilidadAleatoria en rangos en los bucles
		double[] probabilidadesJugadoresAsistencias = { 0.1, 0.1, 0.1, // Delanteros 0,3
				0.15, 0.2, 0.15, // Centrocampistas 0,5
				0.05, 0.05, 0.05, 0.05 // Defensores 0,2
		};

		// LOCAL
		// Bucle que asigna la cantidad Goles(iteraciones = goles marcados)
		for (int i = 0; i < golesLocal; i++) {
			// Elegir un jugador aleatoriamente basado en las probabilidades
			probabilidadAleatoria = random.nextDouble();
			sumaProbabilidades = 0.0;
			int j = 0;
			// Lista pasa por todos los objetos de la lista
			for (Object obj : equipoLocal.jugadores()) {
				// Va creando rangos para comprobar asignar el gol
				sumaProbabilidades += probabilidadesGoles[j];
				j++;
				// comprueba en que rango ha caido la probabilidad
				if (probabilidadAleatoria <= sumaProbabilidades) {
					// Verificamos de que tipo se el objeto
					if (obj instanceof Delantero) {
						Delantero delantero = (Delantero) obj;
						delantero.golAnotado();
						this.jugadoresGolesLocal.add(delantero);
					} else if (obj instanceof Defensa) {
						Defensa defensa = (Defensa) obj;
						defensa.golAnotado();
						this.jugadoresGolesLocal.add(defensa);
					} else if (obj instanceof Centrocampista) {
						Centrocampista centrocampista = (Centrocampista) obj;
						centrocampista.golAnotado();
						this.jugadoresGolesLocal.add(centrocampista);
					}
					// Salgo del bucle una vez asignado el gol
					break;
				}
			}
		}

		// Visitante
		// Bucle que asigna la cantidad de goles(iteraciones = goles
		// marcados)
		for (int i = 0; i < golesVisitante; i++) {
			// Elegir un jugador aleatoriamente basado en las probabilidades
			probabilidadAleatoria = random.nextDouble();
			sumaProbabilidades = 0.0;
			int j = 0;
			// Lista pasa por todos los objetos de la lista
			for (Object obj : equipoVisitante.jugadores()) {
				// Va creando rangos para comprobar asignar el gol
				sumaProbabilidades += probabilidadesGoles[j];
				j++;
				// comprueba en que rango ha caido la probabilidad
				if (probabilidadAleatoria <= sumaProbabilidades) {
					// Verificamos de que tipo se el objeto
					if (obj instanceof Delantero) {
						Delantero delantero = (Delantero) obj;
						delantero.golAnotado();
						this.jugadoresGolesVisitante.add(delantero);
					} else if (obj instanceof Defensa) {
						Defensa defensa = (Defensa) obj;
						defensa.golAnotado();
						this.jugadoresGolesVisitante.add(defensa);
					} else if (obj instanceof Centrocampista) {
						Centrocampista centrocampista = (Centrocampista) obj;
						centrocampista.golAnotado();
						this.jugadoresGolesVisitante.add(centrocampista);
					}
					// Salgo del bucle una vez asignado el gol
					break;
				}
			}
		}

		// ****ASISTENCIAS****
		// Probabilidad que un gol se realize con una asistencia

		// LOCAL
		// Bucle que asigna la cantidad asistencias(iteraciones = goles marcados)
		for (int i = 0; i < golesLocal; i++) {
			// Elegir un jugador aleatoriamente basado en las probabilidades
			probabilidadAleatoria = random.nextDouble();
			int j = 0;
			if (probabilidadAleatoria <= 0.9) {
				// Elegir un jugador aleatoriamente basado en las probabilidades
				probabilidadAleatoria = random.nextDouble();
				sumaProbabilidades = 0.0;
				// Lista pasa por todos los objetos de la lista
				for (Object obj : equipoLocal.jugadores()) {
					// Va creando rangos para comprobar asignar el gol
					sumaProbabilidades += probabilidadesJugadoresAsistencias[j];
					j++;
					// comprueba en que rango ha caido la probabilidad
					if (probabilidadAleatoria <= sumaProbabilidades) {
						if (this.jugadoresGolesLocal.get(i) == obj) {// Si el anotador coincide con el asistidor, avanzo
																		// al siguiente jugador y le asigno la
																		// asistencia
							obj = this.equipoLocal.jugador(j + 1);
						}
						// Verificamos de que tipo se el objeto
						if (obj instanceof Delantero) {
							Delantero delantero = (Delantero) obj;
							delantero.asistencia();
							this.jugadoresAsistenciasLocal.add(delantero);
						} else if (obj instanceof Defensa) {
							Defensa defensa = (Defensa) obj;
							defensa.asistencia();
							this.jugadoresAsistenciasLocal.add(defensa);
						} else if (obj instanceof Centrocampista) {
							Centrocampista centrocampista = (Centrocampista) obj;
							centrocampista.asistencia();
							this.jugadoresAsistenciasLocal.add(centrocampista);
						}
						// Salgo del bucle una vez asignado el gol
						break;
					}
				}
			} else {
				this.jugadoresAsistenciasLocal.add("");
			}
		}

		// Visitante
		// Bucle que asigna la cantidad de asistencias(iteraciones = goles
		// marcados)
		for (int i = 0; i < golesVisitante; i++) {
			// Elegir un jugador aleatoriamente basado en las probabilidades
			probabilidadAleatoria = random.nextDouble();
			if (probabilidadAleatoria <= 0.9) {
				// Elegir un jugador aleatoriamente basado en las probabilidades
				probabilidadAleatoria = random.nextDouble();
				sumaProbabilidades = 0.0;
				// Lista pasa por todos los objetos de la lista
				for (Object obj : equipoVisitante.jugadores()) {
					int j = 0;
					// Va creando rangos para comprobar asignar el gol
					sumaProbabilidades += probabilidadesJugadoresAsistencias[j];
					j++;
					// comprueba en que rango ha caido la probabilidad
					if (probabilidadAleatoria <= sumaProbabilidades) {
						if (this.jugadoresGolesVisitante.get(i) == obj) {// Si el anotador coincide con el asistidor,
																			// avanzo
							// al siguiente jugador y le asigno la
							// asistencia
							obj = this.equipoVisitante.jugador(j + 1);
						}
						// Verificamos de que tipo se el objeto
						if (obj instanceof Delantero) {
							Delantero delantero = (Delantero) obj;
							delantero.asistencia();
							this.jugadoresAsistenciasVisitante.add(delantero);
						} else if (obj instanceof Defensa) {
							Defensa defensa = (Defensa) obj;
							defensa.asistencia();
							this.jugadoresAsistenciasVisitante.add(defensa);
						} else if (obj instanceof Centrocampista) {
							Centrocampista centrocampista = (Centrocampista) obj;
							centrocampista.asistencia();
							this.jugadoresAsistenciasVisitante.add(centrocampista);
						}
						// Salgo del bucle una vez asignado el gol
						break;
					}
				}
			} else {
				this.jugadoresAsistenciasVisitante.add("");
			}
		}

		// Generar el numero de faltas para cada equipo (aleatorio entre 0 y 7)
		double[] probabilidadesFaltas = { 0.05, 0.1, 0.25, 0.4, 0.2 }; // Probabilidad de 0,1,2,3,4,5 faltas por
																		// equipo
		// Bucle que asigna la cantidad de asistencias(iteraciones = numeroMax de faltas
		// = 5)
		// LOCAL
		// Probalidad aleatoria
		probabilidadAleatoria = random.nextDouble();
		sumaProbabilidades = 0.0;
		// Lista pasa por todos los objetos de la lista
		for (int i = 0; i < 5; i++) {
			// Va creando rangos para comprobar asignar el gol
			sumaProbabilidades += probabilidadesFaltas[i];
			// comprueba en que rango ha caido la probabilidad
			if (probabilidadAleatoria <= sumaProbabilidades) {
				faltasLocal = i; // Asigno el numero de faltas al equipo
				break; // Salgo del bucle una vez asignado el numero de faltas
			}
		}

		// Bucle que asigna la cantidad de asistencias(iteraciones = numeroMax de faltas
		// = 5)
		// Vistante
		// Probalidad aleatoria
		probabilidadAleatoria = random.nextDouble();
		sumaProbabilidades = 0.0;
		// Lista pasa por todos los objetos de la lista
		for (int i = 0; i < 5; i++) {
			// Va creando rangos para comprobar asignar el gol
			sumaProbabilidades += probabilidadesFaltas[i];
			// comprueba en que rango ha caido la probabilidad
			if (probabilidadAleatoria <= sumaProbabilidades) {
				faltasVisitante = i;// Asigno el numero de faltas al equipo
				break; // Salgo del bucle una vez asignado el numero de faltas
			}
		}

		double probTarjeta = 0.8; // Probabilidad de tarjeta si hay falta -> 1-probTarjeta
		double probA = 0.8; // Probabilidad de tarjeta amarilla si hay tarjeta
		// ****Faltas/Tarjetas****

		// LOCAL
		// Bucle que asigna la cantidad asistencias(iteraciones = goles marcados)
		for (int i = 0; i < faltasLocal; i++) {
			// Elegir un jugador aleatoriamente basado en las probabilidades
			probabilidadAleatoria = random.nextDouble();
			sumaProbabilidades = 0.0;
			int j = 0;
			if (probabilidadAleatoria <= probTarjeta) {
				// Lista pasa por todos los objetos de la lista
				for (Object obj : equipoLocal.jugadores()) {
					// Va creando rangos para comprobar asignar el gol
					sumaProbabilidades += probabilidadesJugadoresAsistencias[j];
					j++;
					// comprueba en que rango ha caido la probabilidad
					if (probabilidadAleatoria <= sumaProbabilidades) {
						// Verificamos de que tipo se el objeto
						if (obj instanceof Delantero) {
							Delantero delantero = (Delantero) obj;
							delantero.falta();
							this.jugadoresFaltasLocal.add(delantero);
							this.jugadoresTarjetasALocal.add("");
							this.jugadoresTarjetasRLocal.add("");
						} else if (obj instanceof Defensa) {
							Defensa defensa = (Defensa) obj;
							defensa.falta();
							this.jugadoresFaltasLocal.add(defensa);
							this.jugadoresTarjetasALocal.add("");
							this.jugadoresTarjetasRLocal.add("");
						} else if (obj instanceof Centrocampista) {
							Centrocampista centrocampista = (Centrocampista) obj;
							centrocampista.falta();
							this.jugadoresFaltasLocal.add(centrocampista);
							this.jugadoresTarjetasALocal.add("");
							this.jugadoresTarjetasRLocal.add("");
						}
						// Salgo del bucle una vez asignado el gol
						break;
					}
				}
			} else {
				// Lista pasa por todos los objetos de la lista
				// Elegir un jugador aleatoriamente basado en las probabilidades
				probabilidadAleatoria = random.nextDouble();
				sumaProbabilidades = 0.0;
				j = 0;
				for (Object obj : equipoLocal.jugadores()) {
					// Va creando rangos para comprobar asignar el gol
					sumaProbabilidades += probabilidadesJugadoresAsistencias[j];
					j++;
					// comprueba en que rango ha caido la probabilidad
					if (probabilidadAleatoria <= sumaProbabilidades) {
						probabilidadAleatoria = random.nextDouble();
						// Verificamos de que tipo se el objeto
						if (obj instanceof Delantero) {
							Delantero delantero = (Delantero) obj;
							delantero.falta();
							this.jugadoresFaltasLocal.add(delantero);
							if (probabilidadAleatoria <= probA) {
								this.jugadoresTarjetasALocal.add(delantero);
								this.jugadoresTarjetasRLocal.add("");
								delantero.tarjetaA();
							} else {
								this.jugadoresTarjetasALocal.add("");
								this.jugadoresTarjetasRLocal.add(delantero);
								delantero.tarjetaR();
							}
						} else if (obj instanceof Defensa) {
							Defensa defensa = (Defensa) obj;
							defensa.falta();
							this.jugadoresFaltasLocal.add(defensa);
							if (probabilidadAleatoria <= probA) {
								this.jugadoresTarjetasALocal.add(defensa);
								this.jugadoresTarjetasRLocal.add("");
								defensa.tarjetaA();
							} else {
								this.jugadoresTarjetasALocal.add("");
								this.jugadoresTarjetasRLocal.add(defensa);
								defensa.tarjetaR();
							}
						} else if (obj instanceof Centrocampista) {
							Centrocampista centrocampista = (Centrocampista) obj;
							centrocampista.falta();
							this.jugadoresFaltasLocal.add(centrocampista);
							if (probabilidadAleatoria <= probA) {
								this.jugadoresTarjetasALocal.add(centrocampista);
								this.jugadoresTarjetasRLocal.add("");
								centrocampista.tarjetaA();
							} else {
								this.jugadoresTarjetasALocal.add("");
								this.jugadoresTarjetasRLocal.add(centrocampista);
								centrocampista.tarjetaR();
							}
						}
						// Salgo del bucle una vez asignado el gol
						break;
					}
				}
			}
		}

		// Visitante
		// Bucle que asigna la cantidad asistencias(iteraciones = goles marcados)
		for (int i = 0; i < faltasVisitante; i++) {
			// Elegir un jugador aleatoriamente basado en las probabilidades
			probabilidadAleatoria = random.nextDouble();
			sumaProbabilidades = 0.0;
			int j = 0;
			if (probabilidadAleatoria <= probTarjeta) {
				// Lista pasa por todos los objetos de la lista
				for (Object obj : equipoVisitante.jugadores()) {
					// Va creando rangos para comprobar asignar el gol
					sumaProbabilidades += probabilidadesJugadoresAsistencias[j];
					j++;
					// comprueba en que rango ha caido la probabilidad
					if (probabilidadAleatoria <= sumaProbabilidades) {
						// Verificamos de que tipo se el objeto
						if (obj instanceof Delantero) {
							Delantero delantero = (Delantero) obj;
							delantero.falta();
							this.jugadoresFaltasVisitante.add(delantero);
							this.jugadoresTarjetasAVisitante.add("");
							this.jugadoresTarjetasRVisitante.add("");
						} else if (obj instanceof Defensa) {
							Defensa defensa = (Defensa) obj;
							defensa.falta();
							this.jugadoresFaltasVisitante.add(defensa);
							this.jugadoresTarjetasAVisitante.add("");
							this.jugadoresTarjetasRVisitante.add("");
						} else if (obj instanceof Centrocampista) {
							Centrocampista centrocampista = (Centrocampista) obj;
							centrocampista.falta();
							this.jugadoresFaltasVisitante.add(centrocampista);
							this.jugadoresTarjetasAVisitante.add("");
							this.jugadoresTarjetasRVisitante.add("");
						}
						// Salgo del bucle una vez asignado el gol
						break;
					}
				}
			} else {
				// Lista pasa por todos los objetos de la lista
				// Elegir un jugador aleatoriamente basado en las probabilidades
				probabilidadAleatoria = random.nextDouble();
				sumaProbabilidades = 0.0;
				j = 0;
				for (Object obj : equipoVisitante.jugadores()) {
					// Va creando rangos para comprobar asignar el gol
					sumaProbabilidades += probabilidadesJugadoresAsistencias[j];
					j++;
					// comprueba en que rango ha caido la probabilidad
					if (probabilidadAleatoria <= sumaProbabilidades) {
						probabilidadAleatoria = random.nextDouble();
						// Verificamos de que tipo se el objeto
						if (obj instanceof Delantero) {
							Delantero delantero = (Delantero) obj;
							delantero.falta();
							this.jugadoresFaltasVisitante.add(delantero);
							if (probabilidadAleatoria <= probA) {
								this.jugadoresTarjetasAVisitante.add(delantero);
								this.jugadoresTarjetasRVisitante.add("");
								delantero.tarjetaA();
							} else {
								this.jugadoresTarjetasAVisitante.add("");
								this.jugadoresTarjetasRVisitante.add(delantero);
								delantero.tarjetaR();
							}
						} else if (obj instanceof Defensa) {
							Defensa defensa = (Defensa) obj;
							defensa.falta();
							this.jugadoresFaltasVisitante.add(defensa);
							if (probabilidadAleatoria <= probA) {
								this.jugadoresTarjetasAVisitante.add(defensa);
								this.jugadoresTarjetasRVisitante.add("");
								defensa.tarjetaA();
							} else {
								this.jugadoresTarjetasAVisitante.add("");
								this.jugadoresTarjetasRVisitante.add(defensa);
								defensa.tarjetaR();
							}
						} else if (obj instanceof Centrocampista) {
							Centrocampista centrocampista = (Centrocampista) obj;
							centrocampista.falta();
							this.jugadoresFaltasVisitante.add(centrocampista);
							if (probabilidadAleatoria <= probA) {
								this.jugadoresTarjetasAVisitante.add(centrocampista);
								this.jugadoresTarjetasRVisitante.add("");
								centrocampista.tarjetaA();
							} else {
								this.jugadoresTarjetasAVisitante.add("");
								this.jugadoresTarjetasRVisitante.add(centrocampista);
								centrocampista.tarjetaR();
							}
						}
						// Salgo del bucle una vez asignado el gol
						break;
					}
				}
			}
		}

		this.tarjetasALocal = faltasLocal;
		for (Object obj : jugadoresTarjetasALocal) {
			if (obj instanceof String) { // Si el objeto es una cadena, esta vacio y tiene que ser ""
				this.tarjetasALocal--;
			}
		}

		this.tarjetasRLocal = faltasLocal;
		for (Object obj : jugadoresTarjetasRLocal) {
			if (obj instanceof String) { // Si el objeto es una cadena, esta vacio y tiene que ser ""
				this.tarjetasRLocal--;
			}
		}

		this.tarjetasAVisitante = faltasVisitante;
		for (Object obj : jugadoresTarjetasAVisitante) {
			if (obj instanceof String) { // Si el objeto es una cadena, esta vacio y tiene que ser ""
				this.tarjetasAVisitante--;
			}
		}

		this.tarjetasRVisitante = faltasVisitante;
		for (Object obj : jugadoresTarjetasRVisitante) {
			if (obj instanceof String) { // Si el objeto es una cadena, esta vacio y tiene que ser ""
				this.tarjetasRVisitante--;
			}
		}
	}

	public void resultado() {
		// Mostrar el resultado del partido
		System.out.println("\n" + equipoLocal.getNombreEquipo() + " " + golesLocal + " - " + golesVisitante + " "
				+ equipoVisitante.getNombreEquipo());
	}

	public void golesLocal() {
		// Mostramos equipo que equipo marca los goles
		System.out.println("\n****Goles del " + equipoLocal.getNombreEquipo() + "****\n");
		for (Object obj : this.jugadoresGolesLocal) {
			if (obj instanceof Delantero) {
				Delantero delantero = (Delantero) obj;
				System.out.println(delantero.getNombre() + " ha marcado gol.");
			} else if (obj instanceof Defensa) {
				Defensa defensa = (Defensa) obj;
				System.out.println(defensa.getNombre() + " ha marcado gol.");
			} else if (obj instanceof Centrocampista) {
				Centrocampista centrocampista = (Centrocampista) obj;
				System.out.println(centrocampista.getNombre() + " ha marcado gol.");
			}
		}
	}

	public void golesVisitante() {
		// Mostramos equipo que equipo marca los goles
		System.out.println("\n****Goles del " + equipoVisitante.getNombreEquipo() + "****\n");
		for (Object obj : this.jugadoresGolesVisitante) {
			if (obj instanceof Delantero) {
				Delantero delantero = (Delantero) obj;
				System.out.println(delantero.getNombre() + " ha marcado gol.");
			} else if (obj instanceof Defensa) {
				Defensa defensa = (Defensa) obj;
				System.out.println(defensa.getNombre() + " ha marcado gol.");
			} else if (obj instanceof Centrocampista) {
				Centrocampista centrocampista = (Centrocampista) obj;
				System.out.println(centrocampista.getNombre() + " ha marcado gol.");
			} else if (obj instanceof String) {
			}
		}
	}

	public void asistenciasLocal() {
		int i = 0;
		// Mostramos equipo que equipo marca los goles
		System.out.println("\n****Asistencias del " + equipoLocal.getNombreEquipo() + "****\n");
		for (Object obj : this.jugadoresAsistenciasLocal) {
			boolean hayasistencia = true;
			Object asistido = this.jugadoresGolesLocal.get(i);
			if (obj instanceof Delantero) {
				Delantero delantero = (Delantero) obj;
				System.out.print(delantero.getNombre() + " a asistido a ");
			} else if (obj instanceof Defensa) {
				Defensa defensa = (Defensa) obj;
				System.out.print(defensa.getNombre() + " a asistido a ");
			} else if (obj instanceof Centrocampista) {
				Centrocampista centrocampista = (Centrocampista) obj;
				System.out.print(centrocampista.getNombre() + " a asistido a ");
			} else if (obj instanceof String) {
				hayasistencia = false;
			}
			if (hayasistencia == true) {
				if (asistido instanceof Delantero) {
					Delantero delantero = (Delantero) asistido;
					System.out.println(delantero.getNombre() + ".");
				} else if (asistido instanceof Defensa) {
					Defensa defensa = (Defensa) asistido;
					System.out.println(defensa.getNombre() + ".");
				} else if (asistido instanceof Centrocampista) {
					Centrocampista centrocampista = (Centrocampista) asistido;
					System.out.println(centrocampista.getNombre() + ".");
				}
			}
			i++;
		}
	}

	public void asistenciasVisitante() {
		int i = 0;
		// Mostramos equipo que equipo marca los goles
		System.out.println("\n****Asistencias del " + equipoVisitante.getNombreEquipo() + "****\n");
		for (Object obj : this.jugadoresAsistenciasVisitante) {
			boolean hayasistencia = true;
			Object asistido = this.jugadoresGolesVisitante.get(i);
			if (obj instanceof Delantero) {
				Delantero delantero = (Delantero) obj;
				System.out.print(delantero.getNombre() + " a asistido a ");
			} else if (obj instanceof Defensa) {
				Defensa defensa = (Defensa) obj;
				System.out.print(defensa.getNombre() + " a asistido a ");
			} else if (obj instanceof Centrocampista) {
				Centrocampista centrocampista = (Centrocampista) obj;
				System.out.print(centrocampista.getNombre() + " a asistido a ");
			} else if (obj instanceof String) {
				hayasistencia = false;
			}
			if (hayasistencia == true) {
				if (asistido instanceof Delantero) {
					Delantero delantero = (Delantero) asistido;
					System.out.println(delantero.getNombre() + ".");
				} else if (asistido instanceof Defensa) {
					Defensa defensa = (Defensa) asistido;
					System.out.println(defensa.getNombre() + ".");
				} else if (asistido instanceof Centrocampista) {
					Centrocampista centrocampista = (Centrocampista) asistido;
					System.out.println(centrocampista.getNombre() + ".");
				}
			}
			i++;
		}
	}

	public void faltasTarjetasLocal() {
		int i = 0;
		// Mostramos equipo que equipo marca los goles
		System.out.println("\n****Faltas del " + equipoLocal.getNombreEquipo() + "****");
		System.out.println("\nFaltas: " + this.faltasLocal + "\nTarjetas Amarillas: " + this.tarjetasALocal
				+ "\nTarjetas Rojas: " + this.tarjetasRLocal);
		for (Object obj : this.jugadoresFaltasLocal) {
			boolean haytarjeta = true;
			Object tarjetaA = this.jugadoresTarjetasALocal.get(i);
			Object tarjetaR = this.jugadoresTarjetasRLocal.get(i);
			if (obj instanceof Delantero) {
				Delantero delantero = (Delantero) obj;
				System.out.print("\n" + delantero.getNombre() + " a hecho falta");
			} else if (obj instanceof Defensa) {
				Defensa defensa = (Defensa) obj;
				System.out.print("\n" + defensa.getNombre() + " a hecho falta");
			} else if (obj instanceof Centrocampista) {
				Centrocampista centrocampista = (Centrocampista) obj;
				System.out.print("\n" + centrocampista.getNombre() + " a hecho falta");
			}
			if (tarjetaA instanceof String && tarjetaR instanceof String) {
				haytarjeta = false;
				System.out.print(".");
			} else {
				if (haytarjeta == true) {
					if (tarjetaA instanceof String) {
						if (tarjetaR instanceof Delantero) {
							System.out.print(" con tarjeta roja.");
						} else if (tarjetaR instanceof Defensa) {
							System.out.print(" con tarjeta roja.");
						} else if (tarjetaR instanceof Centrocampista) {
							System.out.print(" con tarjeta roja.");
						}
					} else {
						if (tarjetaA instanceof Delantero) {
							System.out.print(" con tarjeta amarilla.");
						} else if (tarjetaA instanceof Defensa) {
							System.out.print(" con tarjeta amarilla.");
						} else if (tarjetaA instanceof Centrocampista) {
							System.out.print(" con tarjeta amarilla.");
						}
					}
				}
			}
			i++;
		}
		System.out.println();
	}

	public void faltasTarjetasVisitante() {
		int i = 0;
		// Mostramos equipo que equipo marca los goles
		System.out.println("\n****Faltas del " + equipoVisitante.getNombreEquipo() + "****");
		System.out.println("\nFaltas: " + this.faltasVisitante + "\nTarjetas Amarillas: " + this.tarjetasAVisitante
				+ " \nTarjetas Rojas: " + this.tarjetasRVisitante);
		for (Object obj : this.jugadoresFaltasVisitante) {
			boolean haytarjeta = true;
			Object tarjetaA = this.jugadoresTarjetasAVisitante.get(i);
			Object tarjetaR = this.jugadoresTarjetasRVisitante.get(i);
			if (obj instanceof Delantero) {
				Delantero delantero = (Delantero) obj;
				System.out.print("\n" + delantero.getNombre() + " a hecho falta");
			} else if (obj instanceof Defensa) {
				Defensa defensa = (Defensa) obj;
				System.out.print("\n" + defensa.getNombre() + " a hecho falta");
			} else if (obj instanceof Centrocampista) {
				Centrocampista centrocampista = (Centrocampista) obj;
				System.out.print("\n" + centrocampista.getNombre() + " a hecho falta");
			}
			if (tarjetaA instanceof String && tarjetaR instanceof String) {
				haytarjeta = false;
				System.out.print(".");
			} else {
				if (haytarjeta == true) {
					if (tarjetaA instanceof String) {
						if (tarjetaR instanceof Delantero) {
							System.out.print(" con tarjeta roja.");
						} else if (tarjetaR instanceof Defensa) {
							System.out.print(" con tarjeta roja.");
						} else if (tarjetaR instanceof Centrocampista) {
							System.out.print(" con tarjeta roja.");
						}
					} else {
						if (tarjetaA instanceof Delantero) {
							System.out.print(" con tarjeta amarilla.");
						} else if (tarjetaA instanceof Defensa) {
							System.out.print(" con tarjeta amarilla.");
						} else if (tarjetaA instanceof Centrocampista) {
							System.out.print("con tarjeta amarilla.");
						}
					}
				}
			}
			i++;
		}
		System.out.println();
	}

	
	@Override
	public String toString() {
		return "Partido [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", faltasLocal="
				+ faltasLocal + ", faltasVisitante=" + faltasVisitante + ", golesLocal=" + golesLocal
				+ ", golesVisitante=" + golesVisitante + ", penaltisLocal=" + penaltisLocal + ", penaltisVisitante="
				+ penaltisVisitante + ", tarjetasALocal=" + tarjetasALocal + ", tarjetasRLocal=" + tarjetasRLocal
				+ ", tarjetasAVisitante=" + tarjetasAVisitante + ", tarjetasRVisitante=" + tarjetasRVisitante
				+ ", jugadoresFaltasLocal=" + jugadoresFaltasLocal + ", jugadoresFaltasVisitante="
				+ jugadoresFaltasVisitante + ", jugadoresGolesLocal=" + jugadoresGolesLocal
				+ ", jugadoresGolesVisitante=" + jugadoresGolesVisitante + ", jugadoresAsistenciasLocal="
				+ jugadoresAsistenciasLocal + ", jugadoresAsistenciasVisitante=" + jugadoresAsistenciasVisitante
				+ ", jugadoresPenaltisLocal=" + jugadoresPenaltisLocal + ", jugadoresPenaltisVisitante="
				+ jugadoresPenaltisVisitante + ", jugadoresTarjetasALocal=" + jugadoresTarjetasALocal
				+ ", jugadoresTarjetasAVisitante=" + jugadoresTarjetasAVisitante + ", jugadoresTarjetasRLocal="
				+ jugadoresTarjetasRLocal + ", jugadoresTarjetasRVisitante=" + jugadoresTarjetasRVisitante + "]";
	}
}