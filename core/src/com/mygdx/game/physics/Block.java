package com.mygdx.game.physics;

/**
 * Created by Labor1PC20 on 2016.11.08..
 */

public class Block {

    public Pont poz;
    public Pont meret;
    public Pont irany;

    Block(float i1,float i2,float i3,float i4){
        poz = new Pont(i1,i2);
        meret = new Pont(i3,i4);
    }

    public void setPoz(float f1,float f2) {
        this.poz = new Pont(f1,f2);
    }

    public void setMeret(float f1,float f2) {
        this.meret = new Pont(f1,f2);
    }

    public void setIrany(float f1,float f2) {
        this.irany = new Pont(f1,f2);
    }

    public void move() {
        System.out.println("A mozgás még nincs kész");
    }
}
