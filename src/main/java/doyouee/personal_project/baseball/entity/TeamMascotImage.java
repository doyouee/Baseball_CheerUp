package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Table(name = "team_mascot_image")
@Entity
public class TeamMascotImage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tmi_id")                private Long id;
    @Column(name = "tmi_name")              private String name;
    @Column(name = "tmi_year")              private String year;
    @Column(name = "tmi_file")              private String file;
    @Column(name = "tmi_uri")               private String uri;
    @Column(name = "tmi_ti_id")             private TeamInfo team;
}
