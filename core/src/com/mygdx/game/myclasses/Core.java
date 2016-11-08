package com.mygdx.game.myclasses;

import com.mygdx.game.physics.Physics;

/**
 * Created by Labor1PC20 on 2016.11.08..
 */
public class Core {

    boolean run = false;

    int fps = 60;
    float dt = 1/fps;

    Core(int i){
        setFPS(i);
    }

    public void start(){
        run = true;
        long starttime = System.currentTimeMillis();

        while(run){

            long nowtime = System.currentTimeMillis();

            if(nowtime-starttime > dt){
                starttime = System.currentTimeMillis();
                Physics.calcualte();
            }


        }
    }

    public void stop(){
        run = false;
    }

    public void setFPS(int i){
        fps = i;
        dt = 1/fps;
    }

}
