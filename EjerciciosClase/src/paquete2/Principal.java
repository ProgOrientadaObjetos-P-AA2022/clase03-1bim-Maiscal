/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        
        i1.establecerNombre("Marlon");
        i1.establecerTipoInstitucion("Shun");
        i1.establecerNumeroAlumnos(5000);
        i1.establecerNumeroDocentes(100);
        i1.establecerNumeroSedes(60);
        

        
        System.out.printf("%s     ", i1.);
    }
}
