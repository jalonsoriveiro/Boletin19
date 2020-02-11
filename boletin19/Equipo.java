/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author jalonsoriveiro
 */
public class Equipo {
    
    public int[][] crearMatriz(int[][]taboa){
    
        for(int f=0;f<taboa.length;f++){
    
            for(int c=0;c<taboa[f].length;c++){
            
                taboa[f][c]= meusmetodos.PedirDato.PedirInt();
            
            }        
        }
        return  taboa;    
    } 
    
    
    
}
