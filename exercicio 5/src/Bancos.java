/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateus
 */
public class Bancos {
    private Double preco;
    private String modelo;
    private String fabricante;
    
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    public void setfabricante(String fabricante ){
    this.fabricante = fabricante;
    }        
    public Double getPreco(){
        return preco;
    }
    public String getModelo(){
        return modelo;
    }
    public String getfabricante(){
        return fabricante;
    }
            
                    
    
}
