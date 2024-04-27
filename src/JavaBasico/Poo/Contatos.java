package JavaBasico.Poo;

import java.util.ArrayList;
import java.util.List;

public class Contatos {
    private final ArrayList<String> contatos;

    public Contatos() {
            this.contatos = new ArrayList<String>(
                    List.of(
                            "joão",
                            "maria",
                            "josé",
                            "ana",
                            "carlos"
                    )
            );
        }

    public void ligar(String contato) {
        if (this.contatos.contains(contato.toLowerCase())) {
            System.out.println("Ligando para " + contato);
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    public void atender(String contato) {
        if (this.contatos.contains(contato.toLowerCase())) {
            System.out.println("Atendendo chamada de " + contato);
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    public void iniciarCorreioVoz(String contato) {
        if (this.contatos.contains(contato.toLowerCase())) {
            System.out.println("Iniciando correio de voz para " + contato);
        } else {
            System.out.println("Contato não encontrado");
        }
    }
}
