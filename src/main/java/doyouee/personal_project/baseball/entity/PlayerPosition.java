package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Table(name = "player_position")
@Entity
public class PlayerPosition {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pp_id")             private Long id;
    @Column(name = "pp_name")           private String name;
    @Column(name = "pp_introduce")      private String introduce;
}
