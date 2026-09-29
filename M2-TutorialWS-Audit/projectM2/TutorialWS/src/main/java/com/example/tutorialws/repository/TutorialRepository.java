package com.example.tutorialws.repository;

import java.util.List;

import com.example.tutorialws.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findTutorialsByTagsId(Long tagId);
}
