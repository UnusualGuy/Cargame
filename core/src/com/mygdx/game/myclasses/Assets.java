package com.mygdx.game.myclasses;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;

/**
 * Created by mordes on 2016.10.06..
 */
public class Assets {

    private static AssetManager assetManager;



    private static final FreetypeFontLoader.FreeTypeFontLoaderParameter fontParameter_C64 = new FreetypeFontLoader.FreeTypeFontLoaderParameter();

    static {
        fontParameter_C64.fontFileName = "font/c64a.ttf";
        fontParameter_C64.fontParameters.size = (int)(MyScreen.WORLD_HEIGHT*0.05);
        fontParameter_C64.fontParameters.characters = Globals.getCHARS();
    }

    private static final AssetDescriptor<BitmapFont> FONT_C64
            = new AssetDescriptor<BitmapFont>("font/c64a.ttf", BitmapFont.class, fontParameter_C64);

    static void prepare() {
        assetManager = new AssetManager();
        Texture.setAssetManager(assetManager);
    }

    static void load() {

        FileHandleResolver resolver = new InternalFileHandleResolver();
        assetManager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
        assetManager.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(resolver));

        assetManager.load(FONT_C64);
    }

    private static void unload() {
        assetManager.dispose();
    }


    public static AssetManager getAssetManager() {
        return assetManager;
    }

    public static AssetDescriptor<BitmapFont> getFontC64() {
        return FONT_C64;
    }

    public static FreetypeFontLoader.FreeTypeFontLoaderParameter getFontParameter_C64() {
        return fontParameter_C64;
    }

}
