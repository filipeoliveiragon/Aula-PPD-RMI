/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;
import java.rmi.Naming;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */

public class Cliente {
    public static void main(String[] args){
        try{
            MensagemInterface objRemoto = (MensagemInterface) Naming.lookup("//localhost/URLMensagem");
            System.out.println(objRemoto.falar());
            System.out.println(objRemoto.falar("É quarta feira meus bacanos"));
            
        }catch(Exception e){
            System.out.println("Erro ao carregar o servidor: " + e.getMessage());
        }
    }
}
