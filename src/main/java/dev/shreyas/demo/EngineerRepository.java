package dev.shreyas.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//We need to tell what table we are managing(EngineerProfile) and what is the datatype(Long) of the primary key of that table
//Hibernate enforces strict rules and the table it is managing must have a primary key
public interface EngineerRepository extends JpaRepository<EngineerProfile,Long>
{

}
