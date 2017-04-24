package com.tu.design.pattern.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    private static final Logger logger = LoggerFactory.getLogger(Mp4Player.class);

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        logger.error("Playing mp4 file. Name: {}", fileName);
    }
}
