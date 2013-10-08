/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import entities.Venta;
import entities.VentaDetalle;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cynthia
 */
@Stateless
@LocalBean
public class VentaFacade extends AbstractFacade<Venta> {
    @PersistenceContext(unitName = "CRUDPU")
    private EntityManager em;
    List <Venta> listaVenta;
    Venta venta;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentaFacade() {
        super(Venta.class);
    }


    public Venta listarUVenta() {
        listaVenta= this.findAll();
        venta= listaVenta.get(listaVenta.size()-1);
        System.out.println(venta.getDetalles().toString());
        return venta;
    }

    public void sumarTotal(Venta venta, VentaDetalle ventadetalle) {
        int ventaTotal;
        ventaTotal = venta.getTotal()+ ventadetalle.getCant_venta()*ventadetalle.getProducto().getPrecio();
        venta.setTotal(ventaTotal);
        em.merge(venta);

        
    }

    
    
    
}
