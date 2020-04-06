
package com.example.googlesearch.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Imageobject {

    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("contenturl")
    @Expose
    private String contenturl;
    @SerializedName("representativeofpage")
    @Expose
    private String representativeofpage;
    @SerializedName("description")
    @Expose
    private String description;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl;
    }

    public String getRepresentativeofpage() {
        return representativeofpage;
    }

    public void setRepresentativeofpage(String representativeofpage) {
        this.representativeofpage = representativeofpage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
