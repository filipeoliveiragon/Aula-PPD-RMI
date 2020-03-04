package Testes;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.lang.Thread;

public class MensagemRemota extends java.rmi.server.UnicastRemoteObject implements MensagemInterface {
    private String mensagem = "";
    private int contador = 0;
    
    public MensagemRemota(String mensagem) throws RemoteException{
        super();
        this.mensagem = mensagem;
    }
    
    public String falar()throws RemoteException{
        return this.mensagem;
    }
    
    public int contar() throws RemoteException{
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println("Erro no objeto remoto: " + e.getMessage());
        }
        return ++contador;
    }
    
}
