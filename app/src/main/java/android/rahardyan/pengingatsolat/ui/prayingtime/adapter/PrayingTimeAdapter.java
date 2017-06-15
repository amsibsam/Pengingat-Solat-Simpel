package android.rahardyan.pengingatsolat.ui.prayingtime.adapter;

import android.content.Context;
import android.rahardyan.pengingatsolat.R;
import android.rahardyan.pengingatsolat.model.SolatModel;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahardyan on 02/06/17.
 */

public class PrayingTimeAdapter extends RecyclerView.Adapter<PrayingTimeAdapter.PrayingTimeViewHolder> {
    private Context context;
    private List<SolatModel> prayingTime = new ArrayList<>();

    public PrayingTimeAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<SolatModel> prayingTime) {
        this.prayingTime = prayingTime;
        notifyDataSetChanged();
    }

    @Override
    public PrayingTimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_praying_time, parent, false);
        return new PrayingTimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PrayingTimeViewHolder holder, int position) {
        holder.tvSolat.setText(prayingTime.get(position).getSolatName());
        holder.tvSolatTime.setText(prayingTime.get(position).getSolatTime());
    }

    @Override
    public int getItemCount() {
        return prayingTime.size();
    }

    public class PrayingTimeViewHolder extends RecyclerView.ViewHolder {
        private TextView tvSolat, tvSolatTime;
        public PrayingTimeViewHolder(View itemView) {
            super(itemView);
            tvSolat = (TextView) itemView.findViewById(R.id.tv_solat);
            tvSolatTime = (TextView) itemView.findViewById(R.id.tv_solat_time);
        }
    }
}
