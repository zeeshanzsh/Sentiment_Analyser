package com.ai.zeeshan.zsh.Sentiment_Analyser.Controller;

import com.ai.zeeshan.zsh.Sentiment_Analyser.model.Feedback;
import com.ai.zeeshan.zsh.Sentiment_Analyser.repository.FeedbackRepo;
import com.ai.zeeshan.zsh.Sentiment_Analyser.service.FeedbackAIAnalyser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zeeshan
 */

@RestController
@RequestMapping("/api/v1/feedback")
public class FeedbackController {

    private final FeedbackRepo feedbackRepo;

    private final FeedbackAIAnalyser feedbackAIAnalyser;

    public FeedbackController(FeedbackRepo feedbackRepo, FeedbackAIAnalyser feedbackAIAnalyser) {
        this.feedbackRepo = feedbackRepo;
        this.feedbackAIAnalyser = feedbackAIAnalyser;
    }

    @GetMapping
    public List<Feedback> getAllFeedback(){

    return feedbackRepo.findAll();

    }

    @PostMapping
    public Feedback saveFeedBack(@RequestBody String content){

        Feedback feedback = null;
        //  AI Analyser

        feedback = feedbackAIAnalyser.analyzeFeedback(content);

        // Save
        return feedbackRepo.save(feedback);
    }
}
