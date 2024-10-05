class Cliente {
    private String nome;
    private Carrinho carrinho;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new Carrinho();
    }

    public String getNome() {
        return nome;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}
