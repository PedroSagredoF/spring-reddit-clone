package com.testproject.redditclone.repository;

import com.testproject.redditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Subreddit, Long> {
}
