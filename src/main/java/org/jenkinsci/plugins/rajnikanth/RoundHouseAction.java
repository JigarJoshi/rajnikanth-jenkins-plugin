package org.jenkinsci.plugins.rajnikanth;

import hudson.model.Action;

/**
 * Created by jigar.joshi on 4/20/14.
 */
public class RoundHouseAction implements Action {

    /**
     * The style - for backward compatibility to version 0.2.
     */
    private Style style;

    /**
     * The style.
     */
    private Style mStyle;

    /**
     * The fact - for backward compatibility to version 0.2.
     */
    private String fact;

    /**
     * The fact.
     */
    private String mFact;

    /**
     * Constructs a RoundhouseAction with specified style and fact.
     * @param style
     *            the style
     * @param fact
     *            the fact
     */
    public RoundHouseAction(final Style style, final String fact) {
        super();
        this.mStyle = style;
        this.mFact = fact;
    }

    /**
     * Gets the action display name.
     * @return the display name
     */
    public String getDisplayName() {
        return "Rajnikanth";
    }

    /**
     * This action doesn't provide any icon file.
     * @return null
     */
    public String getIconFileName() {
        return null;
    }

    /**
     * Gets the URL name for this action.
     * @return the URL name
     */
    public String getUrlName() {
        return "rajnikanth";
    }

    /**
     * Gets the Rajni style.
     * @return the style
     */
    public Style getStyle() {
        Style theStyle;
        if (mStyle != null) {
            theStyle = mStyle;
        } else {
            theStyle = style;
        }
        return theStyle;
    }

    /**
     * Rajni fact
     * @return the fact
     */
    public String getFact() {
        String theFact;
        if (mFact != null) {
            theFact = mFact;
        } else {
            theFact = fact;
        }
        return theFact;
    }
}
