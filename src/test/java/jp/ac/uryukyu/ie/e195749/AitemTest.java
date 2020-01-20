package jp.ac.uryukyu.ie.e195749;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * aitem_2を2と仮定として希望する値である2が出力されるかを調べる。
 */

class AitemTest {

    @Test
    void tuul(){
        int aitem_2 = 2;
        int actual;
        
        switch (aitem_2){
            case 1:
                System.out.println("勇者は、薬草を使い回復した！");
                actual = 1;
                break;
            case 2:
                System.out.println("火炎瓶が命中！！！150ダメージを与えた！！！");
                actual = 2;
                break;
               
            case 3:
                System.out.println("勇者は、プロテインを飲み、攻撃が15,防御が5上昇した。");
                actual = 3;
                break;

            default:
                actual = 4;
        }


        int expect = 2;
        
        assertEquals(expect,actual);
    }
}