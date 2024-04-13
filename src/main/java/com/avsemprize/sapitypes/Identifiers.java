
package com.avsemprize.sapitypes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Identifiers {

    @SerializedName("MarketplaceASIN")
    @Expose
    private MarketplaceASIN marketplaceASIN;

    public MarketplaceASIN getMarketplaceASIN() {
        return marketplaceASIN;
    }

    public void setMarketplaceASIN(MarketplaceASIN marketplaceASIN) {
        this.marketplaceASIN = marketplaceASIN;
    }

}
