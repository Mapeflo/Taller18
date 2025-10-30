/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller18;

/**
 *
 * @author marya
 */
public class CajeroAutomatico implements Retiro {
    
    @Override
    public void retirar(double monto){
        System.out.println("Retiro de $" + monto + "en el cajero basico");     
    } 
}
