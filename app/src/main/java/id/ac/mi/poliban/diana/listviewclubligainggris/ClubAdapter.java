package id.ac.mi.poliban.diana.listviewclubligainggris;

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

public class ClubAdapter extends BaseAdapter {
    private List<Club> data = new ArrayList<>();

    public ClubAdapter(List<Club> data){
        this.data = data;
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
        ImageView img_logo;
        TextView tvClubName;
        TextView tvClubDetail;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_club_liga_inggris, parent, false);

        img_logo = convertView.findViewById(R.id.img_logo);
        tvClubName = convertView.findViewById(R.id.tv_club_name);
        tvClubDetail = convertView.findViewById(R.id.tv_club_detail);

        Glide.with(parent.getContext())
                .load(data.get(position).getClub())
                .apply(new RequestOptions().override(60, 60))
                .into(img_logo);
        tvClubName.setText(data.get(position).getClubName());
        tvClubDetail.setText(data.get(position).getClubDetail());

        return convertView;
    }
}
