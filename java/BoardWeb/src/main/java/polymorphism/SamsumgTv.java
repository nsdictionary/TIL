package polymorphism;

/**
 * Created by sanghyunryu on 8/16/16.
 */
public class SamsumgTv implements TV {
    private Speaker speaker;
    private int price;

    public SamsumgTv() {
        System.out.println("===> SamsungTV(1) 객체 생성");
    }

    public void setSpeaker(Speaker speaker) {
        System.out.println("===> setSpeaker() 호출");
        this.speaker = speaker;
    }

    public void setPrice(int price) {
        System.out.println("===> setPrice() 호출");
        this.price = price;
    }

    public SamsumgTv(Speaker speaker) {
        System.out.println("===> SamsungTV(2) 객체 생성");
        this.speaker = speaker;
    }

    public SamsumgTv(Speaker speacker, int price) {
        System.out.println("===> SamsungTV(3) 객체 생성");
        this.speaker = speacker;
        this.price = price;
    }

    public void powerOn() {
        System.out.println("SamsumgTV---전원 켠다. (가격 : " + price + ")");
    }

    public void powerOff() {
        System.out.println("SamsumgTV---전원 끈다.");
    }

    public void volumeUp() {
        speaker.volumeUp();
    }

    public void volumeDown() {
        speaker.volumeDown();
    }
}
