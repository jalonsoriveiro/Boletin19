/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;
import meusmetodos.PedirDato;

/**
 *
 * @author jalonsoriveiro
 */
public class Equipo {
    
    public void crearTablaEquipo(String[] equipo) {
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = PedirDato.PedirString();

        }
    }
    public void crearTablaJornada(String[] jornada) {
        for (int i = 0; i < jornada.length; i++) {
            jornada[i] = PedirDato.PedirString();

        }
    }
     public void crearTablaGoles(int[][] tabla, String[] equipo, String[] jornada) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = PedirDato.PedirInt();
            }
        }
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
     public void ordenarEquipos(int[][] goles, String[] equipo, int[] total) {
        int totalgor;
        for (int i = 0; i < goles.length; i++) {
            totalgor = 0;
            for (int j = 0; j < goles[0].length; j++) {
                totalgor = goles[i][j] + totalgor;
            }
            total[i] = totalgor;
            System.out.println("Goles marcados: " + total[i]);
        }
        int auxgol, auxtotal;
        String auxequ;
        for (int i = 0; i < total.length - 1; i++) {
            for (int j = 1 + 1; j < total.length; j++) {
                for (int k = 0; k < goles[0].length; k++) {
                    if (total[i] < total[j]) {
                        auxtotal = total[i];
                        total[i] = total[j];
                        total[j] = auxtotal;
                        auxequ = equipo[i];
                        equipo[i] = equipo[j];
                        equipo[j] = auxequ;
                        auxgol = goles[i][k];
                        goles[i][k] = goles[j][k];
                        goles[j][k] = auxgol;
                    }
                }
            }
        }

    }
      public void totalGolesEquipo(String[] equipo, int[] total) {
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("El " + equipo[i] + " marco un total de " + total[i]);
        }
        System.out.println("");
    }
       public void mostraTablaOrdenada(int[][] tabla, String[] equipo, String[] jornada, int[] golesTotal) {
        System.out.print("Equipo/Jornada  ");
        for (int k = 0; k < tabla.length; k++) {
            System.out.print(jornada[k] + " ");
        }
        System.out.println("");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(equipo[i] + " - ");
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println(" - " + golesTotal[i]);
        }
        System.out.println("");
    }
      
       public void buscarCantidadGolesEnJornada(String[] equipo, String[] jornada, int[][] goles) {
        int max;
        String equipom[] = new String[equipo.length];
        int i, j;

        for (i = 0; i < goles[0].length; i++) {
            max = 0;
            for (j = 0; j < goles.length; j++) {
                if (max <= goles[j][i]) {
                    max = goles[j][i];
                    equipom[j] = equipo[j];
                }
            }
            for (j = 0; j < goles.length; j++) {
                if (max == goles[j][i]) {
                    System.out.println("El equipo: " + equipom[j] + " marco un total de: " + max + " en la jornada: " + jornada[i]);
                }
            }
        }
        System.out.println("");
    }
        public void consultar(String[] equipo, String[] jornada, int[][] goles) {
        String jornadas, equipos;
        int posicionE = 0, posicionJ = 0;
        equipos = JOptionPane.showInputDialog(null, "Nombre de equipo a buscar");
        jornadas = JOptionPane.showInputDialog(null, "Introduzca la jornada a buscar \nLas jorandas se almacenana como:\n      X+numerodejornada");
        for (int i = 0; i < equipo.length; i++) {
            if (equipos.equals(equipo[i])) {
                posicionE = i;
            }
        }
        for (int i = 0; i < jornada.length; i++) {
            if (jornadas.equals(jornada[i])) {
                posicionJ = i;
            }
        }
        System.out.println("El equipo " + equipos + " marco " + goles[posicionE][posicionJ] + " en la jornada " + jornadas);

    }

    //10
    public void salir() {
        System.exit(0);
    }
}
