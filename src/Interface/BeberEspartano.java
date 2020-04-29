package Interface;

import java.util.Random;

public class BeberEspartano implements Ibeber {

    @Override
    public Integer beber(Integer extra){
        Random r = new Random();
        Integer value = r.nextInt((20 - 5) + 1) + 5;
        return value - extra;
    }
}
