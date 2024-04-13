
package com.avsemprize.spapitypes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class AttributeSet {

    @SerializedName("Binding")
    @Expose
    private String binding;
    @SerializedName("Brand")
    @Expose
    private String brand;
    @SerializedName("Color")
    @Expose
    private String color;
    @SerializedName("Department")
    @Expose
    private String department;
    @SerializedName("ItemDimensions")
    @Expose
    private ItemDimensions itemDimensions;
    @SerializedName("IsAdultProduct")
    @Expose
    private Boolean isAdultProduct;
    @SerializedName("IsMemorabilia")
    @Expose
    private Boolean isMemorabilia;
    @SerializedName("Label")
    @Expose
    private String label;
    @SerializedName("Manufacturer")
    @Expose
    private String manufacturer;
    @SerializedName("MaterialType")
    @Expose
    private List<String> materialType;
    @SerializedName("Model")
    @Expose
    private String model;
    @SerializedName("NumberOfItems")
    @Expose
    private Integer numberOfItems;
    @SerializedName("PackageDimensions")
    @Expose
    private PackageDimensions packageDimensions;
    @SerializedName("PackageQuantity")
    @Expose
    private Integer packageQuantity;
    @SerializedName("PartNumber")
    @Expose
    private String partNumber;
    @SerializedName("ProductGroup")
    @Expose
    private String productGroup;
    @SerializedName("ProductTypeName")
    @Expose
    private String productTypeName;
    @SerializedName("Publisher")
    @Expose
    private String publisher;
    @SerializedName("Size")
    @Expose
    private String size;
    @SerializedName("SmallImage")
    @Expose
    private SmallImage smallImage;
    @SerializedName("Studio")
    @Expose
    private String studio;
    @SerializedName("Title")
    @Expose
    private String title;

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ItemDimensions getItemDimensions() {
        return itemDimensions;
    }

    public void setItemDimensions(ItemDimensions itemDimensions) {
        this.itemDimensions = itemDimensions;
    }

    public Boolean getIsAdultProduct() {
        return isAdultProduct;
    }

    public void setIsAdultProduct(Boolean isAdultProduct) {
        this.isAdultProduct = isAdultProduct;
    }

    public Boolean getIsMemorabilia() {
        return isMemorabilia;
    }

    public void setIsMemorabilia(Boolean isMemorabilia) {
        this.isMemorabilia = isMemorabilia;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<String> getMaterialType() {
        return materialType;
    }

    public void setMaterialType(List<String> materialType) {
        this.materialType = materialType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    public void setPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    public Integer getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(Integer packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public SmallImage getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(SmallImage smallImage) {
        this.smallImage = smallImage;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
