package nyc.c4q.huilin.vinemidterm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import nyc.c4q.huilin.vinemidterm.model.Data;
import nyc.c4q.huilin.vinemidterm.model.Record;
import nyc.c4q.huilin.vinemidterm.model.VineApi;
import nyc.c4q.huilin.vinemidterm.model.VineService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

//    private static final String VINE_URL = "https://vine.co/api/timelines/users/";
    private static final String TAG = "Vine";
    private List<Record> recordList;
    private RecyclerView rv;
    private VineDataAdapter vineDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRecords();

    }

    public void initViews(){
        rv = (RecyclerView) findViewById(R.id.main_rv);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setAdapter(vineDataAdapter);


    }

    private void getRecords() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://vine.co/api/timelines/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        VineService service = retrofit.create(VineService.class);
        Call<VineApi> call = service.getVineApi();
        call.enqueue(new Callback<VineApi>() {
            @Override
            public void onResponse(Call<VineApi> call, Response<VineApi> response) {
                VineApi vineApi = response.body();
                Data data = vineApi.getData();
                recordList = data.getRecords();
                vineDataAdapter = new VineDataAdapter(recordList);
                initViews();
                Log.d(TAG, "onResponse: " + response);
                Log.d(TAG, "onResponse: " + data.getSize());
                Log.d(TAG, "onResponse: " + recordList.size());

            }

            @Override
            public void onFailure(Call<VineApi> call, Throwable t) {
                Log.d(TAG, "onFailure: Crap");

            }
        });

    }
}
