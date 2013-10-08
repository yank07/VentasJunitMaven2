/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import entities.Pago;
import entities.Venta;
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
public class PagoFacade extends AbstractFacade<Pago> {
    @PersistenceContext(unitName = "CRUDPU")
    private EntityManager em;
    private Pago pago;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PagoFacade() {
        super(Pago.class);
    }

    public Pago updateContado(Venta venta, int id_pago) {
        pago=this.find(id_pago);
        pago.setForma_pago(0);
        pago.setCuotas(0);
        pago.setVenta(venta);
        this.edit(pago);
        return pago;
    }

    public Pago updateCredito(Venta venta, int id_pago, int cuotas) {
        pago=this.find(id_pago);
        pago.setForma_pago(1);
        pago.setCuotas(cuotas);
        pago.setVenta(venta);
        this.edit(pago);
        return pago;        
    }
    
}
