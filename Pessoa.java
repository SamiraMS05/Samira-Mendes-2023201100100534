public class Pessoa {
    String nome;
    int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void dados() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }

    //2. Adicione um método cumprimentar() à classe Pessoa que imprime uma mensagem de saudação
    //usando o nome.

    public void cumprimentar() {
        System.out.println("Saudações, "+nome+"!");
    }
    

}
