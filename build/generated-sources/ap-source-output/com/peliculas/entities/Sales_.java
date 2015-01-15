package com.peliculas.entities;

import com.peliculas.entities.ShowTiming;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-14T17:28:35")
@StaticMetamodel(Sales.class)
public class Sales_ { 

    public static volatile SingularAttribute<Sales, Integer> id;
    public static volatile SingularAttribute<Sales, Double> amount;
    public static volatile SingularAttribute<Sales, ShowTiming> showTiming;

}