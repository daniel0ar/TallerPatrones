/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;

import java.time.LocalDate;

/**
 *
 * @author Danie
 */
public interface Comprobante {
    	public ComprobanteElectronico crearComprobante(String nombreCliente, long codigo, LocalDate fecha);

}
