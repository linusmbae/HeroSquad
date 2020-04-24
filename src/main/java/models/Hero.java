package models;

import java.util.Objects;

public class Hero {
    private String mName;
    private int mAge;
    private String mSpecialPowers;
    private String mWeakness;
    private int mId;

    public Hero(String mName, int mAge, String mSpecialPowers, String mWeakness, int mId) {
        this.mName = mName;
        this.mAge = mAge;
        this.mSpecialPowers = mSpecialPowers;
        this.mWeakness = mWeakness;
        this.mId = mId;
    }


}
