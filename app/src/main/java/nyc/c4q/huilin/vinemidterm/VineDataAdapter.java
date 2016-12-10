package nyc.c4q.huilin.vinemidterm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.huilin.vinemidterm.model.Record;

/**
 * Created by huilin on 12/10/16.
 */
public class VineDataAdapter extends RecyclerView.Adapter<RecordViewHolder>{
    private List<Record> recordList;

    public VineDataAdapter(List<Record> recordList) {
        this.recordList = recordList;
    }

    @Override
    public RecordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vh_record, parent, false);
        return new RecordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecordViewHolder holder, int position) {
        Record myRecord = recordList.get(position);
        holder.bind(myRecord);


    }

    @Override
    public int getItemCount() {
        return recordList.size();
    }
}
