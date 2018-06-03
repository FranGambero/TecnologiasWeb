package films.entity;

import films.entity.FilmActor;
import films.entity.FilmCategory;
import films.entity.Language;
import films.entity.Rating;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-03T21:44:45")
@StaticMetamodel(Film.class)
public class Film_ { 

    public static volatile SingularAttribute<Film, Short> fLength;
    public static volatile ListAttribute<Film, FilmActor> filmActorList;
    public static volatile SingularAttribute<Film, String> rentalRate;
    public static volatile SingularAttribute<Film, Short> rentalDuration;
    public static volatile ListAttribute<Film, FilmCategory> filmCategoryList;
    public static volatile SingularAttribute<Film, Language> languageId;
    public static volatile SingularAttribute<Film, String> description;
    public static volatile SingularAttribute<Film, String> replacementCost;
    public static volatile SingularAttribute<Film, String> title;
    public static volatile SingularAttribute<Film, String> specialFeatures;
    public static volatile SingularAttribute<Film, Short> filmId;
    public static volatile SingularAttribute<Film, Date> lastUpdate;
    public static volatile SingularAttribute<Film, Rating> ratingId;
    public static volatile SingularAttribute<Film, Language> originalLanguageId;
    public static volatile SingularAttribute<Film, Integer> releaseYear;

}