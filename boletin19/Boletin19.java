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
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]matriz = new int[3][4];
        String[] Equipo={"Celta","Depor","Malaga"};
        String[] clasificacion={"1X","2X","3X","4X"};
        
        
        Equipo obx = new Equipo();
        
        //obx.amosaTabla(obx.crearMatriz(matriz), Equipo, clasificacion);
        obx.orderMinGoles(obx.crearMatriz(matriz), Equipo, clasificacion);
        
        
    }
    
}
