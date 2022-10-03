package com.sismics.docs.core.model.jpa;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.common.base.MoreObjects;

/**
 * Rating entity.
 */
@Entity
@Table(name = "T_FIL_RATING")
public class FileRating implements Loggable {
    /**
     * Rating ID.
     */
    @Id
    @Column(name = "RAT_ID_C", length = 36)
    private String id;
    
    /**
     * File ID.
     */
    @Column(name = "RAT_IDFIL_C", length = 36, nullable = false)
    private String fileId;
    
    /**
     * User ID.
     */
    @Column(name = "RAT_IDUSER_C", length = 36, nullable = false)
    private String userId;

    /**
     * Academics rating.
     */
    @Column(name = "RAT_ACADEMICS_C", nullable = false)
    private BigDecimal academics;
    
    /**
     * Activities rating.
     */
    @Column(name = "RAT_ACTIVITIES_C", nullable = false)
    private BigDecimal activities;

    /**
     * Experience rating.
     */
    @Column(name = "RAT_EXPERIENCE_C", nullable = false)
    private BigDecimal experience;

    /**
     * Awards rating.
     */
    @Column(name = "RAT_AWARDS_C", nullable = false)
    private BigDecimal awards;

    /**
     * Overall rating.
     */
    @Column(name = "RAT_OVERALL_C", nullable = false)
    private BigDecimal overall;

    /**
     * Comment.
     */
    @Column(name = "RAT_COMMENT_C", nullable = false)
    private String comment;
    
    /**
     * Creation date.
     */
    @Column(name = "RAT_CREATEDATE_D", nullable = false)
    private Date createDate;

    /**
     * Deletion date.
     */
    @Column(name = "RAT_DELETEDATE_D")
    private Date deleteDate;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
    
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("fileId", fileId)
                .add("userId", userId)
                .toString();
    }

    @Override
    public String toMessage() {
        return fileId;
    }
}
