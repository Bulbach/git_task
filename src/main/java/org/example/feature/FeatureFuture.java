package org.example.feature;

public class FeatureFuture {
    private String name;
    private String target;

    public FeatureFuture() {
    }

    public FeatureFuture(String name, String target) {
        this.name = name;
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
