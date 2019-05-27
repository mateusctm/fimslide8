/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateus
 */
public class Carro {
    private Pneus c;
    private Bancos s;
    private Motor a;
    private Double precoDoCarro;
    
    public void setPreco (Double precoP, Double precoM, Double precoB){
       precoDoCarro = precoP + precoM + precoB;
        
        
    }
    public Double getPreco(){
        return precoDoCarro;
    }
    
}
