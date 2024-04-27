package JavaBasico.Poo;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("joão");
        iphone.atender("maria");
        iphone.iniciarCorreioVoz("josé");

        iphone.adicionarNovaAba("https://www.youtube.com");
        iphone.exibirPagina();
        iphone.atualizarPagina();

        iphone.getMusicas();
        iphone.tocarMusica("Bohemian Rhapsody");
        iphone.pausarMusica();
        iphone.selecionarMusica("Another one bites the dust");
    }
}
