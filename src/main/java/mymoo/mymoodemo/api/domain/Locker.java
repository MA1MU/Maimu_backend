package mymoo.mymoodemo.api.domain;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mymoo.mymoodemo.api.domain.group.Group;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Locker {

    @Id @GeneratedValue
    @Column(name = "locker_id")
    private Long id;
    private String lockerName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToMany(mappedBy = "locker")
    private List<Group> groups = new ArrayList<>();

    @Builder
    public Locker(String lockerName, Users users){
        this.lockerName = lockerName;
        this.users = users;
    }


    public void setUsers(Users users){
        this.users = users;
        users.getLockers().add(this);
    }

}
