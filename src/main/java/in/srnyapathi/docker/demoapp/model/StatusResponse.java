package in.srnyapathi.docker.demoapp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
public class StatusResponse {
    private String status;
    private Date date;
}
