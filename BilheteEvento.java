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
public class BilheteEvento {
   public static final int NAO_USADO = 0;
   public static final int ENTRADA = 1;
   public static final int SAIDA = 2;
   private int estado;
    

    public BilheteEvento() {
        estado =NAO_USADO;
        
    }

    
    public void Entrada () {
        estado = ENTRADA;
        
    }
    public void saida () {
        estado = SAIDA;

    }
    public void imprime () {
        if(estado==ENTRADA){
        System.out.println("ENTRADA " + estado );
        }if(estado==SAIDA){
           System.out.println ("Saida "+ estado);
        }if(estado==NAO_USADO)
            System.out.println("Não usado " +estado);
          
        }
        
        
    public int getEstado() {
        return estado;
    }

        public void setEstado(int estado) {
        this.estado = estado;
    }

   
    
}
