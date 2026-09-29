package com.example.tutorialws.repository;

import java.util.List;

import com.example.tutorialws.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TagRepository extends JpaRepository<Tag, Long> {
    List<Tag> findTagsByTutorialsId(Long tutorialId);
}

