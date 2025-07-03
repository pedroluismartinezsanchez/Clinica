/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica;

import java.util.ArrayList;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class Propietario {
     private String nombre;
    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public Propietario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {
        for (Mascota m : mascotas) {
            m.mostrarInfo();
        }
    }
}
