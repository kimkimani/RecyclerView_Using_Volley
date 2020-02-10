package com.e.re_viewvolly;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Somee on 17/12/2017.
 */
//this guys kinda like arranges everything, just like the guy that sorts a bunch of forms filled by clients

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private List<ListUnit> listUnitList;
    private Context context;

    //create a class accessible from othe activities
    public ListAdapter(Context context, List<ListUnit> listUnitList){
        this.context = context;
        this.listUnitList = listUnitList;

    }

    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //this method specifies the layout resource to be used, which is list_unit.xml
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_items,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapter.MyViewHolder holder, int position) {
        //this method helps to get the position, and set parameters, more like feeling a spreadsheet of different columns and rows from a form filled by a client
        ListUnit listUnit = listUnitList.get(position);
//fill up contents here



        holder.tv_time.setText(listUnit.getTime());
        holder.tv_endbegin.setText(listUnit.getResults());
        holder.tv_league.setText(listUnit.getLeague());
        holder.match.setText(listUnit.getMatch());
        holder.tv_tip.setText(listUnit.getTip());
        holder.tv_odd.setText(listUnit.getOdd());
        holder.tv_results.setText(listUnit.getResults());


        Picasso
                .with(context)
                .load(listUnit.getCountry())
                .error(R.drawable.circul6)
                .into(holder.coutry);

        if ( listUnit.getStatus().contentEquals ( "1" ) ) {
            Picasso
                    .with(context)
                    .load("https://img.icons8.com/color/2x/checked-2.png")
                    .into(holder.img_status);

        }
        else if (  listUnit.getStatus().contentEquals( "2" ) ) {

            Picasso
                    .with(context)
                    .load("https://img.icons8.com/color/2x/checked-2.png")
                    .into(holder.img_status);
        }
        else {
            Picasso
                    .with(context)
                    .load("https://img.icons8.com/color/2x/checked-2.png")
                    .into(holder.img_status);
        }

    }

    @Override
    public int getItemCount() {
        return listUnitList.size();
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView productImage;
        public LinearLayout detailLayout;
        public TextView productName, productPrice;
        public TextView tv_time ;
        public TextView tv_endbegin ;
        public TextView tv_league ;
        public TextView match;
        public TextView tv_tip ;
        public TextView tv_odd ;
        public TextView tv_results ;
        public ImageView coutry;
        public ImageView img_status;

        public MyViewHolder(View itemView) {
            super(itemView);

            //define views i want to fill up with something here
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
