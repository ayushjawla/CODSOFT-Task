import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Quizapp{
    static class Question{
        String questions;
        List<String>options;
        String answer;

        Question(String question,List<String>options,String answer){
            this.question = question;
            this.options = options;
            this.answer = answer;

        }
    }
    private staic final List<Question>QUESTIONS = Arrays.asList(new Question("What is the capital of France?",Arrays.asList("Paris","London","Berlin","Madrid"),"Paris"),new Question("What is 2+2?", Arrays.asList("3","4","5","6"),"4"));
    private static final int TIME_LIMIT_SECONDS = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for(Questions question:QUESTIONS){
            System.out.println(question.question);
            for(int i = 0;i < question.options.size();i++){
                System.out.println((i + 1) + "."+ question.options.get(i));
            }
            boolean answered = false;
            String userAnswer = "";
            Timer timer = new TimerTask(){
                @Override public void run(){
                    System.out.println("\nTime is up!");
                    timer.cancel();

                }
            };
            timer.schedule(task.TIME_LIMIT_SECONDS*1000);
            try {
                userAnswer = scanner.nextLine();
                answered = true;
                
            } catch (Exception e) {
            }
            if(answered){
                timer.cancel();
                int selectedOption = -1;
                try {
                    selectedOption = Integer.parseInt(userAnswer);
                    if(selectedOption<1|| selectedOption>question.option.size()){
                        System.out.println("Invalid option.Skipping this question.");
                        continue;
                    }
                    
                } catch ( NumberFormatException e) {
                    System.out.println("Invalid input. Skipping this question.");
                    continue;
                }
                if(question.option.get(selectedOption-1).equals(question.answer)){
                    score++;

                }
            }
        }
        System.out.println("Your final score is" + score +"out of" + QUESTIONS.size()+".");
        scanner.close();
    }
}