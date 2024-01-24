package mymoo.mymoodemo.api.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mymoo.mymoodemo.api.domain.Locker;
import mymoo.mymoodemo.api.domain.Users;
import mymoo.mymoodemo.api.exception.UserNotFound;
import mymoo.mymoodemo.api.repository.LockerRepository;
import mymoo.mymoodemo.api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LockerService {

    private final LockerRepository lockerRepository;
    private final UserRepository userRepository;

    //
    public void save(Long id){
        Users users = userRepository.findById(id, LockerCreate lockerCreate)
                        .orElseThrow(UserNotFound::new);
        Locker locker = Locker.builder()
                .lockerName()
                .build();
        locker.setUsers(users);

        lockerRepository.save(locker);
    }


}
