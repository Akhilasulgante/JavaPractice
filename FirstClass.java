public class FirstClass{
    public static void main(String[] args) {
        System.out.println("Hello, Akhila");
        System.out.println("Hello world");

        boolean isAlien = false;
        if (isAlien){
         System.out.println("not an Alien");
         System.out.println(" An Alien");
        }

        int topScore = 100; int Secondtop = 80;
        if (topScore > Secondtop || topScore>100 ){
            System.out.println("Cehecked with || Top Score="+topScore);
        }

        boolean isCar = false;
        if(isCar = true){
            System.out.println("Not supposed to be printing");
        }
        String carMake = "Ford";
        boolean isDom = carMake == "Ford" ? true : false;
        System.out.println(isDom);

        if(isDom){
            System.out.println("Car make is ford");
        }

        int age = 20;
        String ageGroup = age > 18 ? "adult" : "Kid";
        System.out.println("Age group "+ageGroup);

        // Operator precedence lesson
        // double check1 = 20.00, check2 = 80.00;
        // double sum = check1 + check2;
        // double res = sum*100.00;
        // double remind = res % 40;
        // boolean isRemind = remind == 0.00;
        // String result = isRemind ? "No reminder" : "Got some reminder";
        // System.out.println(result);

        //Precendence version(Wrong result)
        double check1 = 20.00d, check2 = 80.00d;

        // * takes precendence over +
        double res = check1+check2*100;
        System.out.println("res="+ res);
        double reminder = res% 40.00d;
        System.out.println("reminder=" + reminder);
        boolean isRemind = (reminder == 0) ? true:false;

        if(!isRemind){
            System.out.println("Got some reminder");
        }








    }
}