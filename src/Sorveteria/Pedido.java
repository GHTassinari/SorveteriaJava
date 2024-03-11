package Sorveteria;

public class Pedido {
    private Sorvete sorvete;
    private double total;
    private int quantidade;
    private Cliente cliente;
    private Pagamento pagamento;

    public Pedido(double preco, double quantidade, String nomeSabor, String nomeTamanho, String nomeAdicional, String nomeCliente, String metodoPagamento){
        this.sorvete = new Sorvete(preco, nomeSabor, nomeTamanho, nomeAdicional);
        this.total = preco * quantidade;
        this.quantidade = (int)quantidade;
        this.cliente = new Cliente(nomeCliente);
        this.pagamento = new Pagamento(metodoPagamento);
    }

    public Sorvete getSorvete() {
        return sorvete;
    }

    public double getTotal() {
        return total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pagamento getMetodoPagamento() {
        return pagamento;
    }
}
