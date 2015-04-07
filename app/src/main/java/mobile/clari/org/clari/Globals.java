package mobile.clari.org.clari;

import android.app.Application;

/**
 * Created by Sasikanth on 3/20/15.
 */
public class Globals extends Application {
    private String name = "Clari";
    private int dobYear = 2015;
    private int dobDate = 23;
    private int dobMonth = 7;
    private int mf = 1;
    private String ans1a = "";
    private String ans1c = "";
    private String ans1d = "";
    private String ans2a = "";
    private String ans2b = "";
    private String ans2c = "";


    public String getAns2a() {
        return this.ans2a;
    }

    public void setAns2a(String answer1a) {
        this.ans2a = answer1a;
    }

    public String getAns2b() {
        return this.ans2b;
    }

    public void setAns2b(String answer1a) {
        this.ans2b = answer1a;
    }

    public String getAns2c() {
        return this.ans2c;
    }

    public void setAns2c(String answer1a) {
        this.ans2c = answer1a;
    }


    public String getAns1a() {
        return this.ans1a;
    }

    public void setAns1a(String answer1a) {
        this.ans1a = answer1a;
    }


    public String getAns1c() {
        return this.ans1c;
    }

    public void setAns1c(String answer1c) {
        this.ans1c = answer1c;
    }

    public String getAns1d() {
        return this.ans1d;
    }

    public void setAns1d(String answer1d) {
        this.ans1d = answer1d;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameset) {
        this.name = nameset;
    }

    public int getdobYear() {
        return this.dobYear;
    }

    public void setdobYear(int year) {
        this.dobYear = year;
    }

    public int getdobDate() {
        return this.dobDate;
    }

    public void setdobDate(int date) {
        this.dobDate = date;
    }

    public int getdobMonth() {
        return this.dobMonth;
    }

    public void setdobMonth(int month) {
        this.dobMonth = month;
    }

    public int getmf() {
        return this.mf;
    }

    public void setmf(int MF) {
        this.mf = MF;
    }
}
