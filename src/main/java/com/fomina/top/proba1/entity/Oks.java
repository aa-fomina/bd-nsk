package com.fomina.top.proba1.entity;

import jakarta.persistence.*;
import lombok.*;

import org.geolatte.geom.MultiPolygon;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Builder
@Entity

@Table(name="oks")
//@ToString(includeFieldNames=true)
public class Oks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique=true)
    //@Type (type = "org.hibernate.spatial.GeometryType")
    private MultiPolygon geom;
    @Column
    private String build;
    @Column
    private String street;
    @Column

    private String full_street;
    @Column
    private String number;
    @Column
    private String mkr;
    @Column
    private String post_index;
    @Column
    private Integer level;
    @Column
    private float lat;
    @Column
    private float lon;

    @OneToOne(mappedBy = "oks")
    private Doma doma;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MultiPolygon getGeom() {
        return geom;
    }

    public void setGeom(MultiPolygon geom) {
        this.geom = geom;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFull_street() {
        return full_street;
    }

    public void setFull_street(String full_street) {
        this.full_street = full_street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMkr() {
        return mkr;
    }

    public void setMkr(String mkr) {
        this.mkr = mkr;
    }

    public String getPost_index() {
        return post_index;
    }

    public void setPost_index(String post_index) {
        this.post_index = post_index;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public Doma getDoma() {
        return doma;
    }

    public void setDoma(Doma doma) {
        this.doma = doma;
    }

    @Override
    public String toString() {
        return "Oks{" +
                "id=" + id +
                ", geom=" + geom +
                ", build='" + build + '\'' +
                ", street='" + street + '\'' +
                ", full_street='" + full_street + '\'' +
                ", number='" + number + '\'' +
                ", mkr='" + mkr + '\'' +
                ", post_index='" + post_index + '\'' +
                ", level=" + level +
                ", lat=" + lat +
                ", lon=" + lon +

                '}';
    }
}
