package com.mygdx.game.myclasses;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by mordes on 2016.10.05..
 */
public class MyStage extends Stage {
    protected Game game;
    //protected OneSpriteStaticActor sound;
    protected float elapsedTime = 0;

    public MyStage(Game game) {
        this.game = game;
        init();
    }

    public MyStage(Viewport viewport, Game game) {
        super(viewport);
        this.game = game;
        init();
    }

    public MyStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch);
        this.game = game;
        init();
    }

    @Override
    public void dispose() {
        super.dispose();
    }


    protected void init(){
        //musicGenerator();
        //Globals.music();

    };

    /*void musicGenerator(){
        sound = new OneSpriteStaticActor(Assets.assetManager.get(Globals.vanHang?Assets.SOUND_ICON:Assets.MUTE_ICON));
        float e = Globals.soundH;
        sound.setPosition(0f,MyScreen.WORLD_HEIGHT-e);
        sound.setSize(e,e);
        addActor(sound);
        sound.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                sound.remove();
                Globals.vanHang = !Globals.vanHang;
                musicGenerator();
                Globals.music();
            }
        });
    }*/


    @Override
    public void act(float delta) {
        elapsedTime+=delta;
        super.act(delta);
    }
}

