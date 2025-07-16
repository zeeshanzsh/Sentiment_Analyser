# Sentiment Analyser
---
This project is designed to facilitate intelligent feedback processing using OpenAI's language models, with integrated storage and analytics powered by a PostgreSQL server. It is intended to help customers provide feedback, which is then analyzed, processed, and responded to intelligently by the system.

## Features

- **Customer Feedback Intake**: Collects feedback from users.
- **Feedback Analysis**: Automatically analyzes the input using a dedicated module.
- **Prompt Engineering**: Crafts contextually appropriate prompts for OpenAI models.
- **ChatClient**: Handles interaction with the OpenAI API.
- **Process Response**: Parses and processes AI-generated responses.
- **Persistent Storage**: Stores analyzed data in a PostgreSQL database for further analysis and auditing.

## Architectural Flow Diagram

The following diagram illustrates the architectural flow of the system:

![Architectural Flow Diagram]<img width="2794" height="2214" alt="AIPromptEngineering" src="https://github.com/user-attachments/assets/a9d0bc1b-f3eb-458d-8345-8885b9572753" />


## Modules Description

### 1. Customer
The entry point for feedback submission.

### 2. Controller
Manages the feedback lifecycle, delegating analysis, prompt creation, and response handling.

### 3. Feedback Analyser
Performs initial analysis of incoming feedback before generating prompts.

### 4. Prompt Engineering
Creates optimized prompts for the AI model using feedback and context from the controller.

### 5. ChatClient
Acts as the interface to OpenAI, sending prompts and receiving responses.

### 6. Process Response
Interprets the AI's response and triggers further actions such as storing the results.

### 7. PostgreSQL Server
Persists all analyzed feedback and responses for reporting and improvement purposes.

## Technologies Used

- **OpenAI GPT**: For natural language understanding and response generation.
- **PostgreSQL**: For robust and scalable data storage.
- **(Add your framework/language here, e.g., Node.js, Python, etc.)**

## Getting Started

1. **Clone the repository**
2. **Install dependencies** (see your project's setup instructions)
3. **Configure PostgreSQL connection**
4. **Set up OpenAI API credentials**
5. **Run the application**

## Contributing

Contributions are welcome! Please open issues and submit pull requests for improvements or bug fixes.

## License

Specify your project license here.
