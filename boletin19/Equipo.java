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
    
    
    public void amosaTabla(int [][]taboa,String []equipo,String[] clasificacion){
       
        float acumulador =0;                
        int notas=0;        
        for(int i = 0;i<clasificacion.length;i++){
            System.out.print("   "+ clasificacion[i]+"  ");
            
        }
        for(int f=0;f<taboa.length;f++){
             System.out.print("\n "+equipo[f]+"  ");   
             
             for(int c=0;c<taboa[f].length;c++){                        
               System.out.print(taboa[f][c]+ "  ");          
                            
            }                                   
        }
    
    
    
    }
     public void orderMinGoles(int [][]taboa,String []equipo,String[] clasificacion){
       int[]ordenar = new int[3];
         //Obter unha listaxe dos equipos por orde de menor
         //n° de goles na liga.
         
        int acumulador =0;                
        int notas=0;        
        for(int i = 0;i<clasificacion.length;i++){
            System.out.print("   "+ clasificacion[i]+"  ");
            
        }
        for(int f=0;f<taboa.length;f++){
             System.out.print("\n "+equipo[f]+"  ");   
             
             for(int c=0;c<taboa.length;c++){                        
               System.out.print(taboa[f][c]+ "  ");          
                            
               acumulador = taboa[f][c];

            }     
              
                ordenar[f]=acumulador;
                acumulador =0;
        }
        String aux =null;
    for(int i=0;i<equipo.length;i++){ 
          
        for(int x=0;x<ordenar.length;x++){ 
            if(ordenar[i] > ordenar[x]){
            ordenar[x] =ordenar[i];
            ordenar[i] =ordenar[x];
            aux = equipo[i];
         
        }
               equipo[i] = equipo[x];
            equipo[x] = aux;

    }
        
    
     }
       for(int f=0;f<equipo.length;f++){
            System.out.print("  orde " + equipo[f] + "  ");
        }
     
     }
}
