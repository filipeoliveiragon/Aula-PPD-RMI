package Testes;

import java.rmi.Naming;

public class Cliente {
    public static void main(String[] args) {
        try {
            MensagemInterface objRemoto = (MensagemInterface) Naming.lookup("//localhost/URLMensagem");
            
            System.out.println(objRemoto.falar());
            
            for (int i = 0; i < 10; i++) {
                System.out.println(objRemoto.falar("Filipe"));
                System.out.println("Contador: " + objRemoto.contar());
            }
        } catch (Exception e) {
            System.err.println("Erro ao acessar o servidor: " + e.getMessage());
        }
    }
    
}
