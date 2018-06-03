package films.entity;

import films.entity.FilmCategory;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-03T21:44:45")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Date> lastUpdate;
    public static volatile ListAttribute<Category, FilmCategory> filmCategoryList;
    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, Short> categoryId;

}