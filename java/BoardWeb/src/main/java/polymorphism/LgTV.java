package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by sanghyunryu on 8/16/16.
 */
@Component("tv")
public class LgTV implements TV {
    @Autowired
    private Speaker speaker;

    public void powerOn() {
        System.out.println("LgTv---전원 켠다.");
    }

    public void powerOff() {
        System.out.println("LgTv---전원 끈다.");
    }

    public void volumeUp() {
        speaker.volumeUp();
    }

    public void volumeDown() {
        speaker.volumeDown();
    }
}
