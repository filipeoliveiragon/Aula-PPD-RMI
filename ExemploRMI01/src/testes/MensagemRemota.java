/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.lang.Thread;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class MensagemRemota extends java.rmi.server.UnicastRemoteObject implements MensagemInterface {
    
    private String mensagem = "";
    private int contador = 0;
    private ArrayList<String> clientes;
    
    public MensagemRemota(String mensagem) throws RemoteException{
        super();
        this.mensagem = mensagem;
        this.clientes = new ArrayList<>();
    }
    
    public String falar() throws RemoteException{
        return this.mensagem;
    }
    
    public String falar(String mensagem) throws RemoteException{
        System.out.println("Algém enviou pra o servidor: " + mensagem);
        
        return "Você disse para o servidor: " + mensagem;
    }
    
    public int contar() throws RemoteException{
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Erro no objeto remoto: " +e.getMessage());
        }
        return ++contador;
    }
    
    public boolean identificar (String nome) throws RemoteException{
        System.out.println("Clientes conectados: " + (clientes.size() + 1));
        
        if(clientes.size() < 10){
            clientes.add(nome);
            System.out.println("Cliente " + nome + " conectado");
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList consultar() throws RemoteException{
        return this.clientes;
    }
    
    public String soma(String n1, String n2){
        double a = Double.parseDouble(n1);
        double b = Double.parseDouble(n2);
        double res = a + b;
        return Double.toString(res); 
    }
}
