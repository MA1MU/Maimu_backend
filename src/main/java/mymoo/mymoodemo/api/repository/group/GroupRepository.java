package mymoo.mymoodemo.api.repository.group;

import mymoo.mymoodemo.api.domain.group.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
