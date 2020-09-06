package strategy;

import lombok.Setter;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
public class RadioAlarm implements Alarm, Radio {

    @Setter
    @Delegate(excludes = AlarmExclusions.class)
    private Alarm alarm = new AlarmImpl();
    @Delegate(excludes = RadioExclusions.class)
    private Radio radio = new RadioImpl();





    public static void main(String[] args) {
        new RadioAlarm().x();
    }


    @Override
    public void x() {
        alarm.x();
        radio.x();
    }
}
