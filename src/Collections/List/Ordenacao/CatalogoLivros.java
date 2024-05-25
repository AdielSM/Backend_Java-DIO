package Collections.List.Ordenacao;

import java.util.ArrayList;

public class CatalogoLivros {
    private final ArrayList<Livro> catalogo;

    public CatalogoLivros(){
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        for (Livro livro : this.catalogo) {
            if(livro.autor().equalsIgnoreCase(autor) &&
            livro.titulo().equalsIgnoreCase(titulo)){
                throw new IllegalArgumentException("Livro já registrado no catálogo");
            }
        }

        this.catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public ArrayList<Livro> pesquisarPorAutor(String autor){
        ArrayList<Livro> livrosPorAutor = new ArrayList<>();

        for (Livro livro : this.catalogo) {
            if(livro.autor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(livro);
            }
        }

        if(livrosPorAutor.isEmpty()){
            throw new IllegalArgumentException("Não existe livros cadastrados para este autor");
        }

        return livrosPorAutor;
    }

    public ArrayList<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        assert anoInicial <= anoFinal : "Ano inicial não pode ser maior que ano final";

        ArrayList<Livro> livrosPorIntervalo = new ArrayList<>();

        for (Livro livro : this.catalogo) {
            if(livro.anoPublicacao() >= anoInicial &&
            livro.anoPublicacao() <= anoFinal){
                livrosPorIntervalo.add(livro);
            }
        }

        if(livrosPorIntervalo.isEmpty()){
            throw new IllegalArgumentException("Não existe livros cadastrados para este intervalo de anos");
        }

        return livrosPorIntervalo;
    }

    public void pesquisarPorTitulo(String titulo){
        for (Livro livro : this.catalogo) {
            if(livro.titulo().equalsIgnoreCase(titulo)){
                System.out.println(livro);
                return;
            }
        }

        throw new IllegalArgumentException("Livro não encontrado");
    }

}

