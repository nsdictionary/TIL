package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/**
 * Created by sanghyunryu on 8/16/16.
 */
public class TVUser {
    public static void main(String[] args) {
        // 1. Spring 컨테이너를 구동한다.
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("applicationContext.xml");

        // 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup) 한다.
        TV tv1 = (TV)factory.getBean("tv");
        TV tv2 = (TV)factory.getBean("tv");
        TV tv3 = (TV)factory.getBean("tv");
        TV tv4 = (TV)factory.getBean("tv");

        // test singletone bean
        tv1.powerOn();
        tv2.volumeUp();
        tv3.volumeDown();
        tv4.powerOff();

        // 3. Spring 컨테이너를 종료한다.
        factory.close();
    }
}
