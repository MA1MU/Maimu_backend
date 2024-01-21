package mymoo.mymoodemo.api.dto.request.maimu;

import lombok.Builder;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Getter
public class MaimuDelete {

    @NotBlank(message = "please write message")
    private String message;

    @NotBlank(message = "please write maimuColor")
    private String maimuColor;

    @NotBlank(message = "please write writerName")
    private String writerName;

    public MaimuDelete(){

    }

    public MaimuDelete(String message, String maimuColor, String writerName){
        this.message = message;
        this.maimuColor = maimuColor;
        this.writerName = writerName;
    }

}
