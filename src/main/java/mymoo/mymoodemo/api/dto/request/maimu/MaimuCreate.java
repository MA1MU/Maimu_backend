package mymoo.mymoodemo.api.dto.request.maimu;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class MaimuCreate {

    @NotBlank(message = "please write message")
    private String message;

    @NotBlank(message = "please write maimuColor")
    private String maimuColor;

    @NotBlank(message = "please write writerName")
    private String writerName;

    @Builder
    public MaimuCreate(String message, String maimuColor, String writerName){
        this.message = message;
        this.maimuColor = maimuColor;
        this.writerName = writerName;
    }

}
