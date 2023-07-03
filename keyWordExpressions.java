public class keyWordExpressions {
    public static void main(String[] args) {
        // since int is a reserved name
        //int int = 5;
        int int2 = 2;
        int myVariable = 50;

        // myVariable++;
        System.out.println(myVariable++);

        System.out.println("myvariable after post increment " +myVariable);

        // myVariable--;
        // System.out.println(myVariable);

        //if-else challenge
        

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The high score is "+ highScore);
        
        System.out.println("The next score is "+
        calculateScore(true, 10000, 8, 200));
        // score = 10000; levelComplete = 8; bonus = 200;
        // finalScore = score;
        // if(gameOver){
        //     finalScore += (levelComplete*bonus);
        //     System.out.println("Your final score is "+finalScore);
        // } 
        
   
    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
        int finalScore = score;

        if(gameOver){
            finalScore += (levelComplete * bonus);
            finalScore += 1000;
            // System.out.println("Final score is "+ finalScore);
        }
        return finalScore;
    }
}
