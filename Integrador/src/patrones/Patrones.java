/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import comportamiento.AutorizadorSRI;
import comportamiento.EsquemaOnline;
import creacional.ComprobanteElectronico;
import creacional.ComprobantesFactory;
/**
 *
 * @author Danie
 */
import creacional.Factura;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComprobantesFactory factory = new ComprobantesFactory();

        ComprobanteElectronico comprobante = factory.getComprobante("FACTURA");

        comprobante.setClaveAcceso("1234567890");

        comprobante.setCodigo(90000);

        ArrayList<String> detalles = new ArrayList<>();

        detalles.add("0991225869");

        detalles.add("daniel0ar");

        comprobante.setDetallesEmisor(detalles);

        LocalDate date = LocalDate.of(2018, Month.DECEMBER, 17);

        comprobante.setFecha(date);

        comprobante.setNombreCliente("Daniel");

        AutorizadorSRI sri = new AutorizadorSRI(new EsquemaOnline());

        sri.autorizar(comprobante);

        Factura factura = (Factura)comprobante;

        factura.setTotal(20.00);

        ArrayList<String> productos = new ArrayList<>();

        productos.add("carro");

        productos.add("mesa");

        factura.setProductos(productos);

        System.out.println(factura.toString());
    }
    
}
