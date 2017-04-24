package com.tu.design.pattern.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class AudioPlayer implements MediaPlayer {

    private static final Logger logger = LoggerFactory.getLogger(AudioPlayer.class);

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //in built support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            logger.error("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter is providing support to play other file formats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            logger.error("Invalid media. " + audioType + " format not supported");
        }
    }
}