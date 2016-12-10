package nyc.c4q.huilin.vinemidterm;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import nyc.c4q.huilin.vinemidterm.model.Record;

/**
 * Created by huilin on 12/10/16.
 */
public class RecordViewHolder extends RecyclerView.ViewHolder {
    private TextView username;
    private TextView liked;
    private LinearLayout linearLayout;

    public RecordViewHolder(View itemView) {
        super(itemView);
        username = (TextView) itemView.findViewById(R.id.tv_username);
        liked = (TextView) itemView.findViewById(R.id.tv_liked);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.vh_record);
    }

    public void bind(Record record){
        username.setText(record.getUsername());
        liked.setText(record.getLiked().toString());
        linearLayout.setBackgroundColor(Integer.valueOf(record.getRepost().getProfileBackground()));
    }

}
