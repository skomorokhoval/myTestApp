package calculator;

/**
 * Created by elizavetaskomorohova on 17.02.18.
 */
public class Calculator {
    public float a;
    public float b;
    public float result;
    public String name;

    public Calculator(float first, float second) {
        a = first;
        b = second;
    }

    public float sumDigits() {
        result = a + b;
        System.out.println(result);
        return result;
    }

    public float distractDigits() {
        result = a - b;
        System.out.println(result);
        return result;
    }
    public  float multiplyDigits(){
        result = a * b;
        System.out.println(result);
        return result;
    }
    public  float divideDigits(){
        result = a / b;
        if (b==0){
            System.out.println("Division by 0!") ;
        }
        else

        System.out.println(result);
        return result;
    }

}
