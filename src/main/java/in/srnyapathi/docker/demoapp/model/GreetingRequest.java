package in.srnyapathi.docker.demoapp.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class GreetingRequest {
    private String firstName;
    private String lastName;

}
