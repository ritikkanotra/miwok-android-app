package com.example.android.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioId;


    public Word(String miwokTranslation, String defaultTranslation, int audioId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioId = audioId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int audioId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioId = audioId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getEnglishTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return  mImageResourceId;
    }

    public int getAudioId() {
        return mAudioId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
