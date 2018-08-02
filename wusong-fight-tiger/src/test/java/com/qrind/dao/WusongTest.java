package com.qrind.dao;

import static org.junit.Assert.*;

/**
 * @author Created by Mr.Q on 2018/8/1.
 *         PACKAGE_NAME:com.test
 *         PROJECT_NAME:test
 *         Class DESC:
 */
public class WusongTest {

    @org.junit.Test
    public void getAttack() throws Exception {
        Wusong ws=new Wusong();
        int i=0;
        while(i<100){
            i++;
            System.out.print(ws.getAttack()+",");
        }
    }

}