package com.fomina.top.proba1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="client")
//@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String full_name;
    @Column
    private int age;
    @Column
    private String info;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String login;
    @Column
    private String password;

    @OneToMany(mappedBy = "client")
    private List<Flat> flats;


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", age=" + age +
                ", info='" + info + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}
