/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pats.pkg16.pkg5.calificacionfinal;

import java.util.Scanner;

/**
 *
 * @author edgardo
 */
public class PATS165CalificacionFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float participacion, examen1, examen2, examenFinal,calFinal;
        Scanner teclado = new Scanner(System.in);
        
        //Ingresar datos y calculamos
        System.out.print("Participacion: ");
        participacion = (teclado.nextFloat())*.10f;
        System.out.print("Primer Examen: ");
        examen1 = (teclado.nextFloat())*.25f;
        System.out.print("Segundo Examen: ");
        examen2 = (teclado.nextFloat())*.25f;
        System.out.print("Examen Final: ");
        examenFinal = (teclado.nextFloat())*.40f;
        
        calFinal = participacion + examen1 + examen2 + examenFinal; 
        System.out.println(calFinal);

    }
    
}
