package entities;

import entities.Producto;
import entities.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-08T19:40:35")
@StaticMetamodel(VentaDetalle.class)
public class VentaDetalle_ { 

    public static volatile SingularAttribute<VentaDetalle, Integer> id_ventadetalle;
    public static volatile SingularAttribute<VentaDetalle, Producto> productoId;
    public static volatile SingularAttribute<VentaDetalle, Venta> ventaId;
    public static volatile SingularAttribute<VentaDetalle, Integer> cant_venta;

}