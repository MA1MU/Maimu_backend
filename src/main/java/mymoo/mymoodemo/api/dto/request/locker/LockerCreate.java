package mymoo.mymoodemo.api.dto.request.locker;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@ToString
public class LockerCreate {

    @NotBlank(message = "write locker name.")
    private String lockerName;

    @Builder
    public LockerCreate(String lockerName){
        this.lockerName = lockerName;
    }

}
