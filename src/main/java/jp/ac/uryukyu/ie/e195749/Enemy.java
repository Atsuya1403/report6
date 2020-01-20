package jp.ac.uryukyu.ie.e195749;

/**
 *Charactersクラスを継承したEnemyクラス
 */

public class Enemy extends Characters {

    /**
     * Enemyクラスのコンストラクタ
     * @param name = 敵の名前
     */

    Enemy(String name) {
        this.name = name;
        this.hp = 300;

        System.out.println(name+"が現れた！");
        System.out.println(name+ "\tHP:" + hp);
    }
}
