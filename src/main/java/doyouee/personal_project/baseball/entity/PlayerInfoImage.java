package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Table(name = "player_info")
@Entity
public class PlayerInfoImage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pii_id")            private Long id;
    @Column(name = "pii_file")          private String file;
    @Column(name = "pii_uri")           private String uri;
    @Column(name = "pii_pi_id")         private PlayerInfo player;
}
