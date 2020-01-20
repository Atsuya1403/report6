package jp.ac.uryukyu.ie.e195749;

import java.util.Scanner;

/**
 * 勇者の情報を取り扱うYuusyaクラス
 * yuusya_hp = 勇者のhp
 * name = 勇者の名前
 */

public class Yuusya {
    static int yuusya_hp;
    static String name;

    /**
     *　ここで勇者の情報（名前やhp）を完成させる。
     */

    void Yuusya(){
        System.out.println("\n勇者の名前を入力してください");
        Scanner name1_1 = new Scanner(System.in);
        name = name1_1.next();
        yuusya_hp = 200;
        System.out.println("勇者"+name+"\tHP:"+yuusya_hp);
    }
}
