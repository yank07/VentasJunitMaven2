package entities;

import entities.VentaDetalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-08T19:40:35")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Integer> precio;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Integer> id_producto;
    public static volatile ListAttribute<Producto, VentaDetalle> listaVentaDetalles;

}