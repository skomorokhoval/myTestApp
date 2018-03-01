package task_from_Vova;

/**
 * Created by elizavetaskomorohova on 12.02.18.
 */

public class Main {
    public static void main(String arg[]) {
        Washing_machine bosh = new Washing_machine("bosch");
        String []dirty = new String[]{
            new String("dirty_cloth1"),
            new String("ditry_cloth2"),
        };


        String [] clear = new String[]{"clear_cloth1", "clear_cloth2"};
        bosh.startWash(dirty);//метод начинает работать со ссылкой на массив стр
        bosh.checkProcess();
        bosh.finishWashing(clear);
    }
    }


