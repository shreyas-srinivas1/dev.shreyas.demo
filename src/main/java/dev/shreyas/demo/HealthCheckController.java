package dev.shreyas.demo;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private final HealthCheckService healthCheckService;

    public HealthCheckController(HealthCheckService healthCheckService)
    {
        this.healthCheckService=healthCheckService;
    }

    @GetMapping("/api/health")
    public String checkHealth(@RequestParam(defaultValue="Engineer") String user)
    {
        return healthCheckService.generateStatusReport(user);
    }
    @PostMapping("/api/onboard")
    public String onboard(@RequestParam String name)
    {
        return healthCheckService.onboardEngineer(name);
    }
}
