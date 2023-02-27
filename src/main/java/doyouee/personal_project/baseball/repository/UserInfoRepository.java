package doyouee.personal_project.baseball.repository;

import doyouee.personal_project.baseball.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
