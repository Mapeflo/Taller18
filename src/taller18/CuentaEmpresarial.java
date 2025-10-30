/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller18;

/**
 *
 * @author marya
 */
public class CuentaEmpresarial implements Transferencia, PagoFactura {
    
    @Override
    public void tranferir(double monto, String cuentaDestino){
        System.out.println("Se realizo una transferencia de $" + monto + "a" + cuentaDestino);
    } 
    
    @Override
    public void pagarFactura(double monto, String referencia){
        System.out.println("Se realizo el pago de la factura de $" + monto + "a la ref: " + referencia);
    }
}
 