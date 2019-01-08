package e.wolfsoft1.uiuxlabecommerce_jp_shop_28.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop_28.R;
import e.wolfsoft1.uiuxlabecommerce_jp_shop_28.model.Color_Model;

public class ColorAdapter_28 extends RecyclerView.Adapter<ColorAdapter_28.MyColorHolder> {

    private final Context context;
    private final ArrayList<Color_Model> color_modelArrayList;
    private int position;

    public ColorAdapter_28(Context context, ArrayList<Color_Model> color_modelArrayList) {
        this.context = context;
        this.color_modelArrayList = color_modelArrayList;
    }

    @NonNull
    @Override
    public MyColorHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_color_28, viewGroup, false);
        return new MyColorHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyColorHolder myColorHolder, final int i) {

        myColorHolder.color_image.setImageResource(color_modelArrayList.get(i).getColor());

        myColorHolder.framelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = i;
                notifyDataSetChanged();
            }
        });

        if (position == i) {
            myColorHolder.selection.setVisibility(View.VISIBLE);
        } else {
            myColorHolder.selection.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return color_modelArrayList.size();
    }

    class MyColorHolder extends RecyclerView.ViewHolder {
        FrameLayout framelayout;
        ImageView selection, color_image;

        public MyColorHolder(@NonNull View itemView) {
            super(itemView);
            framelayout = itemView.findViewById(R.id.framelayout);
            selection = itemView.findViewById(R.id.selection);
            color_image = itemView.findViewById(R.id.color_image);


        }
    }
}
