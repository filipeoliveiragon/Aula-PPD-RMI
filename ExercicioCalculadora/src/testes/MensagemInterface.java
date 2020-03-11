package testes;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface MensagemInterface extends Remote {
    
    public String falar() throws RemoteException;
    public String falar(String mensagem) throws RemoteException;
    public int contar() throws RemoteException;
    public boolean identificar(String nome) throws RemoteException;
    public ArrayList consultar() throws RemoteException;
    public String soma(String, String);
}
