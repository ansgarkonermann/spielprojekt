package org.test.springext.beans;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class OfferEngine implements InitializingBean{

    public int berechneKonditionen() {
        return kondition;
    }
    private int kondition = 1;

    public void setKondition(int kondition) {
        this.kondition = kondition;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OfferEngine{");
        sb.append("kondition=").append(kondition);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.toString() + "afterPropertiesSet()");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(this.toString() + "postConstruct()");
    }
}
