package net.com.midnight.sound;

import java.rmi.registry.Registry;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class registrySound {

    private Logger logger = null;

    public Sound sound = new Sound ();

    public static Sound DAY_SOUND = null;

    public static registrySound registrySounds(){
        DAY_SOUND = new Sound ();

        return null;
    }

    public registrySound() {

    }

    public Handler getSound(Sound sound) {
        this.sound = sound;

        logger.addHandler(getSound (sound));

        return null;
    }

    public Sound getNamesound(String namesound){
        sound.getSoundName();

        logger.addHandler (getNamesound(namesound));

        return null;
    }

    public Handler getSoundTime(int time){
        sound.time = time;

        logger.addHandler (getSoundTime(time));

        return  null;
    }

    public Handler getSoundVol(int Vol) {
        sound.volumen = Vol;

        logger.addHandler (getSoundVol (Vol));

        return null;
    }

    public registrySound(Registry registry) {
        getNamesound (String.valueOf (registry.hashCode ( )));
        getSoundTime (registry.hashCode ( ));
        getSoundVol (registry.hashCode ( ));

        return;
    }
}
