package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public Iphone() {
    }

    // Os métodos implementados a seguir são apenas representativos, não efetuam ações concretas.

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página web");
        System.out.println("url:" + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso");
    }

    @Override
    public void tocar() {
        System.out.println("O iphone está tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
