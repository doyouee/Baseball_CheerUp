package doyouee.personal_project.baseball.repository;

import doyouee.personal_project.baseball.entity.TeamLogoImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamLogoImageRepository extends JpaRepository<TeamLogoImage, Long> {
}
