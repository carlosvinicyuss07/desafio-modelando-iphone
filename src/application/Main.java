package application;

import entities.Iphone;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Lugar distante");
        iphone.tocar();
        iphone.pausar();

        System.out.println("=============");

        iphone.exibirPagina("https://www.youtube.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        System.out.println("=============");

        iphone.ligar("(79)33322-1000");
        iphone.atender();
        iphone.iniciarCorreioVoz();

    }
}
