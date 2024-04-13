
package com.avsemprize.sapitypes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Identifiers__1 {

    @SerializedName("MarketplaceASIN")
    @Expose
    private MarketplaceASIN__1 marketplaceASIN;

    public MarketplaceASIN__1 getMarketplaceASIN() {
        return marketplaceASIN;
    }

    public void setMarketplaceASIN(MarketplaceASIN__1 marketplaceASIN) {
        this.marketplaceASIN = marketplaceASIN;
    }

}
