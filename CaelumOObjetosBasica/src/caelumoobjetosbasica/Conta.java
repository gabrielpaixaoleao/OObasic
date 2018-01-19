/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelumoobjetosbasica;

/**
 *
 * @author Gabriel
 */
public class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente titular = new Cliente();
    
    void sacaB(double quantidade){
        this.saldo -= quantidade; //o this serve para dizer que estamos usando um atributo da classe
    }
    
    void deposita(double quantidade){
       this.saldo += quantidade; 
    }
    
    void transfereB(Conta destino, double valor){
        this.saldo -= valor;
        destino.saldo += valor;
    }
    
    boolean saca(double valor){
       if(this.saldo < valor){
           return false;
       }else{
           return true;
       } 
    }
    
    boolean transfere(Conta destino, double valor){
        if(this.saca(valor) == false){
            System.out.println("Saldo insuficiente...");
            return false;
        }else{
            destino.deposita(valor);
            System.out.println("Operação realizada com sucesso!");
            return true;
        }
    }
    
    
    
}
