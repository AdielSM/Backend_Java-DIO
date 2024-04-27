package JavaBasico.Poo;

public class NavegadorInternet {
    private String paginaAtual;

    public NavegadorInternet() {
        this.paginaAtual = "https://www.google.com";
    }

    public String exibirPagina() {
        return this.paginaAtual;
    }

    public String adicionarNovaAba(String pagina) {
        this.paginaAtual = pagina;
        return "Nova aba adicionada: " + pagina;
    }

    public String atualizarPagina() {
        return "Atualizando página: " + this.paginaAtual;
    }
}
