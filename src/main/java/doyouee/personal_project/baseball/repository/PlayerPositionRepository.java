package doyouee.personal_project.baseball.repository;

import doyouee.personal_project.baseball.entity.PlayerPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerPositionRepository extends JpaRepository<PlayerPosition, Long> {
}
