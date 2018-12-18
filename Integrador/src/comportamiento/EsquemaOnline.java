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
public class EsquemaOnline implements Esquema{

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        int aleatorio = (int) (Math.random()*136347750+1);  // Para simular codigo del SRI
        comprobante.setNumeroAutorizacion(String.valueOf(aleatorio));
    }
    
}
