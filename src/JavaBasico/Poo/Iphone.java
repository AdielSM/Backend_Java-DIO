package JavaBasico.Poo;

public class Iphone {
    private Contatos contatos;
    private NavegadorInternet navegador;
    private ReprodutorMusical reprodutor;

    public Iphone() {
        this.contatos = new Contatos();
        this.navegador = new NavegadorInternet();
        this.reprodutor = new ReprodutorMusical();
    }

    public void ligar(String contato) {
        this.contatos.ligar(contato);
    }

    public void atender(String contato) {
        this.contatos.atender(contato);
    }

    public void iniciarCorreioVoz(String contato) {
        this.contatos.iniciarCorreioVoz(contato);
    }

    public void exibirPagina() {
        System.out.println(this.navegador.exibirPagina());
    }

    public void adicionarNovaAba(String pagina) {
        System.out.println(this.navegador.adicionarNovaAba(pagina));
    }

    public void atualizarPagina() {
        System.out.println(this.navegador.atualizarPagina());
    }

    public void getMusicas() {
        this.reprodutor.getMusicas();
    }

    public void tocarMusica(String musica) {
        System.out.println(this.reprodutor.tocarMusica(musica));
    }

    public void pausarMusica() {
        System.out.println(this.reprodutor.pausarMusica());
    }

    public void selecionarMusica(String musica) {
        System.out.println(this.reprodutor.selecionarMusica(musica));
    }
}
