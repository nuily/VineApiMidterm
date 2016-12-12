package nyc.c4q.huilin.vinemidterm.model;

/**
 * Created by huilin on 12/11/16.
 */
public class Records {

    private int liked;
    private Repost repost;
    private String profileBackground;

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public String getProfileBackground() {
        return profileBackground;
    }

    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }
}
