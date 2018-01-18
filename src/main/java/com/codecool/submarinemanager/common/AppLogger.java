package com.codecool.submarinemanager.common;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class AppLogger  {

    private static final Logger logger = LogManager.getLogger(AppLogger.class);
    private static final Marker marker = MarkerManager.getMarker("ERROR");

    public static Logger getLogger() {
        return logger;
    }

    public static Marker getMarker() {
        return marker;
    }
}
