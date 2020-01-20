package jp.ac.uryukyu.ie.e195749;

import java.util.Random;

/**
 * 攻撃関係の情報を取り扱うクラス
 *
 * Yuusya_attack = 勇者の攻撃にプラスする値、アイテムであるプロテインを使うことで15上昇する。
 * Yuusya_defense = 勇者が敵からうけるダメージを減らす値、プロテインで5上昇する。
 */
public class Attack {
    static int Yuusya_attack;
    static int Yuusya_defense;

    /**
     *randomで攻撃の幅を指定。
     * @param yuusya = 勇者の名前、hpの情報。
     * @param enemy = 敵の名前、hpの情報。
     */
    void attack(Yuusya yuusya,Enemy enemy){
        System.out.println(yuusya.name+"の攻撃！！！");
        Random rand_1 = new Random();
        int damege_1 = rand_1.nextInt(51) + 30;
        damege_1 = Yuusya_attack + damege_1;
        enemy.hp -= damege_1;
        System.out.println(enemy.name+"に"+damege_1+"のダメージを与えた！！！");
        System.out.println(enemy.name+" HP:\t"+enemy.hp);
    }

    /**
     * randomで攻撃の幅を指定。
     * @param yuusya = 勇者の名前、hpの情報。
     * @param enemy = 敵の名前、hpの情報。
     */
    void enemy_attack(Yuusya yuusya,Enemy enemy){
        System.out.println("\n"+enemy.name+"の攻撃！！！");
        Random rand_2 = new Random();
        int damege_2 = rand_2.nextInt(31) + 30;
        damege_2 = damege_2 - Yuusya_defense;
        if(damege_2 <=0){
            damege_2 = 0;
        } else{
            yuusya.yuusya_hp -= damege_2;
        }
        System.out.println(yuusya.name+"は"+damege_2+"のダメージを受けた！！！");
        System.out.println(yuusya.name+" HP:\t"+yuusya.yuusya_hp);
    }
}
