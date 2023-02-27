package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Table(name = "coach_info_image")
@Entity
public class CoachInfoImage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cii_id")            private Long id;
    @Column(name = "cii_file")          private String file;
    @Column(name = "cii_uri")           private String uri;
    @Column(name = "cii_ci_id")         private CoachInfo coach;

}
