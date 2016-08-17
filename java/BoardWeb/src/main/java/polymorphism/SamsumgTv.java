package polymorphism;

/**
 * Created by sanghyunryu on 8/16/16.
 */
public class SamsumgTv implements TV {
    public SamsumgTv() {
        System.out.println("===> SamsungTV 객체 생성");
    }

    public void initMethod() {
        System.out.println("객체 초기화 작업 처리..");
    }

    public void destroyMethod() {
        System.out.println("객체 삭제 전에 처리할 로직 처리...");
    }

    public void powerOn() {
        System.out.println("SamsumgTV---전원 켠다.");
    }

    public void powerOff() {
        System.out.println("SamsumgTV---전원 끈다.");
    }

    public void volumeUp() {
        System.out.println("SamsumgTV---소리 올린다.");
    }

    public void volumeDown() {
        System.out.println("SamsumgTV---소리내 린다.");
    }
}
