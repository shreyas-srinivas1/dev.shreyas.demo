package dev.shreyas.demo;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {
    private final EngineerRepository engineerRepository;

    public HealthCheckService(EngineerRepository engineerRepository)
    {
        this.engineerRepository=engineerRepository;
    }
    public String onboardEngineer(String name)
    {
        EngineerProfile profile=new EngineerProfile(name,"Senior Java Engineer");
        engineerRepository.save(profile);
        return "Database transaction successful. Profile secured for: " + name;
    }
    public String generateStatusReport(String user)
    {
        return "Backend Systems are operational. Welcome to Phase 1, "+user+" .";
    }
}
