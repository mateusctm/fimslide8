/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateus
 */
public class Cliente {
    private String nomeDoCliente;
    private String codigoDoCliente;
    
    public Cliente(String codigoDoCliente){
        this.codigoDoCliente = codigoDoCliente;
    }
    
    public void inseriNome(String nomeDoCliente){
        this.nomeDoCliente = nomeDoCliente;
    }
    public String retonaNome(){
        return nomeDoCliente;
    }
    public String retornaCodigo(){
        return codigoDoCliente;
    }
}
