/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamiento;

import creacional.ComprobanteElectronico;

/**
 *
 * @author Danie
 */
public class EsquemaOffline implements Esquema{

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        comprobante.setNumeroAutorizacion(comprobante.getClaveAcceso());
    }
    
}
