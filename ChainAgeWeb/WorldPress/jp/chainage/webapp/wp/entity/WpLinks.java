package jp.chainage.webapp.wp.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WpLinks entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "wp_links", schema = "")
public class WpLinks implements java.io.Serializable {
    private static final long serialVersionUID = -3193886071116246947L;

    // Fields
    private Long linkId;
    private String linkUrl;
    private String linkName;
    private String linkImage;
    private String linkTarget;
    private String linkDescription;
    private String linkVisible;
    private Long linkOwner;
    private Integer linkRating;
    private Timestamp linkUpdated;
    private String linkRel;
    private String linkNotes;
    private String linkRss;

    // Constructors

    /** default constructor */
    public WpLinks() {}

    /** full constructor */
    public WpLinks(String linkUrl, String linkName, String linkImage, String linkTarget, String linkDescription, String linkVisible, Long linkOwner, Integer linkRating,
            Timestamp linkUpdated, String linkRel, String linkNotes, String linkRss) {
        this.linkUrl = linkUrl;
        this.linkName = linkName;
        this.linkImage = linkImage;
        this.linkTarget = linkTarget;
        this.linkDescription = linkDescription;
        this.linkVisible = linkVisible;
        this.linkOwner = linkOwner;
        this.linkRating = linkRating;
        this.linkUpdated = linkUpdated;
        this.linkRel = linkRel;
        this.linkNotes = linkNotes;
        this.linkRss = linkRss;
    }

    // Property accessors
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "link_id", unique = true, nullable = false)

    public Long getLinkId() {
        return this.linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    @Column(name = "link_url", nullable = false)

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    @Column(name = "link_name", nullable = false)

    public String getLinkName() {
        return this.linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    @Column(name = "link_image", nullable = false)

    public String getLinkImage() {
        return this.linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    @Column(name = "link_target", nullable = false, length = 25)

    public String getLinkTarget() {
        return this.linkTarget;
    }

    public void setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget;
    }

    @Column(name = "link_description", nullable = false)

    public String getLinkDescription() {
        return this.linkDescription;
    }

    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    @Column(name = "link_visible", nullable = false, length = 20)

    public String getLinkVisible() {
        return this.linkVisible;
    }

    public void setLinkVisible(String linkVisible) {
        this.linkVisible = linkVisible;
    }

    @Column(name = "link_owner", nullable = false)

    public Long getLinkOwner() {
        return this.linkOwner;
    }

    public void setLinkOwner(Long linkOwner) {
        this.linkOwner = linkOwner;
    }

    @Column(name = "link_rating", nullable = false)

    public Integer getLinkRating() {
        return this.linkRating;
    }

    public void setLinkRating(Integer linkRating) {
        this.linkRating = linkRating;
    }

    @Column(name = "link_updated", nullable = false, length = 19)

    public Timestamp getLinkUpdated() {
        return this.linkUpdated;
    }

    public void setLinkUpdated(Timestamp linkUpdated) {
        this.linkUpdated = linkUpdated;
    }

    @Column(name = "link_rel", nullable = false)

    public String getLinkRel() {
        return this.linkRel;
    }

    public void setLinkRel(String linkRel) {
        this.linkRel = linkRel;
    }

    @Column(name = "link_notes", nullable = false, length = 16777215)

    public String getLinkNotes() {
        return this.linkNotes;
    }

    public void setLinkNotes(String linkNotes) {
        this.linkNotes = linkNotes;
    }

    @Column(name = "link_rss", nullable = false)

    public String getLinkRss() {
        return this.linkRss;
    }

    public void setLinkRss(String linkRss) {
        this.linkRss = linkRss;
    }

}
