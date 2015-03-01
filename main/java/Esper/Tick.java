package Esper;

import java.util.Date;

/**
 * Created by mymint on 28/02/15.
 */
public class Tick {
    String symbol;
    Double price;
    Date timeStamp;

    public Tick(String s, double p, long t) {
        symbol = s;
        price = p;
        timeStamp = new Date(t);
    }
    public double getPrice() {return price;}
    public String getSymbol() {return symbol;}
    public Date getTimeStamp() {return timeStamp;}

    @Override
    public String toString() {
        return symbol.toString() + " Price: " + price.toString() + " time: " + timeStamp.toString();
    }
}