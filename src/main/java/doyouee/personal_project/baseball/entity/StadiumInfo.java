package doyouee.personal_project.baseball.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.internal.build.AllowPrintStacktrace;

@AllowPrintStacktrace
@Getter
@Table(name = "stadium_info")
@Entity
public class StadiumInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "si_id")             private Long id;
    @Column(name = "si_name")           private String name;
    @Column(name = "si_home")           private String home;
    @Column(name = "si_address")        private String address;
    @Column(name = "si_call")           private String call;
    @Column(name = "si_ti_id")          private TeamInfo team;
}
