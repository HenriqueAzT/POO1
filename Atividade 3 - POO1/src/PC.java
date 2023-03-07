public class PC {
	private String dono;
	private String marca;
	private WebCam camera;
	private Teclado teclados;
	
	public String getDono() {
		return dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "PC [dono=" + dono + ", marca=" + marca + ", camera=" + camera + ", teclados=" + teclados + "]";
	}
	
	public PC(String dono, String marca, WebCam w, Teclado t) {
		this.dono = dono;
		this.marca = marca;
		this.teclados = t;
		this.camera = w;
	}
	public void trocaTeclado(Teclado t) {
		if(teclados != null) {
			this.teclados = t;
			
		}
	}
	
	public void adicionaWebcam(WebCam w) {
		if(this.camera != null) {
			this.camera = w;
		}else {
			this.camera = w;
		}
	}

	public void removeWebcam() {
		if(this.camera != null) {
			this.camera = null;
		}
	}
}
