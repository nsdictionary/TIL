package com.springbook.ioc.injection;

import java.util.Properties;

/**
 * Created by sanghyunryu on 8/18/16.
 */
public class CollectionBean {
    private Properties addressList;

    public void setAddressList(Properties addressList) {
        this.addressList = addressList;
    }

    public Properties getAddressList() {
        return addressList;
    }
}
