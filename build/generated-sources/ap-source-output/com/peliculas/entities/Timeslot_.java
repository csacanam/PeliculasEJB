package com.peliculas.entities;

import com.peliculas.entities.ShowTiming;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T01:14:44")
@StaticMetamodel(Timeslot.class)
public class Timeslot_ { 

    public static volatile SingularAttribute<Timeslot, Integer> id;
    public static volatile SingularAttribute<Timeslot, String> startTime;
    public static volatile ListAttribute<Timeslot, ShowTiming> showTimingList;
    public static volatile SingularAttribute<Timeslot, String> endTime;

}