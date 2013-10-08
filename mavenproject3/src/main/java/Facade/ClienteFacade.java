/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import entities.Cliente;
import java.util.Collection;
import java.util.List;
import javax.annotation.security.PermitAll;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Cynthia
 */
@Stateless
@LocalBean
public class ClienteFacade extends AbstractFacade<Cliente> {
    @PersistenceContext(unitName = "CRUDPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
    
    @PermitAll
    public int verify() {
        String result = null;
       List <Cliente> entities;
        entities = this.findAll();
        int s = entities.size();
        for (Object o : entities) {
            Cliente se = (Cliente) o;
            System.out.println("Found: " + se.getNombre());
        }

        return s;
    }

    @PermitAll
    public void insert(int num) {
        for (int i = 800; i <= 700+num-1; i++) {
            System.out.println("Inserting # " + i);
            Cliente e = new Cliente(i);
            em.persist(e);
        }
    }
    
}
