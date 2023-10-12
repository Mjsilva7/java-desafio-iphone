

package aparelhos;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Iphone -> Fazendo ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Iphone -> Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone -> Iniciando correio de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Iphone -> Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone -> Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Iphone -> Selecionando música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Iphone -> Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone -> Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone -> Atualizando página");
    }
    
}
