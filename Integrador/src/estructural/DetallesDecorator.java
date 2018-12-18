/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import creacional.ComprobanteElectronico;
import java.util.List;

/**
 *
 * @author Danie
 */
public class DetallesDecorator {
    private ComprobanteElectronico comprobante;
    
    public List<String> getDetalles(){
        return this.comprobante.getDetallesEmisor();
    }
    
    public ComprobanteElectronico getComprobante(){
        return this.comprobante;
    }
}
