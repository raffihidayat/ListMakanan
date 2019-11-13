package id.ac.poliban.mi.listmakanan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private List<Food> data=new ArrayList<>();
    public FoodAdapter(List<Food>data){
        this.data=data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_flag;
        TextView tvFoodName;
        TextView tvFoodDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_food, parent, false);

        //deklarasikan View
        img_flag = convertView.findViewById(R.id.img_flag);
        tvFoodName = convertView.findViewById(R.id.tv_food_name);
        tvFoodDesc = convertView.findViewById(R.id.tv_food_description);

        //isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getFlag())
                .apply(new RequestOptions().override(60, 60))
                .into(img_flag);
        tvFoodName.setText(data.get(position).getCountryName());
        tvFoodDesc.setText(data.get(position).getCountryDesc());

        return convertView;
    }
}
