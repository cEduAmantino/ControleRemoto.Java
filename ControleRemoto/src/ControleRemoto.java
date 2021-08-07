
public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
//Construtor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
		}
	
//getters e setters	
	public int getVolume() {
		return this.volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}	
	public boolean getLigado() {
		return this.ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean getTocando() {
		return this.tocando;
	}
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

//métodos abstratos da interface para cá
	public void ligar() {
		if (this.getLigado() == false) {
		this.setLigado(true);
		System.out.println("\nLigado!!");
		}else {
			System.out.println("\nJá está ligada!!");
		}
	}

	public void desligar() {
		if (this.getLigado() == true) {
		System.out.println("\n\nDesligando...\n");
		this.setLigado(false);
		}else if (this.getLigado() == false){
			System.out.println("\nTV já está desligada!!");
		}
	}

	public void abrirMenu() {		
				
		if (this.getLigado() == true && this.getVolume() > 0) {
			
			System.out.println("\n----Menu----");			
			System.out.print("Volume: " + this.getVolume()+ " ou") ;
			for(int i = 0; i < this.getVolume(); i+=10) {
				
				System.out.print(" |");
			}
		}else if (this.getLigado() == false){
			System.out.println("\nTV Desligada no momento!");
		}else if (this.getVolume() == 0) {
			System.out.println("\nVolume está no 0!!");
		}
		}boolean menu = true;


	public void fecharMenu() {
		if (this.getLigado() == true && menu == true) {
			System.out.println("\n\nFechando menu!");
			menu = false;
		}
		else if (this.getLigado() == false){
			System.out.println("\nTV Desligada no momento!");
		}else {
			System.out.println("\nMenu já está fechado");
		}
		}
	

	public void maisVolume() {
	
		if (this.getLigado() == true) {
			this.setVolume(this.getVolume() + 10);
			System.out.println("\n\nVolume aumentado!");
		}else {
			System.out.println("\nTV Desligada no momento!");
		}
	}

	public void menosVolume() {
		if (this.getLigado() == true) {
			this.setVolume(this.getVolume() -10);
			System.out.println("\n\nVolume diminuído!");
		}else {
			System.out.println("\nTV Desligada no momento!");
		}
	}
	
	public void ligarMudo() {
		if (this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
			System.out.println("\n\nMudo ligado!");
		}else {
			System.out.println("\nTV Desligada no momento");
		}
	}
	
	public void desligarMudo() {
		if (this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(10);
			System.out.println("\nMudo desligado!");
		}else {
			System.out.println("\nTV Desligada no momento");
		}
	}
	
	public void play() {	
		if (this.getLigado() == true && !(this.getTocando())){
			this.setTocando(true);
			System.out.println("\n\nDespausado!");
		}else if (this.getLigado() == false){
			System.out.println("\nTV Desligada no momento");
		}else {
			System.out.println("\nJá está despausado!");
		}
	}
	
	public void pause() {
		if (this.getLigado() == true && this.getTocando() == true) {
			this.setTocando(false);
			System.out.println("\nPausado!");
		}else if (this.getLigado() == false){
			System.out.println("\nTV Desligada no momento");
		}else {
			System.out.println("\nJá está pausado!");
		}
	}	
	
	
}
