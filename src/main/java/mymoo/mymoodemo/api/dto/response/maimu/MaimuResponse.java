package mymoo.mymoodemo.api.dto.response.maimu;

import lombok.Builder;
import lombok.Getter;
import mymoo.mymoodemo.api.domain.Maimu;

import javax.persistence.Lob;

@Getter
public class MaimuResponse {

    private final Long id;
    private final String message;
    private final String maimuColor;
    private final String writerName;

    public MaimuResponse(Maimu maimu){
        this.id = maimu.getId();
        this.message = maimu.getMessage();
        this.maimuColor = maimu.getMaimuColor();
        this.writerName = maimu.getWriterName();
    }

    @Builder
    public MaimuResponse(Long id, String message, String maimuColor, String writerName){
        this.id = id;
        this.message = message;
        this.maimuColor = maimuColor;
        this.writerName = writerName;
    }
}
