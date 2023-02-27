package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Table(name = "stadium_info_image")
@Entity
public class StadiumInfoImage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sii_id")                private Long id;
    @Column(name = "sii_file")              private String file;
    @Column(name = "sii_uri")               private String uri;
    @Column(name = "sii_si_id")             private StadiumInfo stadium;
}
