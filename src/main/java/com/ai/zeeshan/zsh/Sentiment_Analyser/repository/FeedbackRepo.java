package com.ai.zeeshan.zsh.Sentiment_Analyser.repository;

import com.ai.zeeshan.zsh.Sentiment_Analyser.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zeeshan
 */

@Repository

public interface FeedbackRepo extends JpaRepository<Feedback, Long> {


}
