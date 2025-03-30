package dispositivo;

import musica.ReprodutorMusical;
import aparelho.AparelhoTelefonico;
import navegador.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void tocarMusica(String musica) {
		System.out.println("Reproduzindo música: " + musica);
	}

	@Override
	public void pausarMusica() {
		System.out.println("Música pausada.");
	}

	@Override
	public void fazerChamada(String numero) {
		System.out.println("Fazendo chamada para: " + numero);
	}

	@Override
	public void receberChamada(String numero) {
		System.out.println("Recebendo chamada de: " + numero);
	}

	@Override
	public void enviarMensagem(String numero, String mensagem) {
		System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
	}

	@Override
	public void receberMensagem(String numero, String mensagem) {
		System.out.println("Recebendo mensagem de " + numero + ": " + mensagem);
	}

	@Override
	public void acessarPagina(String url) {
		System.out.println("Acessando página: " + url);
	}

	@Override
	public void buscar(String termo) {
		System.out.println("Buscando por: " + termo);
	}
}