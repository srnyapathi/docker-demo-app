package in.srnyapathi.docker.demoapp.controller;

import in.srnyapathi.docker.demoapp.model.GreetingRequest;
import in.srnyapathi.docker.demoapp.model.GreetingResponse;
import in.srnyapathi.docker.demoapp.model.StatusResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/v1/docker-demo")
@Slf4j
public class DemoController {

    @GetMapping
    public StatusResponse getStatus(){
        log.debug("Received Status request -->");
        return new StatusResponse().setStatus("Running...").setDate(new Date());
    }

    @PostMapping("/greetings")
    public GreetingResponse greet(@RequestBody GreetingRequest request){
        log.debug("Greeting request received",request);
        return new GreetingResponse().setGreeting("Hello "+request.getFirstName()+" "+request.getLastName()+"!");
    }

}
