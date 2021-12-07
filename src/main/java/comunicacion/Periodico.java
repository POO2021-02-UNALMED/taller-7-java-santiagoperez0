package comunicacion;

public class Periodico extends Escrito{

	private String fecha;
	private String primicia;
	private String interpretacion;

	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String intepretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = intepretacion;
	}

	@Override

	public int palabrasTotales(int palabrasPagina) {
	
		return getPaginas()*10*palabrasPagina;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String texto = "%s\n%s\n%s\n%s\n%s\n%s";
		return String.format(texto,getOrigen(),getTitulo(),getAutor(),String.valueOf(getPaginas()),fecha, primicia);
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
