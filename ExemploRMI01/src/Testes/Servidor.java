package Testes;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            MensagemRemota msg = new MensagemRemota("Primeiro acesso RMI!");
            Naming.rebind("URLMensagem", msg);
            System.out.println("Servidor rodando...");
        } catch (Exception e) {
            System.err.println("Erro ao carregar o servidor: " + e.getMessage());
        }
    }
}