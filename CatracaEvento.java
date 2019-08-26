/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilheteevento;

/**
 *
 * @author Caio
 */
public class CatracaEvento {
    
    int qtdepessoas;

    public CatracaEvento(int qtdepessoas) {
        this.qtdepessoas = qtdepessoas;
    }
    
    public void RegistaEntrada(BilheteEvento Bilhete) {
        System.out.print("A entrada de bilhetes" + qtdepessoas);
        
    }
    public void RegistraSaida (BilheteEvento Bilhete) {
        System.out.print("");
        
    }
    public void imprime () {
        System.out.println("Quantas pessoas tem no evento" +qtdepessoas);
    }
    
}
