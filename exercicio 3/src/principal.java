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

/**
 *
 * @author Mateus
 */
public class principal {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String nomeCliente = ler.nextLine();
        String codigoCliente = ler.nextLine();
        
        Cliente teste = new Cliente(codigoCliente);
        teste.inseriNome(nomeCliente);
        System.out.println(teste.retornaCodigo());
        System.out.println(teste.retonaNome());
    }
    
}
