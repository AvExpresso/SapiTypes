
package com.avsemprize.spapitypes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SmallImage {

    @SerializedName("URL")
    @Expose
    private String url;
    @SerializedName("Height")
    @Expose
    private Height__1 height;
    @SerializedName("Width")
    @Expose
    private Width__1 width;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Height__1 getHeight() {
        return height;
    }

    public void setHeight(Height__1 height) {
        this.height = height;
    }

    public Width__1 getWidth() {
        return width;
    }

    public void setWidth(Width__1 width) {
        this.width = width;
    }

}
