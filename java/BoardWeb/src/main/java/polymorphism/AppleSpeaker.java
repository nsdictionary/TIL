package polymorphism;

import org.springframework.stereotype.Component;

/**
 * Created by sanghyunryu on 8/18/16.
 */
public class AppleSpeaker implements Speaker {
    public AppleSpeaker() {
        System.out.println("==> AppleSpeaker 객체 생성");
    }

    public void volumeUp() {
        System.out.println("AppleSpeaker---소리 울린다.");
    }

    public void volumeDown() {
        System.out.println("AppleSpeaker---소리 내린다.");
    }
}
