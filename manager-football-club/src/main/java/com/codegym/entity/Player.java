package com.codegym.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "players")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_player")
    private String namePlayer;

    @Column(name = "football_club")
    private String footballClub;

    @Column(name = "year_of_birthday")
    private int yearOfBirth;

    private String national;

    private String position;

    private int number;

    @Column(name = "market_value")
    private double marketValue;

    private double salary;

    private Boolean isDeleted;

    public Player() {
    }
}
