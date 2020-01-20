package jp.ac.uryukyu.ie.e195749;

import java.util.Scanner;
import java.util.Random;


/**
 * アイテムを使用し、回復や勇者の能力上昇、アイテムダメージを取り扱うクラス
 * １：薬草、２：火炎瓶、３：プロテインの中から使用するアイテムを入力しswith文で判別する。
 *
 * aitem_2 = プレイヤーが入力した数字を入れる変数。
 */
public class Aitem {
    int aitem_2;

    /**
     * アイテムの選択コード
     * @param yuusya = 勇者の情報、hpや名前など。
     * @param enemy = 敵の情報、hpや名前など。
     */
    void tuul(Yuusya yuusya,Enemy enemy){
        Attack ac = new Attack();
        System.out.println("どのアイテムを使いますか？数字で入力してください。");
        System.out.println("薬草:1, 火炎瓶：2, プロテイン:3");
        Scanner aitem_1 = new Scanner(System.in);
        aitem_2 = aitem_1.nextInt();
        switch (aitem_2) {
            case 1:
                Random yakusou_rand_1 = new Random();
                int yakusou_rand_2 = yakusou_rand_1.nextInt(41) + 30;
                yuusya.yuusya_hp += yakusou_rand_2;
                System.out.println("勇者" + yuusya.name + "は、薬草を使い、hpが" + yakusou_rand_2 + "回復した！");
                System.out.println(yuusya.name + " HP\t:" + yuusya.yuusya_hp);
                break;
            case 2:
                System.out.println("勇者" + yuusya.name + "は、火炎瓶を使った！");
                Random aitem_rand_1 = new Random();
                int aitem_rand_2 = aitem_rand_1.nextInt(3);
                if (aitem_rand_2 == 1) {
                    System.out.println("火炎瓶が命中！！！" + enemy.name + "に150ダメージを与えた！！！");
                    enemy.hp -= 150;
                    System.out.println(enemy.name + "HP:" + enemy.hp);
                } else {
                    System.out.println("火炎瓶は当たらなかった...");
                }
                break;
            case 3:
                System.out.println("勇者" + yuusya.name + "は、プロテインを飲み、攻撃が15,防御が5上昇した。");
                ac.Yuusya_attack += 15;
                ac.Yuusya_defense += 5;
                break;

        }
    }
}
