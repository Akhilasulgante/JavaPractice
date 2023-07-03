public class methodChallenge {
    
    public static void main(String[] args) {
        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition("a", position);

        score = 999;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("b", position);

        score = 499;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("c", position);

        score = 99;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("d", position);

        score = -1000;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("e", position);
        
    }

    public static void displayHighScorePosition(String Pname, int Pposition) {
        System.out.println(Pname + " managed to get into "+ Pposition + " on the high score list");
    }

    public static int calculateHighScorePosition(int Pscore) {
        int position = 4;
        if (Pscore >= 1000){
            position =  1;
        } else if (Pscore >= 500){
            position =  2;
        } else if(Pscore >= 100){
            position =  3;
        }
        return position;
        
    }
}
