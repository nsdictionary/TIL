package polymorphism;

/**
 * Created by sanghyunryu on 8/17/16.
 */
public class BeanFactory {
    public Object getBean(String beanName) {
        if (beanName.equals("samsung")) {
            return new SamsumgTv();
        } else if (beanName.equals("lg")) {
            return new LgTV();
        }
        return null;
    }
}
