package net.com.midnight.sound;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.io.IOException;

public class SoundType {

    Sound sound = new Sound();

    private static final Logger logger = null;

    registrySound registrySound = new registrySound ();

    public static Sound DAY_SOUND = null;

    public Sound getDaySound(Sound daySound) throws IOException {
         sound.runSound ();

        Runtime run = Runtime.getRuntime ();

        DAY_SOUND = sound.setNameSound ();

        run.exec("cd ../resources/Sounds/" + DAY_SOUND + ".mp4");
        run.freeMemory ();

        getDaySound(DAY_SOUND);

        return null;
    }
}
