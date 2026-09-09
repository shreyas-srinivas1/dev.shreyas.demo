package dev.shreyas.demo;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/api/health")
    public String checkHealth(@RequestParam(defaultValue="Engineer") String user)
    {
        return "Backend systems operational. Welcome to Phase 1, " + user + ".";
    }
}
