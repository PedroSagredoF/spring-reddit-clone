package com.testproject.redditclone.repository;

import com.testproject.redditclone.model.Subreddit;
import com.testproject.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
