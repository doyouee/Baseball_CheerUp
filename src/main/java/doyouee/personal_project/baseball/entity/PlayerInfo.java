package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Table(name = "player_info")
@Entity
public class PlayerInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pi_id")             private Long id;
    @Column(name = "pi_name")           private String name;

    public PlayerInfo(String name) {
        this.name = name;
    }
}
