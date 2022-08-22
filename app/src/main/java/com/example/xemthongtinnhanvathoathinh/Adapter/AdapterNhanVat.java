package com.example.xemthongtinnhanvathoathinh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.xemthongtinnhanvathoathinh.Action.ItemClick;
import com.example.xemthongtinnhanvathoathinh.Model.ThongTinNhanVat;
import com.example.xemthongtinnhanvathoathinh.R;

import java.util.List;

public class AdapterNhanVat extends RecyclerView.Adapter<AdapterNhanVat.ViewHodelNhanVat>{
    private Context context;
    private List<ThongTinNhanVat> list;
    private ItemClick itemClick;

    public AdapterNhanVat(Context context, List<ThongTinNhanVat> list, ItemClick itemClick) {
        this.context = context;
        this.list = list;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public ViewHodelNhanVat onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recy_view_danh_sach_nhan_vat,null);
        return new ViewHodelNhanVat(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodelNhanVat holder, int position) {
        ThongTinNhanVat nhanVat = list.get(position);
        Glide.with(context).load(nhanVat.getImageAnh()).into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClick.ThongTinCTNV(nhanVat);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHodelNhanVat extends RecyclerView.ViewHolder{
        ImageView imageView;
        public ViewHodelNhanVat(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_anh_nv);
        }
    }
}
