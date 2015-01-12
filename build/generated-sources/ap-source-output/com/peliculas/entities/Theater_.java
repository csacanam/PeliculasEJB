package com.peliculas.entities;

import com.peliculas.entities.ShowTiming;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-12T13:02:09")
@StaticMetamodel(Theater.class)
public class Theater_ { 

    public static volatile SingularAttribute<Theater, Integer> id;
    public static volatile SingularAttribute<Theater, Integer> capacity;
    public static volatile ListAttribute<Theater, ShowTiming> showTimingList;

}