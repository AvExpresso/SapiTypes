
package com.avsemprize.spapitypes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class PackageDimensions {

    @SerializedName("Height")
    @Expose
    private Height height;
    @SerializedName("Length")
    @Expose
    private Length length;
    @SerializedName("Width")
    @Expose
    private Width width;
    @SerializedName("Weight")
    @Expose
    private Weight__1 weight;

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = length;
    }

    public Width getWidth() {
        return width;
    }

    public void setWidth(Width width) {
        this.width = width;
    }

    public Weight__1 getWeight() {
        return weight;
    }

    public void setWeight(Weight__1 weight) {
        this.weight = weight;
    }

}
