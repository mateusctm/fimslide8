
public class pedido {
    private String codigoDoPedido;
    private String nomeDoCliente;
    private String descricaoDoPedido;
    
    public pedido(String codigoDoPedido, String nomeDoCliente, String descricaoDoPedido){
    
    }
    public void modificarNome(String nomeCliente){
       nomeDoCliente = nomeCliente;   
    }
    public void modificarDescricao(String descricaoPedido){
        descricaoDoPedido = descricaoPedido;
    }
    public String retornarDescricao(){
        return descricaoDoPedido;
    }
    public String retorneNomeCliente(){
        return nomeDoCliente;
    }
    
    
}
