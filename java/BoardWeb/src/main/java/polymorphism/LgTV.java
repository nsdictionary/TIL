package polymorphism;

/**
 * Created by sanghyunryu on 8/16/16.
 */
public class LgTV implements TV {
    public void powerOn() {
        System.out.println("LgTv---전원 켠다.");
    }

    public void powerOff() {
        System.out.println("LgTv---전원 끈다.");
    }

    public void volumeUp() {
        System.out.println("LgTv---소리 올린다.");
    }

    public void volumeDown() {
        System.out.println("LgTv---소리내 린다.");
    }
}
