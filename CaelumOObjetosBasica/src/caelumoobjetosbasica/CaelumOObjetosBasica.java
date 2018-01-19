package caelumoobjetosbasica;

import java.util.Scanner;

public class CaelumOObjetosBasica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta con = new Conta();
        
        Cliente clienteConta = new Cliente();
        
        System.out.println("Insira o nome do titular da conta: ");
        con.titular.nome = sc.next();
        
        System.out.println(con.saldo);

        System.out.println("\nDeseja sacar algum dinheiro da conta?\nSe sim, informe-o: ");
        con.saca(sc.nextDouble());
        
        System.out.println("\nDeseja depoistar algum valor na sua conta?\nSe sim, digite-o: ");
        con.deposita(sc.nextDouble());
        
        System.out.println("O seu saldo é de: "+con.saldo);  
    }
    
}