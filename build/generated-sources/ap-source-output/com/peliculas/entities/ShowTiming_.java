package com.peliculas.entities;

import com.peliculas.entities.Movie;
import com.peliculas.entities.Sales;
import com.peliculas.entities.Theater;
import com.peliculas.entities.Timeslot;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-12T13:02:09")
@StaticMetamodel(ShowTiming.class)
public class ShowTiming_ { 

    public static volatile SingularAttribute<ShowTiming, Integer> id;
    public static volatile SingularAttribute<ShowTiming, Movie> movieId;
    public static volatile SingularAttribute<ShowTiming, Timeslot> timingId;
    public static volatile SingularAttribute<ShowTiming, Sales> sales;
    public static volatile SingularAttribute<ShowTiming, Integer> day;
    public static volatile SingularAttribute<ShowTiming, Theater> theaterId;

}