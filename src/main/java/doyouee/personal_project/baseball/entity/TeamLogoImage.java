package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Table(name = "team_logo_image")
@Entity
public class TeamLogoImage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tli_id")                private Long id;
    @Column(name = "tli_name")              private String name;
    @Column(name = "tli_year")              private String year;
    @Column(name = "tli_file")              private String file;
    @Column(name = "tli_uri")               private String uri;
    @Column(name = "tli_ti_id")             private TeamInfo team;
}
