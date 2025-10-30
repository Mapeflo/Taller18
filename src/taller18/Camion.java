/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller18;

/**
 *
 * @author marya
 */
public class Camion implements TransporteMercancias {
    
    @Override
    public void cargarMercancia(double peso){
        System.out.println("El camion ha cargado: " +peso+ "Kg");
    }
}
