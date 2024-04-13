
package com.avsemprize.sapitypes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class SapiCatalogItem {

    @SerializedName("Identifiers")
    @Expose
    private Identifiers identifiers;
    @SerializedName("AttributeSets")
    @Expose
    private List<AttributeSet> attributeSets;
    @SerializedName("Relationships")
    @Expose
    private List<Relationship> relationships;
    @SerializedName("SalesRankings")
    @Expose
    private List<SalesRanking> salesRankings;

    public Identifiers getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Identifiers identifiers) {
        this.identifiers = identifiers;
    }

    public List<AttributeSet> getAttributeSets() {
        return attributeSets;
    }

    public void setAttributeSets(List<AttributeSet> attributeSets) {
        this.attributeSets = attributeSets;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    public List<SalesRanking> getSalesRankings() {
        return salesRankings;
    }

    public void setSalesRankings(List<SalesRanking> salesRankings) {
        this.salesRankings = salesRankings;
    }

}
