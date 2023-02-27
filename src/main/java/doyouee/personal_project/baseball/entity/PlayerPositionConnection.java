package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Table(name = "player_position_connection")
@Entity
public class PlayerPositionConnection {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ppc_id")            private Long id;
    @Column(name = "ppc_pi_id")         private PlayerInfo player;
    @Column(name = "ppc_pp_id")         private PlayerPosition position;
}
