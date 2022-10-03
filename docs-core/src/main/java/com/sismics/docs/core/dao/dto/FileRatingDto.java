package com.sismics.docs.core.dao.dto;

import java.math.BigDecimal;

/**
 * File Rating DTO.
 */
public class FileRatingDto {
    /**
     * Rating ID.
     */
    private String id;
    
    /**
     * Creator name.
     */
    private String creatorName;
    
    /**
     * Academics rating.
     */
    private BigDecimal academics;

    /**
     * Activities rating.
     */
    private BigDecimal activities;

    /**
     * Experience rating.
     */
    private BigDecimal experience;

    /**
     * Awards rating.
     */
    private BigDecimal awards;

    /**
     * Overall rating.
     */
    private BigDecimal overall;

    /**
     * Rating comment.
     */
    private String comment;
    
    /**
     * Creation date of this rating.
     */
    private Long createTimestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
    
    public BigDecimal getAcademics() {
        return academics;
    }

    public void setAcademics(BigDecimal academics) {
        this.academics = academics;
    }

    public BigDecimal getActivities() {
        return activities;
    }

    public void setActivities(BigDecimal activities) {
        this.activities = activities;
    }

    public BigDecimal getExperience() {
        return experience;
    }

    public void setExperience(BigDecimal experience) {
        this.experience = experience;
    }

    public BigDecimal getAwards() {
        return awards;
    }

    public void setAwards(BigDecimal awards) {
        this.awards = awards;
    }

    public BigDecimal getOverall() {
        return overall;
    }

    public void setOverall(BigDecimal overall) {
        this.overall = overall;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}
