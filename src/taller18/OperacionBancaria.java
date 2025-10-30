/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller18;

/**
 *
 * @author marya
 */
public interface OperacionBancaria {
    
    void transferir(double monto, String cuentaDestino);
    void retirar(double monto);
    void pagarFactura(double monto, String referencia);
}
