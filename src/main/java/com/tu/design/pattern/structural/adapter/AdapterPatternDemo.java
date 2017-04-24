package com.tu.design.pattern.structural.adapter;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        final AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
