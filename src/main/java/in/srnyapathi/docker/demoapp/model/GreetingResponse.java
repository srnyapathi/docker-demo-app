package in.srnyapathi.docker.demoapp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
public class GreetingResponse {
    private String greeting;
}
