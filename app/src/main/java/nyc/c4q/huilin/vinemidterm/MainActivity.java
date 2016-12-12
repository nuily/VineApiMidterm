package nyc.c4q.huilin.vinemidterm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import nyc.c4q.huilin.vinemidterm.model.Data;
import nyc.c4q.huilin.vinemidterm.model.VineApi;
import nyc.c4q.huilin.vinemidterm.model.VineService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String VINE_URL = "https://vine.co/api/";
    private static final String TAG = "Retrofit Vine";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fetchPlaylist();
    }

    private void fetchPlaylist() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(VINE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        VineService service = retrofit.create(VineService.class);
        Call<VineApi> call = service.getVineApi();
        call.enqueue(new Callback<VineApi>() {
            @Override
            public void onResponse(Call<VineApi> call, Response<VineApi> response) {
                VineApi vineApi = response.body();
                Data data = vineApi.getData();

//                songList = ourPlaylist.getA();
//
//                songAdapter = new SongAdapter(songList);
//                playlistAView.setAdapter(songAdapter);
                Log.d(TAG, "onResponse: " + data.getRecords().size());

            }

            @Override
            public void onFailure(Call<VineApi> call, Throwable t) {
                Log.d(TAG, "onFailure: Crap");
                t.printStackTrace();

            }
        });

    }
}
