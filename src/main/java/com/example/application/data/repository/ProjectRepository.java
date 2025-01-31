package com.example.application.data.repository;

import com.example.application.data.entity.Project;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
    List<Project> findByTitleOrDescriptionLike(String term);
}
