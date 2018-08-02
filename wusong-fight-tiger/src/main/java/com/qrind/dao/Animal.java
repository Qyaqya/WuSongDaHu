package com.qrind.dao;

import java.util.Random;

/**
 * @author Created by Mr.Q on 2018/8/1.
 *         PACKAGE_NAME:PACKAGE_NAME
 *         PROJECT_NAME:test
 *         Class DESC:
 */
public abstract class Animal {
    public int blood=0;

    public int highDamage=0;

    public int lowDamage=0;

    public int getAttack(){
        Random rand = new Random();
        return rand.nextInt(highDamage-lowDamage+1)+lowDamage;
    }
}
