

public class MathMagic{
    public static void main(String[] args) {
        //original number for the program
        int myNumber = 4;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        
        System.out.println(stepSix);


    }
    
}