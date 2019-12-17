package monitor;

public class Status {
	private int id;
	private String estado;
	public static String STATUS1 = "undefined";

	public Status(int id) {
	
		setId(id);
		setEstado(buscarEstado());
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setSTATUS1(String estado) {
		STATUS1 = estado;
	}
	
	private String buscarEstado() {
		int id = getId();
		switch(id) {
			case 1:
				return("estado operativo");
			case 2:
				return("estado no disponible");	
			case 3:
				return("estado desconocido");
		}
		return STATUS1;
	}

}
