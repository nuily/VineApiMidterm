package nyc.c4q.huilin.vinemidterm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by huilin on 12/10/16.
 */

public class Repost {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("verified")
    @Expose
    private Integer verified;
    @SerializedName("vanityUrls")
    @Expose
    private List<String> vanityUrls = null;
    @SerializedName("flags|platform_lo")
    @Expose
    private Integer flagsPlatformLo;
    @SerializedName("repostId")
    @Expose
    private Integer repostId;
    @SerializedName("avatarUrl")
    @Expose
    private String avatarUrl;
    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("profileBackground")
    @Expose
    private String profileBackground;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("postId")
    @Expose
    private Integer postId;
    @SerializedName("ipAddress")
    @Expose
    private Integer ipAddress;
    @SerializedName("flags|platform_hi")
    @Expose
    private Integer flagsPlatformHi;
    @SerializedName("sourceType")
    @Expose
    private Integer sourceType;
    @SerializedName("sourceId")
    @Expose
    private Integer sourceId;

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The verified
     */
    public Integer getVerified() {
        return verified;
    }

    /**
     *
     * @param verified
     * The verified
     */
    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    /**
     *
     * @return
     * The vanityUrls
     */
    public List<String> getVanityUrls() {
        return vanityUrls;
    }

    /**
     *
     * @param vanityUrls
     * The vanityUrls
     */
    public void setVanityUrls(List<String> vanityUrls) {
        this.vanityUrls = vanityUrls;
    }

    /**
     *
     * @return
     * The flagsPlatformLo
     */
    public Integer getFlagsPlatformLo() {
        return flagsPlatformLo;
    }

    /**
     *
     * @param flagsPlatformLo
     * The flags|platform_lo
     */
    public void setFlagsPlatformLo(Integer flagsPlatformLo) {
        this.flagsPlatformLo = flagsPlatformLo;
    }

    /**
     *
     * @return
     * The repostId
     */
    public Integer getRepostId() {
        return repostId;
    }

    /**
     *
     * @param repostId
     * The repostId
     */
    public void setRepostId(Integer repostId) {
        this.repostId = repostId;
    }

    /**
     *
     * @return
     * The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     *
     * @param avatarUrl
     * The avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     *
     * @return
     * The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     * The profileBackground
     */
    public String getProfileBackground() {
        return profileBackground;
    }

    /**
     *
     * @param profileBackground
     * The profileBackground
     */
    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }

    /**
     *
     * @return
     * The created
     */
    public String getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @return
     * The postId
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     *
     * @param postId
     * The postId
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    /**
     *
     * @return
     * The ipAddress
     */
    public Integer getIpAddress() {
        return ipAddress;
    }

    /**
     *
     * @param ipAddress
     * The ipAddress
     */
    public void setIpAddress(Integer ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     *
     * @return
     * The flagsPlatformHi
     */
    public Integer getFlagsPlatformHi() {
        return flagsPlatformHi;
    }

    /**
     *
     * @param flagsPlatformHi
     * The flags|platform_hi
     */
    public void setFlagsPlatformHi(Integer flagsPlatformHi) {
        this.flagsPlatformHi = flagsPlatformHi;
    }

    /**
     *
     * @return
     * The sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     *
     * @param sourceType
     * The sourceType
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     *
     * @return
     * The sourceId
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     *
     * @param sourceId
     * The sourceId
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

}