package twitter.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import twitter.entity.Pais;
import twitter.entity.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T12:05:56")
@StaticMetamodel(Tuit.class)
public class Tuit_ { 

    public static volatile SingularAttribute<Tuit, String> texto;
    public static volatile SingularAttribute<Tuit, Date> fecha;
    public static volatile SingularAttribute<Tuit, Usuario> usuario;
    public static volatile CollectionAttribute<Tuit, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Tuit, Long> status;
    public static volatile CollectionAttribute<Tuit, Usuario> usuarioCollection1;
    public static volatile SingularAttribute<Tuit, Pais> pais;

}