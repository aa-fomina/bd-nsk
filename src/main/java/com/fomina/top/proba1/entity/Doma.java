package com.fomina.top.proba1.entity;

import jakarta.persistence.*;
import lombok.*;
import org.geolatte.geom.MultiPolygon;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@ToString
@Table(name="doma")
public class Doma{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String zh_address;
    @Column(precision = 10, scale = 2)

    private BigDecimal area;
    @Column
    private int year;
    @Column
    private int floor;
    @Column
    private int oldid;


//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "oksid", referencedColumnName = "id", insertable = false, updatable = false)
//    private Oks oks;
@OneToOne
@JoinColumn(name = "oksid")
private Oks oks;

    @OneToMany(mappedBy = "doma")
    private List<Flat> flats;


    @Override
    public String toString() {
        return "Doma{" +
                "id=" + id +
                ", zh_address='" + zh_address + '\'' +
                ", area=" + area +
                ", year=" + year +
                ", floor=" + floor +
                ", oldid=" + oldid +
                ", oks=" + oks +

                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZh_address() {
        return zh_address;
    }

    public void setZh_address(String zh_address) {
        this.zh_address = zh_address;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getOldid() {
        return oldid;
    }

    public void setOldid(int oldid) {
        this.oldid = oldid;
    }

    public Oks getOks() {
        return oks;
    }

    public void setOks(Oks oks) {
        this.oks = oks;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }
}
