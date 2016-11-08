package com.mygdx.game.physics;

import java.util.Vector;

/**
 * Created by Labor1PC20 on 2016.11.08..
 */
public class Physics {

    static Vector<Block> blocks = new Vector();

    public static void calcualte(float dt) {
        for (int i = 0; i < blocks.size() ; i++){
            blocks.get(i).move(dt);
        }
    }
}
