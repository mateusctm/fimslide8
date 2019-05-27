/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateus
 */


import java.util.Scanner;

public class principal {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Double precoPneu = ler.nextDouble();
        Double precoMotor = ler.nextDouble();
        Double precoBanco = ler.nextDouble();
        Pneus teste1 = new Pneus();
        Bancos teste2 = new Bancos();
        Motor teste3 = new Motor();
        Carro teste = new Carro();
        Carro testes = new Carro();
        teste1.setrPreco(precoPneu);
        teste2.setPreco(precoMotor);
        teste3.setPreco(precoBanco);
       teste.setPreco(precoPneu, precoMotor, precoBanco);
       testes.setPreco(precoPneu, precoMotor, precoBanco);
        System.out.println(testes.getPreco());
                
    }
    
    
}
