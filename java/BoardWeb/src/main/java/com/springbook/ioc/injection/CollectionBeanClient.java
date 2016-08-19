package com.springbook.ioc.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Properties;
import java.util.Map;

/**
 * Created by sanghyunryu on 8/18/16.
 */
public class CollectionBeanClient {
    public static void main(String[] args) {
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("context.xml");

        CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
        Properties addressList = bean.getAddressList();

        for(Map.Entry<Object, Object> e : addressList.entrySet()) {
            String key = (String) e.getKey();
            String value = (String) e.getValue();

            System.out.println(key + " - " + value);
        }
        factory.close();
    }
}
