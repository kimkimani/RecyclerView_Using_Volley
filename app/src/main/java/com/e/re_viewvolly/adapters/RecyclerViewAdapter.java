package com.e.re_viewvolly.adapters;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.e.re_viewvolly.R;
import com.e.re_viewvolly.model.Anime;
import com.squareup.picasso.Picasso;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Anime> mData ;
    private RequestOptions option;
    private String contentEquals;


    public RecyclerViewAdapter(Context mContext, List<Anime> mData) {
        this.mContext = mContext;
        this.mData = mData;
        // Request option for Glide



    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.row_items,parent,false) ;
        return new MyViewHolder(view) ;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_time.setText(mData.get(position).getTime());
        holder.tv_endbegin.setText(mData.get(position).getResults());
        holder.tv_league.setText(mData.get(position).getLeague());
        holder.match.setText(mData.get(position).getMatch());
        holder.tv_tip.setText(mData.get(position).getTip());
        holder.tv_odd.setText(mData.get(position).getOdd());
        holder.tv_results.setText(mData.get(position).getResults());

        Picasso
                .with(mContext)
                .load(mData.get(position).getCountry())
                .error(R.drawable.circul6)
               .into(holder.coutry);

        if ( mData.get(position).getStatus().contentEquals ( "1" ) ) {
            Picasso
                    .with(mContext)
                    .load("https://img.icons8.com/color/2x/checked-2.png")

                    .into(holder.img_status);

        }
        else if (  mData.get(position).getStatus().contentEquals( "2" ) ) {

            Picasso
                    .with(mContext)
                    .load("https://img.icons8.com/color/2x/checked-2.png")
                    .into(holder.img_status);
        }
        else {
            Picasso
                    .with(mContext)
                    .load("https://img.icons8.com/color/2x/checked-2.png")
                    .into(holder.img_status);
        }

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_time ;
        TextView tv_endbegin ;
        TextView tv_league ;
        TextView match;
        TextView tv_tip ;
        TextView tv_odd ;
        TextView tv_results ;
        ImageView coutry;
        ImageView img_status;






        MyViewHolder(View itemView) {
            super(itemView);

            tv_time = itemView.findViewById(R.id.tv_time);
            tv_endbegin = itemView.findViewById(R.id.tv_endbegin);
            tv_league = itemView.findViewById(R.id.tv_league);
            match = itemView.findViewById(R.id.match);

            tv_tip = itemView.findViewById(R.id.tv_tip);
            tv_odd = itemView.findViewById(R.id.tv_odd);
            tv_results = itemView.findViewById(R.id.tv_results);

            coutry = itemView.findViewById(R.id.coutry);
            img_status = itemView.findViewById(R.id.img_status);


        }
    }

}
