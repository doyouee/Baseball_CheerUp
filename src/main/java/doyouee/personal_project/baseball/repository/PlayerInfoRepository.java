package doyouee.personal_project.baseball.repository;

import doyouee.personal_project.baseball.entity.PlayerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerInfoRepository extends JpaRepository<PlayerInfo, Long> {
}
