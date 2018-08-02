package com.qrind.main;

import com.qrind.dao.Tiger;
import com.qrind.dao.Wusong;

/**
 * @author Created by qiuyongang on 2018/8/2.
 *         PACKAGE_NAME:com.qrind.main
 *         PROJECT_NAME:WuSongFightTiger
 *         Class DESC:
 */
public class WuSongFightTiger {

    public static void main(String[] args){
        Tiger tiger=new Tiger();
        Wusong wusong=new Wusong();
        int i=0;
        while(tiger.blood>=0&&wusong.blood>=0){
            i++;
            tiger.blood=tiger.blood-wusong.getAttack();
            wusong.blood=wusong.blood-tiger.getAttack();
            System.out.println("老虎血量为:"+tiger.blood+",武松血量为:"+wusong.blood);
        }

        System.out.println("第"+i+"回合 "+(tiger.blood>0?"老虎吃了武松":"武松打死了老虎"));

    }
}
