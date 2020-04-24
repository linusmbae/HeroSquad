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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public String getmSpecialPowers() {
        return mSpecialPowers;
    }

    public void setmSpecialPowers(String mSpecialPowers) {
        this.mSpecialPowers = mSpecialPowers;
    }

    public String getmWeakness() {
        return mWeakness;
    }

    public void setmWeakness(String mWeakness) {
        this.mWeakness = mWeakness;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

}
