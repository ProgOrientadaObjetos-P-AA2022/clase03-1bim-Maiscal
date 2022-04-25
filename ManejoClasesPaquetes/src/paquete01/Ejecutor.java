/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        //Agregar valores a los atributos de h1 y h2, por teclado
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);// es punto para utilizar en vez de la coma para numero decimales.
        
        String name;
        int nCamas;
        double nP;
        
        System.out.println("dijite el nombre: ");
        name = entrada.nextLine();
        System.out.println("dijite el numero de camas: ");
        nCamas = entrada.nextInt();
        System.out.println("dijite el presupuesto: ");
        nP = entrada.nextDouble();
        entrada.nextLine();//Limpieza o ya veras...
        
        Hospital h1 = new Hospital();
        h1.establecerNombre(name);
        h1.establecerNumeroCamas(nCamas);
        h1.establecerPresupuesto(nP);
        
        
        
        System.out.println("dijite el nombre: ");
        name = entrada.nextLine();
        System.out.println("dijite el numero de camas: ");
        nCamas = entrada.nextInt();
        System.out.println("dijite el presupuesto: ");
        nP = entrada.nextDouble();
        
        
        
        Hospital h2 = new Hospital();
        h2.establecerNombre(name);
        h2.establecerNumeroCamas(nCamas);
        h2.establecerPresupuesto(nP);
                              
        
        
        System.out.println("---------------------------------------------");
        System.out.printf("%s \n", "Hola desde el main");
        
        System.out.printf("%s -%d -%.2f\n", h1.obtenerNombre(), 
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        
        System.out.println("---------------------------------------------");
        
        System.out.printf("%s -%d -%.2f\n", h2.obtenerNombre(), 
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());   
    }
}
