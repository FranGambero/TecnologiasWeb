package twitter.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import twitter.entity.Pais;
import twitter.entity.Tuit;
import twitter.entity.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T12:05:56")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> descripcion;
    public static volatile SingularAttribute<Usuario, Date> fecha;
    public static volatile CollectionAttribute<Usuario, Tuit> tuitCollection2;
    public static volatile CollectionAttribute<Usuario, Tuit> tuitCollection1;
    public static volatile CollectionAttribute<Usuario, Usuario> usuarioCollection;
    public static volatile CollectionAttribute<Usuario, Tuit> tuitCollection;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> url;
    public static volatile SingularAttribute<Usuario, Long> idusuario;
    public static volatile CollectionAttribute<Usuario, Usuario> usuarioCollection1;
    public static volatile SingularAttribute<Usuario, Pais> pais;

}