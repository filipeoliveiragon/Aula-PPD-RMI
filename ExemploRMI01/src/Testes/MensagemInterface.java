package Testes;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MensagemInterface extends Remote {
    public String falar()throws RemoteException;
    public String falar(String mensagem)throws RemoteException;
    public int contar() throws RemoteException;
    
}
