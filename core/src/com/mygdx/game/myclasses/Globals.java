package com.mygdx.game.myclasses;

import com.badlogic.gdx.audio.Music;

/**
 * Created by mordes on 2016.10.05..
 */
public class Globals {
    private static final String CHARS = "0123456789öüóqwertzuiopőúasdfghjkléáűíyxcvbnm'+!%/=()ÖÜÓQWERTZUIOPŐÚASDFGHJKLÉÁŰÍYXCVBNM?:_*<>#&@{}[],-.";
    //private static boolean isSoundOn = true;
    //private static boolean musicChange = true;



    /*public static void music (){
        if(Globals.musicchange && Globals.vanHang){
            Globals.gamemusic.stop();
            Globals.menumusic.play();
            if (!menumusic.isPlaying())
            {
                menumusic = Assets.assetManager.get(Assets.BENDSOUND_ACOUSTICBREEZE);
                menumusic.play();
            }
        }
        else if(!Globals.musicchange && Globals.vanHang){
            Globals.menumusic.stop();
            Globals.gamemusic.play();
            if (!gamemusic.isPlaying())
            {
                gamemusic = Assets.assetManager.get(Assets.BENDSOUND_ACOUSTICBREEZE);
                gamemusic.play();
            }
        }
        else{
            Globals.menumusic.stop();
            Globals.gamemusic.stop();
        }

    }*/

    public static String getCHARS() {
        return CHARS;
    }
}
