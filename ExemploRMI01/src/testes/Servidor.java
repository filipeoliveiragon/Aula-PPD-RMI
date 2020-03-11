/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Aluno
 */
public class Servidor {
    public static void main(String[] args){
        try{
            System.setProperty("java.rmi.server.hostname", "10.60.34.10");
            LocateRegistry.createRegistry(1099);
            MensagemRemota msg = new MensagemRemota("Primeiro teste com RMI.");
            
            Naming.rebind("URLMensagem", msg);
            System.out.println("Servidor rodando...");
            
            
        }catch(Exception e){
            System.out.println("Erro ao carregar o servidor: " + e.getMessage());
        }
    }
}
