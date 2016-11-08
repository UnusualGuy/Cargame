package com.mygdx.game.myclasses;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.FocusListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.mygdx.game.graphics.Buttons;

/**
 * Created by Vince on 2016. 10. 11..
 */

public class MyTextField extends TextField {

    static TextFieldStyle style;
    private MyTextField me;
    private Buttons buttons;
    //private float blinktime = 0;

    static {
        refresh();
    }

    public static void refresh() {
        style = new TextFieldStyle();

        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font/c64a.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter size = new FreeTypeFontGenerator.FreeTypeFontParameter();
        size.size = (int)(30); //ez így szerepelt a régiben (ezt annyira nem értettem miért 50?):
                               //Globals / public static final int size = 50;
        size.characters = Globals.getCHARS();
        style.font =  Assets.getAssetManager().get(Assets.getFontC64());
        BitmapFont font = generator.generateFont(size);
        generator.dispose();
        style.font = font;

        style.fontColor = new Color(getColor(98),getColor(185),getColor(63),1f);
        Pixmap p = new Pixmap(1,1, Pixmap.Format.RGBA8888);

        p.setColor(new Color(getColor(98),getColor(185),getColor(63),1f));
        p.fill();
        style.cursor = new TextureRegionDrawable(new TextureRegion(new Texture(p)));
        style.cursor.setMinWidth(20);

        p.setColor(new Color(getColor(121),getColor(192),getColor(57),0.4f));
        p.fill();
        style.background = new TextureRegionDrawable(new TextureRegion(new Texture(p)));

        p.setColor(new Color(getColor(121),getColor(192),getColor(57),1f));
        p.fill();
        style.selection = new TextureRegionDrawable(new TextureRegion(new Texture(p)));
    }

    public void onSubmit()
    {

    }

    @Override
    public void setCursorPosition(int cursorPosition) {
        super.setCursorPosition(cursorPosition);
    }


    public MyTextField(String s){
        super(s,style);
        me = this;
        setWidth((int)(MyScreen.WORLD_HEIGHT*0.6));
        setHeight((int)(MyScreen.WORLD_HEIGHT*0.03));
    }

    private static float getColor(int s){
        float f = s/255f;
        if(f>1) f = 1f;
        if(f<0) f = 0f;
        return f;
    }

    /*public void blinking() {
        blinktime = 1;
    }*/

    /*@Override
    public void act(float delta) {
        super.act(delta);
        if (blinktime>0)
        {
            blinktime -= delta;
            setVisible((int)(blinktime*8)%2==0);
        }
        else
        {
            setVisible(true);
        }
    }*/
}
