package com.jcentersample.sdk;

import java.util.Date;
import java.util.Random;

/**
 * Created by darkorm on 2/1/2017.
 */

public final class Platform {
    private final static Random rng = new Random();
    private final static String[] work = {"Tasks", "Bugs", "Meetings"};
    private final static String[] blah = {"always", "sometimes", "rarely", "never"};
    private final static String[] meh = {"fun", "easy", "quick"};
    private final static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static String testPlatform() {
        return getRandom(work) + " are " + getRandom(blah) + " " + getRandom(meh) + " on " + getRandom(days);
    }

    private static String getRandom(String[] source) {
        return source[rng.nextInt(source.length)];
    }
}
