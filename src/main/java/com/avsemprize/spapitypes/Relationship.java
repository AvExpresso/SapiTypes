
package com.avsemprize.spapitypes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Relationship {

    @SerializedName("Identifiers")
    @Expose
    private Identifiers__1 identifiers;

    public Identifiers__1 getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Identifiers__1 identifiers) {
        this.identifiers = identifiers;
    }

}
