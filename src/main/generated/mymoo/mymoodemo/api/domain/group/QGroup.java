package mymoo.mymoodemo.api.domain.group;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGroup is a Querydsl query type for Group
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGroup extends EntityPathBase<Group> {

    private static final long serialVersionUID = 623467697L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGroup group = new QGroup("group1");

    public final StringPath groupColor = createString("groupColor");

    public final StringPath groupName = createString("groupName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final mymoo.mymoodemo.api.domain.QLocker locker;

    public final ListPath<mymoo.mymoodemo.api.domain.Maimu, mymoo.mymoodemo.api.domain.QMaimu> maimus = this.<mymoo.mymoodemo.api.domain.Maimu, mymoo.mymoodemo.api.domain.QMaimu>createList("maimus", mymoo.mymoodemo.api.domain.Maimu.class, mymoo.mymoodemo.api.domain.QMaimu.class, PathInits.DIRECT2);

    public QGroup(String variable) {
        this(Group.class, forVariable(variable), INITS);
    }

    public QGroup(Path<? extends Group> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGroup(PathMetadata metadata, PathInits inits) {
        this(Group.class, metadata, inits);
    }

    public QGroup(Class<? extends Group> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.locker = inits.isInitialized("locker") ? new mymoo.mymoodemo.api.domain.QLocker(forProperty("locker"), inits.get("locker")) : null;
    }

}

