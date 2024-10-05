public class MainCliente {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 80.0);
        
        // Criando cliente
        Cliente cliente = new Cliente("Mateus");

        // Adicionando produtos ao carrinho
        cliente.getCarrinho().adicionarProduto(produto1, 2);
        cliente.getCarrinho().adicionarProduto(produto2, 1);
        
        // Listar produtos e valor total
        System.out.println("Produtos no Carrinho de " + cliente.getNome() + ":");
        cliente.getCarrinho().listarProdutos();
        System.out.println("Valor Total: " + cliente.getCarrinho().calcularValorTotal());

        // Remover produto
        cliente.getCarrinho().removerProduto(produto1);
        System.out.println("\nApós remover a camiseta:");
        cliente.getCarrinho().listarProdutos();
        System.out.println("Valor Total: " + cliente.getCarrinho().calcularValorTotal());

        // Atualizar quantidade
        cliente.getCarrinho().atualizarQuantidade(produto2, 3);
        System.out.println("\nApós atualizar a quantidade de calças:");
        cliente.getCarrinho().listarProdutos();
        System.out.println("Valor Total: " + cliente.getCarrinho().calcularValorTotal());
    }
}
