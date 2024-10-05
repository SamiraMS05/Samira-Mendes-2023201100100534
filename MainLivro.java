import java.time.LocalDate;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Fúria Vermelha");
        livro.setAutor("Pierce Brown");
        livro.setAnoPubli(LocalDate.of(2001,02,01));
        livro.dados();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivros(livro);
        biblioteca.buscarLivro("Fúria Vermelha");
        biblioteca.removerLivros("Fúria Vermelha");
    }
}
