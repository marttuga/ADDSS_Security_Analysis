package com.example.tutorialws.repository;

import java.util.List;
import javax.transaction.Transactional;

import com.example.tutorialws.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);
}

