package Esper;

import java.util.Random;

/**
 * Created by mymint on 01/03/15.
 */
public enum TickSym {
    AAPL,
    IBM;

    public static TickSym getRamdonSymbol(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}

