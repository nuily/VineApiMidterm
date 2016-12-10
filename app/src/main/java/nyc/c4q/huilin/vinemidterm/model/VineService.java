package nyc.c4q.huilin.vinemidterm.model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by huilin on 12/10/16.
 */

public interface VineService {

    @GET("timelines/users/918753190470619136")
    Call<VineApi> getVineApi();
}
