package org.example.release;

import java.util.List;

public class Release {
    private String dateRelease;
    private String bugFix;
    private List<String> changes;

    public Release() {
    }

    public List<String> getChanges() {
        return changes;
    }

    public void setChanges(List<String> changes) {
        this.changes = changes;
    }

    public Release(String dateRelease, String bugFix) {
        this.dateRelease = dateRelease;
        this.bugFix = bugFix;
    }

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
