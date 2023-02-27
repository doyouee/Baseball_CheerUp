package doyouee.personal_project.baseball.repository;

import doyouee.personal_project.baseball.entity.TeamInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamInfoRepository extends JpaRepository<TeamInfo, Long> {
}
