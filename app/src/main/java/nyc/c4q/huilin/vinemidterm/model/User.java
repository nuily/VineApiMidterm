package nyc.c4q.huilin.vinemidterm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by huilin on 12/10/16.
 */

public class User {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("verified")
    @Expose
    private Integer verified;
    @SerializedName("vanityUrls")
    @Expose
    private List<String> vanityUrls = null;
    @SerializedName("avatarUrl")
    @Expose
    private String avatarUrl;
    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("private")
    @Expose
    private Integer _private;
    @SerializedName("location")
    @Expose
    private String location;

    /**
     * @return The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return The verified
     */
    public Integer getVerified() {
        return verified;
    }

    /**
     * @param verified The verified
     */
    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    /**
     * @return The vanityUrls
     */
    public List<String> getVanityUrls() {
        return vanityUrls;
    }

    /**
     * @param vanityUrls The vanityUrls
     */
    public void setVanityUrls(List<String> vanityUrls) {
        this.vanityUrls = vanityUrls;
    }

    /**
     * @return The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl The avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * @return The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId The userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return The _private
     */
    public Integer getPrivate() {
        return _private;
    }

    /**
     * @param _private The private
     */
    public void setPrivate(Integer _private) {
        this._private = _private;
    }

    /**
     * @return The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

}
