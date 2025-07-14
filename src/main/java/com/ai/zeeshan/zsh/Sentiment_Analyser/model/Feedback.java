package com.ai.zeeshan.zsh.Sentiment_Analyser.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zeeshan
 */


@Entity
@Data
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private Double sentimentScore;

    private LocalDateTime createdAt = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private SentimentType sentiment;

    public enum SentimentType{

        POSITIVE, NEGATIVE, NEUTRAL
    }




}
