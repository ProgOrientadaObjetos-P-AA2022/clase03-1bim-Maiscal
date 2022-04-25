/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    
    /*Crear los método necesarios*/
    
    public void establecerNombre(String name){
        this.nombre = name;
    }

    public void establecerTipoInstitucion(String tipo){
        this.tipoInstitucion = tipo;
    }
    
    public void establecerNumeroAlumnos(int numA){
        this.numeroAlumnos = numA;
    }
    
    public void establecerNumeroDocentes(int numD){
        this.numeroDocentes = numD;
    } 
    
    public void establecerNumeroSedes(int numS){
        this.numeroSedes = numS;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    
    
}
