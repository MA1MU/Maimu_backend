package mymoo.mymoodemo.api.repository;

import mymoo.mymoodemo.api.domain.Locker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LockerRepository extends JpaRepository<Locker, Long> {
}
