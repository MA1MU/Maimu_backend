package mymoo.mymoodemo.api.repository.maimu;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import mymoo.mymoodemo.api.domain.Maimu;
import mymoo.mymoodemo.api.domain.QMaimu;
import mymoo.mymoodemo.api.dto.request.maimu.MaimuSearch;

import java.util.List;

import static mymoo.mymoodemo.api.domain.QMaimu.*;


@RequiredArgsConstructor
public class MaimuRepositoryImpl implements MaimuRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Maimu> getList(MaimuSearch maimuSearch) {
        return jpaQueryFactory.selectFrom(maimu)
                .limit(maimuSearch.getSize())
                .offset(maimuSearch.getOffset())
                .orderBy(maimu.id.desc())
                .fetch();
    }

}
