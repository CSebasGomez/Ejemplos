/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Estudiante
 */
public class JavaApplication1 {

    
    public static void main(String[] args) {
        Persona p1= new Persona ("Sebas", 19 , "gerente");
        Club arroz = new Club ("clubLibros");
        arroz.gerente = p1;
        arroz.imprimirGerente();
    }
    
}
