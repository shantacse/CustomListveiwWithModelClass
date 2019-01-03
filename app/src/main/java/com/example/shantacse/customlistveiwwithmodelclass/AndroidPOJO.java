package com.example.shantacse.customlistveiwwithmodelclass;

public class AndroidPOJO {


    private String version;
    private String name;
    private String release;


    public AndroidPOJO(String version, String name, String release) {
        this.version = version;
        this.name = name;
        this.release = release;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }
}
