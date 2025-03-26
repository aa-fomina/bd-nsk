package com.fomina.top.proba1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="flat")
@ToString
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int level;
    @Column
    private int room;

    @Column(precision = 10, scale = 2)
    private BigDecimal area;
    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name="domid")
    private Doma doma;

    @ManyToOne
    @JoinColumn(name="clientid")
    private Client client;

    @ManyToOne
    @JoinColumn(name="agentid")
    private Agent agent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Doma getDoma() {
        return doma;
    }

    public void setDoma(Doma doma) {
        this.doma = doma;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", level=" + level +
                ", room=" + room +
                ", area=" + area +
                ", price=" + price +
                ", doma=" + doma +
                ", client=" + client +
                ", agent=" + agent +
                '}';
    }
}
