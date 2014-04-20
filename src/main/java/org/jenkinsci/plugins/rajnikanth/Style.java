package org.jenkinsci.plugins.rajnikanth;

import hudson.model.Result;

/**
 * Created by jigar.joshi on 4/20/14.
 */
public enum Style {
    HAPPY, ANGRY, ALERTING;

    public static Style get(Result result) {
        Style style;
        if (Result.FAILURE.equals(result))
        {
            style = ANGRY;
        } else if (Result.SUCCESS.equals(result))

        {
            style = HAPPY;
        } else

        {
            style = ALERTING;
        }
        return style;
    }
}
