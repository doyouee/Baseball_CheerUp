package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "coach_info")
@Entity
public class CoachInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ci_id")             private Long id;
    @Column(name = "ci_position")       private String position;
    @Column(name = "ci_name")           private String name;

    public CoachInfo(String position, String name) {
        this.position = position;
        this.name = name;
    }
}
