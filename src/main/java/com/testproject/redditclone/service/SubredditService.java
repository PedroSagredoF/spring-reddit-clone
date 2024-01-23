package com.testproject.redditclone.service;

import com.testproject.redditclone.dto.SubredditDto;

import java.util.List;

public interface SubredditService {
    public SubredditDto save(SubredditDto subredditDto);

    public List<SubredditDto> getAll();
}
