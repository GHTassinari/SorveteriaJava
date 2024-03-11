import java.util.Scanner;
import Sorveteria.Pedido;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do sorvete:");
        double precoSorvete = scanner.nextDouble();

        System.out.println("Digite a quantidade de sorvetes:");
        int quantidadeSorvetes = scanner.nextInt();

        System.out.println("Digite o sabor do sorvete (Morango, Baunilha e Chocolate):");
        String saborSorvete = scanner.next();

        System.out.println("Digite o tamanho do sorvete (Pequeno, médio, grande):");
        String tamanhoSorvete = scanner.next();

        System.out.println("Digite o adicional do sorvete (Flocos ou Cobertura):");
        String adicionalSorvete = scanner.next();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o método de pagamento (Débito ou Crédito):");
        String metodoPagamento = scanner.next();


        Pedido p1 = new Pedido(precoSorvete, quantidadeSorvetes, saborSorvete, tamanhoSorvete, adicionalSorvete, nomeCliente, metodoPagamento);

        System.out.println("---------------------------");
        System.out.println("Dados da compra:");
        System.out.println("---------------------------");
        System.out.println("Preço do sorvete: R$ " + p1.getSorvete().getPreco());
        System.out.println("Quantidade de sorvetes: " + p1.getQuantidade());
        System.out.println("Sabor do sorvete: " + p1.getSorvete().getSabor().getNome());
        System.out.println("Tamanho do sorvete: " + p1.getSorvete().getTamanho().getNome());
        System.out.println("Adicional do sorvete: " + p1.getSorvete().getAdicional().getNome());
        System.out.println("Preço total: R$ " + p1.getTotal());
        System.out.println("Nome do cliente:  " + p1.getCliente().getNome());
        System.out.println("Método de pagamento:  " + p1.getMetodoPagamento().getMetodoPagamento());
        System.out.println("---------------------------");

        scanner.close();
    }
}
