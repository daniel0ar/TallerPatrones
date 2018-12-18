/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import creacional.ComprobanteElectronico;

/**
 *
 * @author Danie
 */
public class LemaDecorator extends DetallesDecorator{
    private ComprobanteElectronico comprobante;
    
    public LemaDecorator(){
        this.comprobante = null;
    }
    
    public LemaDecorator(ComprobanteElectronico comprobante){
        this.comprobante = comprobante;
    }
}
