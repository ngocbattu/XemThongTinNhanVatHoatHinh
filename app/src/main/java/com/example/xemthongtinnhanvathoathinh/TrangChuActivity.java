package com.example.xemthongtinnhanvathoathinh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.xemthongtinnhanvathoathinh.Action.ItemClick;
import com.example.xemthongtinnhanvathoathinh.Adapter.AdapterNhanVat;
import com.example.xemthongtinnhanvathoathinh.Model.ThongTinNhanVat;

import java.util.ArrayList;

public class TrangChuActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    AdapterNhanVat adapterNhanVat;
    ArrayList<ThongTinNhanVat> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        mRecyclerView = findViewById(R.id.Recyclerview_danh_sach_nhan_vat);
        arrayList = new ArrayList<>();
        arrayList.add(new ThongTinNhanVat(1,R.drawable.nv1,"Killua",14,"là người bạn thân nhất của Gon . Sinh ra trong gia tộc sát thủ nổi tiếng, Zoldyck, cậu đã được rèn luyện cực kì khắt khe. Và đến lúc 12 tuổi, Killua bỏ nhà đi để tham gia kì thi Hunter và gặp Gon."));
        arrayList.add(new ThongTinNhanVat(2,R.drawable.nv2,"Alluka ",11,"là con út thứ hai của Silva và Kikyo Zoldyck . Trong hoàn cảnh nào không rõ, cô đã bị chiếm hữu bởi một sinh vật Bí ẩn Lục địa đen , mà gia đình cô đặt tên là Nanika . Cả hai hiện đang chia sẻ cơ thể của Alluka."));
        arrayList.add(new ThongTinNhanVat(3,R.drawable.nv3,"Hisoka ",28,"là một kẻ giết người hàng loạt và nhà ảo thuật. Anh từng là thành viên số bốn của Genei Ryodan mặc dù anh tham gia tổ chức với mục đích chính là giết Chrollo Lucilfer."));
        arrayList.add(new ThongTinNhanVat(4,R.drawable.nv4,"Gon",14," là một cậu bé có tính cách lạc quan. Sau khi biết cha còn sống, cậu bắt đầu tham gia kì thi tuyển Hunter. Ở mỗi nơi, cậu đều gặp thêm kẻ thù và đồng minh mới."));
        arrayList.add(new ThongTinNhanVat(5,R.drawable.nv5,"Leorio",19,"là một người đàn ông có ước mơ trở thành bác sĩ. Nhưng để đủ chi phí thuốc thang và học phí, anh cần một khoản tiền tương đối. Vì vậy, Leorio quyết định tham gia kì thi Hunter"));
        arrayList.add(new ThongTinNhanVat(6,R.drawable.nv6,"Kurapika",19," là người sống sót của bộ tộc Kuruta. Sau khi gia tộc bị sát hại, cậu lên đường tìm kiếm những tròng mắt đỏ và bắt giữ các thành viên của Genei Ryodan. Việc đầu tiên cậu làm là tham gia kì thi Hunter."));
        adapterNhanVat =  new AdapterNhanVat(this, arrayList, new ItemClick() {
            @Override
            public void ThongTinCTNV(ThongTinNhanVat nhanVat) {
                for(int i=0 ; i < arrayList.size() ; i++){
                    if(nhanVat.getId() == arrayList.get(i).getId()){
                        Intent intent = new Intent(TrangChuActivity.this,ThongTinNhanVatActivity.class);
                        intent.putExtra("_id",arrayList.get(i).getId());
                        intent.putExtra("_anh",arrayList.get(i).getImageAnh());
                        intent.putExtra("_ten",arrayList.get(i).getTen());
                        intent.putExtra("_tuoi",arrayList.get(i).getTuoi());
                        intent.putExtra("_mota",arrayList.get(i).getMoTa());
                        startActivity(intent);
                    }
                }
            }
        });
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        mRecyclerView.setAdapter(adapterNhanVat);
    }
}