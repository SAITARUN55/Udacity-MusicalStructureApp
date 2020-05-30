package com.ksaitarun.udacity_musicalstructureapp;

/**
 * {@link Opus} represents a musical composition.
 * It contains the name of the composer and his opus.
 */

public class Opus {

    // The name of composer.
    private String mNameOfComposer;

    // The opus.
    private String mOpus;

    /**
     * Create a new Opus object.
     *
     * @param nameOfComposer is the name of composer (in English).
     * @param opus is the name of opus.
     */
    public Opus (String nameOfComposer, String opus) {
        mNameOfComposer = nameOfComposer;
        mOpus = opus;
    }

    // Get the name of composer.
    public String getNameOfComposer() {
        return mNameOfComposer;
    }

    // Get the name of opus.
    public String getOpus() {
        return mOpus;
    }
}
