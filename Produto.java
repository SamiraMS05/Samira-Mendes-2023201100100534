import java.util.HashMap;
import java.util.Map;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

// Classe Carrinho
class Carrinho {
    private Map<Produto, Integer> produtos;

    public Carrinho() {
        this.produtos = new HashMap<>();
    }

    // Adicionar produto ao carrinho
    public void adicionarProduto(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    // Remover produto do carrinho
    public void removerProduto(Produto produto) {
        if (produtos.containsKey(produto)) {
            produtos.remove(produto);
        } else {
            throw new IllegalArgumentException("Produto não está no carrinho.");
        }
    }

    // Atualizar a quantidade de um produto
    public void atualizarQuantidade(Produto produto, int novaQuantidade) {
        if (novaQuantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        if (produtos.containsKey(produto)) {
            produtos.put(produto, novaQuantidade);
        } else {
            throw new IllegalArgumentException("Produto não está no carrinho.");
        }
    }

    // Calcular o preço total do carrinho
    public double calcularValorTotal() {
        double total = 0;
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            total += entry.getKey().getPreco() * entry.getValue();
        }
        return total;
    }

    // Listar produtos no carrinho
    public void listarProdutos() {
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - Quantidade: " + entry.getValue() + 
                               " - Preço Unitário: " + entry.getKey().getPreco() + 
                               " - Preço Total: " + (entry.getKey().getPreco() * entry.getValue()));
        }
    }
}