package org.example.release;

public class Release {
    private String dateRelease;
    private String bugFix;

    public String getBugFix() {
        return bugFix;
    }

    public void setBugFix(String bugFix) {
        this.bugFix = bugFix;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }
}
