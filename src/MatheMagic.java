public class MatheMagic {
    public static void main(String[] args) {
        /* To see the magic happen, change the value of myNumber to any number but 0 and run it.
        Check the result and now change the value of myNumber again and run the program again.
        See the magic happen!! (Fireworks in front of your eyes) */
        int myNumber = 5;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);

    }
}