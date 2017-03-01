package com.mockuai.itemcenter.core.domain;

import java.util.Date;

public class RBrandCategoryDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_brand_category.id
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_brand_category.biz_code
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    private String bizCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_brand_category.brand_id
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    private Long brandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_brand_category.category_id
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_brand_category.delete_mark
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    private Integer deleteMark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_brand_category.delete_version
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    private String deleteVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_brand_category.gmt_created
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_brand_category.gmt_modified
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_brand_category.id
     *
     * @return the value of r_brand_category.id
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_brand_category.id
     *
     * @param id the value for r_brand_category.id
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_brand_category.biz_code
     *
     * @return the value of r_brand_category.biz_code
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_brand_category.biz_code
     *
     * @param bizCode the value for r_brand_category.biz_code
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_brand_category.brand_id
     *
     * @return the value of r_brand_category.brand_id
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_brand_category.brand_id
     *
     * @param brandId the value for r_brand_category.brand_id
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_brand_category.category_id
     *
     * @return the value of r_brand_category.category_id
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_brand_category.category_id
     *
     * @param categoryId the value for r_brand_category.category_id
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_brand_category.delete_mark
     *
     * @return the value of r_brand_category.delete_mark
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public Integer getDeleteMark() {
        return deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_brand_category.delete_mark
     *
     * @param deleteMark the value for r_brand_category.delete_mark
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_brand_category.delete_version
     *
     * @return the value of r_brand_category.delete_version
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public String getDeleteVersion() {
        return deleteVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_brand_category.delete_version
     *
     * @param deleteVersion the value for r_brand_category.delete_version
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public void setDeleteVersion(String deleteVersion) {
        this.deleteVersion = deleteVersion == null ? null : deleteVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_brand_category.gmt_created
     *
     * @return the value of r_brand_category.gmt_created
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_brand_category.gmt_created
     *
     * @param gmtCreated the value for r_brand_category.gmt_created
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_brand_category.gmt_modified
     *
     * @return the value of r_brand_category.gmt_modified
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_brand_category.gmt_modified
     *
     * @param gmtModified the value for r_brand_category.gmt_modified
     *
     * @mbggenerated Thu May 12 16:27:33 CST 2016
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}