package com.codegym.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "club")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Club {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameClub;

    private String image;

    private int yearFounder;

    private String ground;

    private int totalPlayer;

    private double investmentMoney;

    private String description;

    public Club() {
    }
}
