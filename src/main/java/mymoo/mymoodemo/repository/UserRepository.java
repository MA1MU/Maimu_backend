package mymoo.mymoodemo.repository;

import mymoo.mymoodemo.api.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
//    Optional<Users> findByEmail(String email);
}
