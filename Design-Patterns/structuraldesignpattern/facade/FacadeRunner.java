package com.digicl.structuraldesignpattern.facade;

import com.digicl.structuraldesignpattern.facade.facades.VideoConversionFacade;

import java.io.File;

public class FacadeRunner {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
