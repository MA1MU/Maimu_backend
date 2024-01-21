package mymoo.mymoodemo.api.repository.maimu;

import mymoo.mymoodemo.api.domain.Maimu;
import mymoo.mymoodemo.api.domain.group.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaimuRepository extends JpaRepository<Maimu, Long>, MaimuRepositoryCustom{
}
