package jp.ac.uryukyu.ie.e195749;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *戦いやアイテムなどの行動を管理するActionクラス
 *
 * yuusya = 勇者の情報
 * enemy = 敵の情報　
 */
public class Action {
    Yuusya yuusya;
    Enemy enemy;

    /**
     * actionクラスのコンストラクタ
     *
     * @param y　= 勇者の情報
     * @param e　= 敵の情報
     */
    Action(Yuusya y,Enemy e){
        this.enemy = e;
        this.yuusya = y;
    }

    /**
     * yuusya.yuusya_hpとenemy.hp = 勇者と敵のhpの情報。
     * try,catchで数字で入力するところで数字以外を入力するともういちど入力させるようにした。
     */
    void Actions() {
        Attack at = new Attack();

        while (yuusya.yuusya_hp >= 0 && enemy.hp >= 0) {
            try {
                System.out.println("\n数字で入力してください >>> 攻撃：1 , アイテムを使う:2, ゲームを終了する:0");
                Scanner num_1 = new Scanner(System.in);
                int num_2 = num_1.nextInt();
                if (num_2 == 1) {
                    at.attack(yuusya, enemy);
                    if (enemy.hp <= 0) {
                        System.out.println(enemy.name + "は倒れた！");
                        break;
                    }
                    at.enemy_attack(yuusya, enemy);
                    if (yuusya.yuusya_hp <= 0) {
                        System.out.println("勇者" + yuusya.name + "は倒れた！");
                        break;
                    }
                }
                else if (num_2 == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("数字で入力してくださいと言っています。");
                continue;
            }
        }
        System.out.println("戦いは終わった...");
    }
}
