/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa1;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Alperen
 */
public class TimeWatch {
    long starts;

    public static TimeWatch start() {
        return new TimeWatch();
    }

    public TimeWatch() {
        reset();
    }

    public TimeWatch reset(){
        starts = System.currentTimeMillis();
        return this;
    }

    public long time() {
        long ends = System.currentTimeMillis();
        return ends - starts;
    }

    public long time (TimeUnit unit) {
        return unit.convert(time(), TimeUnit.MILLISECONDS);
    }
}
