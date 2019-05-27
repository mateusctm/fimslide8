/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateus
 */
public class Motor {
    private String potencia;
    private Double preco;
    private String fabricante;
    
    public void setPotencia(String potencia){
        this.potencia = potencia;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getPotencia(){
        return potencia;
    }
    public Double getPreco(){
        return preco;
    }
    public String getFabricante(){
        return fabricante;
    }
}
