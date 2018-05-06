package twitter.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import twitter.entity.Tuit;
import twitter.entity.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T12:05:56")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile SingularAttribute<Pais, String> idpais;
    public static volatile SingularAttribute<Pais, String> paisIsoCode;
    public static volatile SingularAttribute<Pais, String> region;
    public static volatile CollectionAttribute<Pais, Tuit> tuitCollection;
    public static volatile CollectionAttribute<Pais, Usuario> usuarioCollection;

}