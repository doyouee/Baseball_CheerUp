package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "team_info")
@Entity
public class TeamInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ti_id")                 private Long id;
    @Column(name = "ti_name")               private String name;
    @Column(name = "ti_found")              private String found;
    @Column(name = "ti_home")               private String home;
    @Column(name = "ti_champion")           private String champion;
    @Column(name = "ti_introduce")          private String introduce;
    @Column(name = "ti_homepage")           private String homepage;
    @Column(name = "ti_owner")              private String owner;
    @Column(name = "ti_leader")             private String leader;

    @Builder
    public TeamInfo(String name, String found, String home, String champion, String introduce, String homepage, String owner, String leader) {
        this.name = name;
        this.found = found;
        this.home = home;
        this.champion = champion;
        this.introduce = introduce;
        this.homepage = homepage;
        this.owner = owner;
        this.leader = leader;
    }
}
