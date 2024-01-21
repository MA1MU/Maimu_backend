package mymoo.mymoodemo.api.repository.maimu;

import mymoo.mymoodemo.api.domain.Maimu;
import mymoo.mymoodemo.api.dto.request.maimu.MaimuSearch;

import java.util.List;

public interface MaimuRepositoryCustom {

    List<Maimu> getList(MaimuSearch maimuSearch);
}
