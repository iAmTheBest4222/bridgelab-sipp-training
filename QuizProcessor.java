import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

public class QuizProcessor {
    // Method to compare answers and calculate score
    public static int calculateScore(String[] correctAnswers, String[] userAnswers)
            throws InvalidQuizSubmissionException {
        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException("Answer lengths do not match.");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    // Method to return grade based on score
    public static String getGrade(int score, int total) {
        double percentage = (double) score / total * 100;

        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 50) return "C";
        else return "Fail";
    }

    public static void main(String[] args) {
        String[] correctAnswers = {"A", "B", "C", "D"};
        List<Integer> allScores = new ArrayList<>();

        // Simulate two users
        String[][] userSubmissions = {
            {"A", "B", "C", "D"},    // all correct
            {"A", "C", "B", "D"}     // 2 correct
        };

        for (String[] userAnswers : userSubmissions) {
            try {
                int score = calculateScore(correctAnswers, userAnswers);
                allScores.add(score);
                String grade = getGrade(score, correctAnswers.length);
                System.out.println("User Score: " + score + ", Grade: " + grade);
            } catch (InvalidQuizSubmissionException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("All scores: " + allScores);
    }
}