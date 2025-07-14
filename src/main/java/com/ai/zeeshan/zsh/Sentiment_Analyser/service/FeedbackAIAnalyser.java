    package com.ai.zeeshan.zsh.Sentiment_Analyser.service;

    import com.ai.zeeshan.zsh.Sentiment_Analyser.model.Feedback;
    import org.springframework.ai.chat.client.ChatClient;
    import org.springframework.stereotype.Service;

    /**
     * @author zeeshan
     */

    @Service
    public class FeedbackAIAnalyser {


        private final ChatClient chatClient;


        public FeedbackAIAnalyser(ChatClient.Builder builder) {
            this.chatClient = builder.build();
        }

        public Feedback analyzeFeedback(String content){


            String prompt = String.format("""
                Analyze the sentiment of the following text and respond with only one word: POSITIVE, NEUTRAL, or NEGATIVE.
                Also provide a sentiment score between -1 and 1 where:
                -1 is most negative
                0 is neutral
                1 is most positive
                
                Format the response as: SENTIMENT_TYPE|SCORE
                
                Text to analyze: %s
                """, content);

            String response = chatClient
                    .prompt(prompt)
                    .call()
                    .content();

            System.out.println("response = " + response);

            String[] parts = response.split("\\|");

               Feedback feedback = new Feedback();
               feedback.setContent(content);
               feedback.setSentimentScore(Double.parseDouble(parts[1].trim()));
               feedback.setSentiment(Feedback.SentimentType.valueOf(parts[0].trim()));

            return feedback;

        }
    }
