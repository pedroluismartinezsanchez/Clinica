/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinica;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class Clinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Propietario p1 = new Propietario("Ana");
        Mascota m1 = new Mascota("Toby");
        Mascota m2 = new Mascota("Luna");

        p1.agregarMascota(m1);
        p1.agregarMascota(m2);

        p1.mostrarMascotas();
    }
    
    
}
