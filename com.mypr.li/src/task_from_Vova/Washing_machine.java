package task_from_Vova;

import java.util.Arrays;

/**
 * Created by elizavetaskomorohova on 12.02.18.
 */
public class Washing_machine {
    public String model;
    public String clothes[];
    public boolean a;

    public Washing_machine(String model1) {
        a = false;
        model = model1;
    }

    public boolean startWash(String cl2[]) {
        if (!a) {
            if (cl2.length==0) {
                System.out.println("стирка  ne началась!");
                a = false;
            } else {
                System.out.println("стирка  началась");
                clothes = cl2;
                a = true;
                return true;
            }
        }
        return false;
    }

    public void checkProcess() {
        if (a) {
            System.out.println("стирка в процессе!");
        } else {
            System.out.println("стирка ещё не началась!");
        }
    }

    public void finishWashing(String clear[]) {
        if (a) {
            clothes = clear;
            System.out.println("вещи постираны, вот они " + Arrays.toString(clothes));
        }

    }
}


