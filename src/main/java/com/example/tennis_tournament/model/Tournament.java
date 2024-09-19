package com.example.tennis_tournament.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String location;
    private boolean status;
    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private List<Groups> groups;

    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private List<KnockoutStage> knockoutStage;

    @Transient
    private int numberOfPlayers;
}
