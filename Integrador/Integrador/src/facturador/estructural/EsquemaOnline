/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

import java.util.Random;


/**
 *
 * @author Adan
 */
public class EsquemaOnline implements Esquema {

   

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {

        long rand = (int)(Math.random()*1000000000)+1;
        comprobante.setCodigo(rand);
        comprobante.setNumeroAutorizacion(String.valueOf(rand));

    }
    
}
