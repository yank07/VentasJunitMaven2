package entities;

import entities.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-08T19:40:35")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, Integer> id;
    public static volatile SingularAttribute<Pago, Integer> forma_pago;
    public static volatile SingularAttribute<Pago, Integer> cuotas;
    public static volatile SingularAttribute<Pago, Venta> venta;

}