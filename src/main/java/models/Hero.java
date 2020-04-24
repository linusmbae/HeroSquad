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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return mAge == hero.mAge &&
                mId == hero.mId &&
                Objects.equals(mName, hero.mName) &&
                Objects.equals(mSpecialPowers, hero.mSpecialPowers) &&
                Objects.equals(mWeakness, hero.mWeakness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mName, mAge, mSpecialPowers, mWeakness, mId);
    }



}
