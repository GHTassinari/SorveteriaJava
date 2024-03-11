package Sorveteria;

public class Pagamento {
    private String metodoPagamento;

    public Pagamento(String metodoPagamento){
        this.metodoPagamento = metodoPagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
