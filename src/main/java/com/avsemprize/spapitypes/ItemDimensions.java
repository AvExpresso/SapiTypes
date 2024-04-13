
package com.avsemprize.spapitypes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ItemDimensions {

    @SerializedName("Weight")
    @Expose
    private Weight weight;

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

}
