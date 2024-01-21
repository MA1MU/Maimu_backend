package mymoo.mymoodemo.api.dto.request.group;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class GroupEdit {

    @NotBlank(message = "please write group name")
    private String groupName;

    @NotBlank(message = "please write group color")
    private String groupColor;

    @Builder
    public GroupEdit(String groupName, String groupColor){
        this.groupName = groupName;
        this.groupColor = groupColor;
    }
}
