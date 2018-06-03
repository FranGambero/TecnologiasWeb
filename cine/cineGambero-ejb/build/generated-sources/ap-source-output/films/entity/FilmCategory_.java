package films.entity;

import films.entity.Category;
import films.entity.Film;
import films.entity.FilmCategoryPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-03T20:30:25")
@StaticMetamodel(FilmCategory.class)
public class FilmCategory_ { 

    public static volatile SingularAttribute<FilmCategory, Date> lastUpdate;
    public static volatile SingularAttribute<FilmCategory, FilmCategoryPK> filmCategoryPK;
    public static volatile SingularAttribute<FilmCategory, Film> film;
    public static volatile SingularAttribute<FilmCategory, Category> category;

}