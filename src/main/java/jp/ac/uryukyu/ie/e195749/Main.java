package jp.ac.uryukyu.ie.e195749;

/**
 *ゲームを実行するクラス。
 * 　
 */

public class Main {

    /**
     * @param args =　引数、Enemyのnameなど
     */
    public static void main(String[] args){
        Yuusya yuusya = new Yuusya();
        yuusya.Yuusya();
        Enemy e = new Enemy("スライム");
        Action a = new Action(yuusya,e);
        a.Actions();
    }
}
