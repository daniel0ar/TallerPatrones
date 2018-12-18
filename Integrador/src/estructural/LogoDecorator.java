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
public class LogoDecorator extends DetallesDecorator{
    private ComprobanteElectronico comprobante;
    
    public LogoDecorator(){
        this.comprobante = null;
    }
    
    public LogoDecorator(ComprobanteElectronico comprobante){
        this.comprobante = comprobante;
    }
}
