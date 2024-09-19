package com.example.tennis_tournament.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer age;
    private String name;
    private String flag;
    private String avatar;
    private String dominantHand;
    private String country;
    private String ranking;
    private String style;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "group_id")
    private Groups groups;
}