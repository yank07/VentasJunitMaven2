package entities;

import entities.Cliente;
import entities.VentaDetalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-08T19:40:35")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> total;
    public static volatile SingularAttribute<Venta, Cliente> clienteId;
    public static volatile ListAttribute<Venta, VentaDetalle> detalles;
    public static volatile SingularAttribute<Venta, Integer> id_venta;

}