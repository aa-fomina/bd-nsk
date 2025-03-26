package com.fomina.top.proba1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.geolatte.geom.MultiPoint;
import org.geolatte.geom.MultiPolygon;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Builder
@Entity

@Table(name="metro")
public class Metro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique=true)
    //@Type (type = "org.hibernate.spatial.GeometryType")
    private MultiPoint geom;
    @Column
    private String name_metro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MultiPoint getGeom() {
        return geom;
    }

    public void setGeom(MultiPoint geom) {
        this.geom = geom;
    }

    public String getName_metro() {
        return name_metro;
    }

    public void setName_metro(String name_metro) {
        this.name_metro = name_metro;
    }
}
