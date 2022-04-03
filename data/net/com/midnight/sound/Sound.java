package net.com.midnight.sound;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Sound extends Handler {

    public int volumen;
    public int time;

    public static String nameSound;

    public String getSoundName(){
        this.nameSound = nameSound;

        return nameSound;
    }

    public int getSoundVol(int volumen){

        this.volumen = volumen;

        return volumen;
    }

    public int getSoundTime(int time){

        this.setTime (time);

        return time;
    }

    public void registrySound(){
        registrySoundName(this.nameSound).equals(nameSound);
    }

    private Object registrySoundName(String nameSound) {
        this.nameSound = getSoundName( );

        this.nameSound = nameSound;

        return nameSound;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Sound setNameSound() {
        this.nameSound = nameSound;
        return null;
    }

    public static void runSound(){
        runSound();
        try {
            Runtime run = Runtime.getRuntime();

            run.exec("cd ../resources/Sounds/" + nameSound);
            run.freeMemory();

            run.exec (String.valueOf (SoundType.DAY_SOUND));

        } catch (Exception e) {}
    }

    public int getTime() {
        return time;
    }

    @Override
    public void publish(LogRecord record) {

    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
