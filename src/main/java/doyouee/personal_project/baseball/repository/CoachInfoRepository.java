package doyouee.personal_project.baseball.repository;

import doyouee.personal_project.baseball.entity.CoachInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachInfoRepository extends JpaRepository<CoachInfo, Long> {
}
