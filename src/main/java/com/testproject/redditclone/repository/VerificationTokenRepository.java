package com.testproject.redditclone.repository;

import com.testproject.redditclone.model.Subreddit;
import com.testproject.redditclone.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
}
