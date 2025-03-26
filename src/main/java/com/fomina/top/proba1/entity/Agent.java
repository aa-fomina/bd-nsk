package com.fomina.top.proba1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="agent")
//@ToString
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name_agent;
    @Column
    private String address;
    @Column
    private String info;

    @OneToMany(mappedBy = "agent")
    private List<Flat> flats;

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", name_agent='" + name_agent + '\'' +
                ", address='" + address + '\'' +
                ", info='" + info + '\'' +

                '}';
    }
}
