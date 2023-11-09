import java.util.Vector;

public class Disciplina {
	private String nombre;
	private List participantes;
	private String recordMundial;
	private Vector<Atleta> atletas = new Vector<Atleta>();
	private Vector<Equipo> equipos = new Vector<Equipo>();
	private Vector<Evento> eventos = new Vector<Evento>();

	public String mostrarInformacion() {
		throw new UnsupportedOperationException();
	}

	public void agregarAtleta() {
		throw new UnsupportedOperationException();
	}

	public void eliminarAtleta() {
		throw new UnsupportedOperationException();
	}
}