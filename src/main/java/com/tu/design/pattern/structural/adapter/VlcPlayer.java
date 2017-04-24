package com.tu.design.pattern.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class VlcPlayer implements AdvancedMediaPlayer {


    private static final Logger logger = LoggerFactory.getLogger(VlcPlayer.class);

    @Override
    public void playVlc(String fileName) {
        logger.error("Playing vlc file. Name: {}", fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }

}
