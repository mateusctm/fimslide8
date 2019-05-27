
import java.util.Scanner;

public class principal {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        String nomeCliente = ler.nextLine();
        String codigoPedido = ler.nextLine();
        String descricaoPedido = ler.nextLine();
        pedido teste = new pedido(nomeCliente, codigoPedido, descricaoPedido);
        teste.modificarNome(nomeCliente);
        teste.modificarDescricao(descricaoPedido);
        teste.retornarDescricao();
        teste.retorneNomeCliente();
        System.out.println(teste.retorneNomeCliente());
}
    
}
