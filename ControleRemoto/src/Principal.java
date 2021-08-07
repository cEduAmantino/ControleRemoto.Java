
public class Principal {

	public static void main(String[] args) {
		
/**---Lista de comandos---
 * ligar OK
 * desligar OK
 * abrirMenu OK
 * fecharMenu OK
 * maisVolume OK
 * menosVolume OK
 * ligarMudo OK
 * desligarMudo OK
 * play Ok 
 * pause Ok
 * */		
		
		ControleRemoto c1 = new ControleRemoto();
		c1.ligar();
		c1.desligar();
		c1.ligar();
		c1.abrirMenu();
		c1.fecharMenu();
		c1.maisVolume();
		c1.abrirMenu();
		c1.menosVolume();
		c1.abrirMenu();
		c1.ligarMudo();
		c1.abrirMenu();
		c1.desligarMudo();
		c1.abrirMenu();
		c1.maisVolume();
		c1.abrirMenu();
		c1.menosVolume();
		c1.abrirMenu();
		c1.play();
		c1.play();
		c1.pause();
		c1.pause();

	}

}
