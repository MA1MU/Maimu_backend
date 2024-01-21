package mymoo.mymoodemo.api.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMaimu is a Querydsl query type for Maimu
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMaimu extends EntityPathBase<Maimu> {

    private static final long serialVersionUID = 639141086L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMaimu maimu = new QMaimu("maimu");

    public final mymoo.mymoodemo.api.domain.group.QGroup group;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath maimuColor = createString("maimuColor");

    public final StringPath message = createString("message");

    public final StringPath writerName = createString("writerName");

    public QMaimu(String variable) {
        this(Maimu.class, forVariable(variable), INITS);
    }

    public QMaimu(Path<? extends Maimu> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMaimu(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMaimu(PathMetadata metadata, PathInits inits) {
        this(Maimu.class, metadata, inits);
    }

    public QMaimu(Class<? extends Maimu> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.group = inits.isInitialized("group") ? new mymoo.mymoodemo.api.domain.group.QGroup(forProperty("group"), inits.get("group")) : null;
    }

}

