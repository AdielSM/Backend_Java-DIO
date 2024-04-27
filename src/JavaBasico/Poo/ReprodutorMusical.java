package JavaBasico.Poo;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private final ArrayList<String> musicas;
    private String musicaAtual;

    public ReprodutorMusical() {
        this.musicas = new ArrayList<String>(List.of(
                "sparks",
                "in the name of love",
                "i want to break free",
                "bohemian rhapsody",
                "another one bites the dust"
        ));
    }

    public void getMusicas(){
        for (String musica : this.musicas) {
            System.out.println("Música: " + musica);
        }
    }

    public String tocarMusica(String musica) {
        if (this.musicas.contains(musica)) {
            this.musicaAtual = musica;
            return "Tocando " + musica;
        } else {
            return "Música não encontrada";
        }
    }

    public String pausarMusica() {
        if (this.musicaAtual == null) {
            return "Nenhuma música tocando";
        }
        return "Pausando " + this.musicaAtual;
    }

    public String selecionarMusica(String musica) {
        if (this.musicas.contains(musica.toLowerCase())) {
            this.musicaAtual = musica;
            return "Selecionando " + musica;
        } else {
            return "Música não encontrada";
        }
    }


}
