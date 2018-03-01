package calculator;

/**
 * Created by elizavetaskomorohova on 17.02.18.
 */
public class Main {


    public static void main(String arg[]) {

        Calculator mine = new Calculator(3.44f, 3.44f);
        mine.sumDigits();
        mine.distractDigits();
        mine.divideDigits();
        mine.multiplyDigits();

    }
}

