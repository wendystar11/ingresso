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
public class Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BilheteEvento b1;
        
        b1= new BilheteEvento();
        
        b1.Entrada();
        b1.saida();
        if(b1.getEstado() == b1.ENTRADA)
            b1.Entrada();
        b1.imprime();
        
        
        
        
        
        
    }
    
}
