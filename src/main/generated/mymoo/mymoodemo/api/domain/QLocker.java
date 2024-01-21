package mymoo.mymoodemo.api.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLocker is a Querydsl query type for Locker
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLocker extends EntityPathBase<Locker> {

    private static final long serialVersionUID = -1677343721L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLocker locker = new QLocker("locker");

    public final ListPath<mymoo.mymoodemo.api.domain.group.Group, mymoo.mymoodemo.api.domain.group.QGroup> groups = this.<mymoo.mymoodemo.api.domain.group.Group, mymoo.mymoodemo.api.domain.group.QGroup>createList("groups", mymoo.mymoodemo.api.domain.group.Group.class, mymoo.mymoodemo.api.domain.group.QGroup.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lockerName = createString("lockerName");

    public final QUsers users;

    public QLocker(String variable) {
        this(Locker.class, forVariable(variable), INITS);
    }

    public QLocker(Path<? extends Locker> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLocker(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLocker(PathMetadata metadata, PathInits inits) {
        this(Locker.class, metadata, inits);
    }

    public QLocker(Class<? extends Locker> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.users = inits.isInitialized("users") ? new QUsers(forProperty("users")) : null;
    }

}

