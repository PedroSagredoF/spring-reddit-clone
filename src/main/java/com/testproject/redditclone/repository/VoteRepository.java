
package com.testproject.redditclone.repository;

import com.testproject.redditclone.model.VerificationToken;
import com.testproject.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
