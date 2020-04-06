
package com.example.googlesearch.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Newsarticle {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("keywords")
    @Expose
    private String keywords;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("ispartof")
    @Expose
    private String ispartof;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("datecreated")
    @Expose
    private String datecreated;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("articlebody")
    @Expose
    private String articlebody;
    @SerializedName("datemodified")
    @Expose
    private String datemodified;
    @SerializedName("articlesection")
    @Expose
    private String articlesection;
    @SerializedName("alternativeheadline")
    @Expose
    private String alternativeheadline;
    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("datepublished")
    @Expose
    private String datepublished;
    @SerializedName("thumbnailurl")
    @Expose
    private String thumbnailurl;
    @SerializedName("contenturl")
    @Expose
    private String contenturl;
    @SerializedName("mainentityofpage")
    @Expose
    private String mainentityofpage;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIspartof() {
        return ispartof;
    }

    public void setIspartof(String ispartof) {
        this.ispartof = ispartof;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(String datecreated) {
        this.datecreated = datecreated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArticlebody() {
        return articlebody;
    }

    public void setArticlebody(String articlebody) {
        this.articlebody = articlebody;
    }

    public String getDatemodified() {
        return datemodified;
    }

    public void setDatemodified(String datemodified) {
        this.datemodified = datemodified;
    }

    public String getArticlesection() {
        return articlesection;
    }

    public void setArticlesection(String articlesection) {
        this.articlesection = articlesection;
    }

    public String getAlternativeheadline() {
        return alternativeheadline;
    }

    public void setAlternativeheadline(String alternativeheadline) {
        this.alternativeheadline = alternativeheadline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDatepublished() {
        return datepublished;
    }

    public void setDatepublished(String datepublished) {
        this.datepublished = datepublished;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl;
    }

    public String getMainentityofpage() {
        return mainentityofpage;
    }

    public void setMainentityofpage(String mainentityofpage) {
        this.mainentityofpage = mainentityofpage;
    }

}
