package com.qrind.dao;

import java.util.Random;

/**
 * @author Created by Mr.Q on 2018/8/1.
 *         PACKAGE_NAME:com.test
 *         PROJECT_NAME:test
 *         Class DESC:
 */
public class Wusong extends Animal {

    public Wusong(){
        blood=1000;
        lowDamage=5;
        highDamage=10;
        b=blood;
    }

    private int b;

    @Override
    public int getAttack() {
        Random rand = new Random();
        if(blood<b/2){
            return rand.nextInt(highDamage-lowDamage+1)+lowDamage+7;
        }else{
            return rand.nextInt(highDamage-lowDamage+1)+lowDamage;
        }
    }
}
