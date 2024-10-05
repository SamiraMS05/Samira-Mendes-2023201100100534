import java.time.LocalDate;

public class Livro {
    String titulo;
    String autor;
    LocalDate anoPubli;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAnoPubli() {
        return anoPubli;
    }
    public void setAnoPubli(LocalDate anoPubli) {
        this.anoPubli = anoPubli;
    }

    public void dados() {
        System.out.println("Título do livro: "+titulo+
                            "\nAutor do livro: "+autor+
                            "\nAno de publicação: "+anoPubli);
    }
}
