import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivros(Livro livro) {
        livros.add(livro);
        System.out.println("Livro "+livro.getTitulo()+ " adicionado na biblioteca");
    }

    public void removerLivros(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livros.remove(livro);
                System.out.println("Livro '" + titulo + "' removido da biblioteca.");
                return;
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado na biblioteca.");
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado na biblioteca.");
        return null;
    }
}
