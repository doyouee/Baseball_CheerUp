package doyouee.personal_project.baseball.entity;

import doyouee.personal_project.baseball.entity.type.BaseballTeam;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Table(name = "user_info")
@Entity
public class UserInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ui_id")                 private Long id;
    @Column(name = "ui_email")              private String email;
    @Column(name = "ui_pwd")                private String pwd;
    @Column(name = "ui_name")               private String name;
    @Column(name = "ui_nickname")           private String nickname;
    @Column(name = "ui_birth")              private Date birth;
    @Column(name = "ui_gender")             private Integer gender;
    @Column(name = "ui_like_team")          @Enumerated(EnumType.STRING)    private BaseballTeam likeTeam;
    @Column(name = "ui_status")             private Integer status;
}
