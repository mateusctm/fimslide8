/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateus
 */
public class Pneus {
    private double preco;
    private String tipo;
    private String fabricante;
    
    public void setrPreco(Double preco){
        this.preco = preco;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public Double getPreco (){
        return preco;
    }
    public String getTipo(){
        return tipo;
    }
    public String getFrabricante(){
        return fabricante;
    }
}
