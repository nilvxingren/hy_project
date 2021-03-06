package com.mockuai.shopcenter.core.domain;

import java.util.Date;

public class ShopCouponDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.id
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.seller_id
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private Long sellerId;


    private Long shopId;



    private Long couponId;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Integer getCouponLocation() {
        return couponLocation;
    }

    public void setCouponLocation(Integer couponLocation) {
        this.couponLocation = couponLocation;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.coupou_loaction
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private Integer couponLocation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.parent_type
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private Integer parentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.parent_id
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.image_url
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private String imageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.image_desc
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private String imageDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.url
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.biz_code
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private String bizCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.gmt_created
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.gmt_modified
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_coupon.delete_mark
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    private Integer deleteMark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.id
     *
     * @return the value of shop_coupon.id
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.id
     *
     * @param id the value for shop_coupon.id
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.seller_id
     *
     * @return the value of shop_coupon.seller_id
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.seller_id
     *
     * @param sellerId the value for shop_coupon.seller_id
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.parent_type
     *
     * @return the value of shop_coupon.parent_type
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public Integer getParentType() {
        return parentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.parent_type
     *
     * @param parentType the value for shop_coupon.parent_type
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setParentType(Integer parentType) {
        this.parentType = parentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.parent_id
     *
     * @return the value of shop_coupon.parent_id
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.parent_id
     *
     * @param parentId the value for shop_coupon.parent_id
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.image_url
     *
     * @return the value of shop_coupon.image_url
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.image_url
     *
     * @param imageUrl the value for shop_coupon.image_url
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.image_desc
     *
     * @return the value of shop_coupon.image_desc
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public String getImageDesc() {
        return imageDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.image_desc
     *
     * @param imageDesc the value for shop_coupon.image_desc
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc == null ? null : imageDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.url
     *
     * @return the value of shop_coupon.url
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.url
     *
     * @param url the value for shop_coupon.url
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.biz_code
     *
     * @return the value of shop_coupon.biz_code
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.biz_code
     *
     * @param bizCode the value for shop_coupon.biz_code
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.gmt_created
     *
     * @return the value of shop_coupon.gmt_created
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.gmt_created
     *
     * @param gmtCreated the value for shop_coupon.gmt_created
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.gmt_modified
     *
     * @return the value of shop_coupon.gmt_modified
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.gmt_modified
     *
     * @param gmtModified the value for shop_coupon.gmt_modified
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_coupon.delete_mark
     *
     * @return the value of shop_coupon.delete_mark
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public Integer getDeleteMark() {
        return deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_coupon.delete_mark
     *
     * @param deleteMark the value for shop_coupon.delete_mark
     *
     * @mbggenerated Mon Jan 11 18:43:12 CST 2016
     */
    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }
}