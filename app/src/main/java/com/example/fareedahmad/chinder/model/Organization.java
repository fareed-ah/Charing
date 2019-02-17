package com.example.fareedahmad.chinder.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Organization {
    @SerializedName("name")
    private String name;

    @SerializedName("location")
    private String location;

    @SerializedName("tag")
    private List<String> tag;

    public Organization(String name, String location, List<String> tags) {
        this.name = name;
        this.location = location;
        this.tag = tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getTags() {
        return tag;
    }

    public String getTagsString() {
        String tags = "";
        for (String tag:tag) {
            tags += " tag";
        }
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tag = tags;
    }
}
