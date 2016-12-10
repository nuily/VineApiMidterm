package nyc.c4q.huilin.vinemidterm;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.huilin.vinemidterm.model.Record;

/**
 * Created by huilin on 12/10/16.
 */
public class RecordViewHolder extends RecyclerView.ViewHolder {
    private TextView username;

    public RecordViewHolder(View itemView) {
        super(itemView);
        username = (TextView) itemView.findViewById(R.id.tv_username);
    }

    public void bind(Record record){
        username.setText(record.getUsername());
    }

}
