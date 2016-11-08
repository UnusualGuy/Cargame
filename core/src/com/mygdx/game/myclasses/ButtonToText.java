package com.mygdx.game.myclasses;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by Vince on 2016. 10. 11..
 */

public class ButtonToText extends TextButton{

    private static TextButtonStyle textButtonStyle;



    static {
        refresh();
    }


    static void refresh(){
        textButtonStyle = new TextButtonStyle();
        textButtonStyle.font = Assets.getAssetManager().get(Assets.getFontC64());

        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font/c64a.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter size = new FreeTypeFontGenerator.FreeTypeFontParameter();
        size.size = (int)(MyScreen.WORLD_HEIGHT*0.05);
        size.characters = Globals.getCHARS();
        BitmapFont font = generator.generateFont(size);
        generator.dispose();
        textButtonStyle.font = font;

        Pixmap p = new Pixmap(1,1, Pixmap.Format.RGB888);
        p.setColor(0.3f,0.3f,0.3f, 1f);
        p.fill();

        textButtonStyle.fontColor = new Color(0.3f,0.3f,0.3f, 1f);
    }

    public ButtonToText(String text) {
        super(text, textButtonStyle);
        reload();
        init();
    }

    void reload(){
        textButtonStyle = new TextButtonStyle();
        textButtonStyle.font = Assets.getAssetManager().get(Assets.getFontC64());

        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font/c64a.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter size = new FreeTypeFontGenerator.FreeTypeFontParameter();
        size.size = (int)(MyScreen.WORLD_HEIGHT*0.05);
        size.characters = Globals.getCHARS();
        BitmapFont font = generator.generateFont(size);
        generator.dispose();
        textButtonStyle.font = font;

        Pixmap p = new Pixmap(1,1, Pixmap.Format.RGB888);
        p.setColor(0.3f,0.3f,0.3f, 1f);
        p.fill();

        textButtonStyle.fontColor = new Color(0.3f,0.3f,0.3f, 1f);
    }

    protected void init() {

    }

    public static TextButtonStyle getTextButtonStyle() {
        return textButtonStyle;
    }
}
