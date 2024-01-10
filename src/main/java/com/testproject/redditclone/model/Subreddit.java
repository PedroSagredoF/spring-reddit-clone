package com.testproject.redditclone.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subreddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Community name is required")
    private String message;
    @NotBlank(message = "Description id required")
    private String description;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> post;
    @Column(name = "create_date")
    private Instant createDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
