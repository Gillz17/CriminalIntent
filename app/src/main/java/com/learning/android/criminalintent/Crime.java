package com.learning.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Zachary McGill on 7/10/2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    private Date mDate;
    private boolean mSolved;
}
