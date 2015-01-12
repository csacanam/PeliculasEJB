package com.peliculas.entities;

import com.peliculas.entities.ShowTiming;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-11T16:08:58")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, Integer> id;
    public static volatile SingularAttribute<Movie, String> name;
    public static volatile SingularAttribute<Movie, String> actors;
    public static volatile ListAttribute<Movie, ShowTiming> showTimingList;

}