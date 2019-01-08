package e.wolfsoft1.uiuxlabecommerce_jp_shop_28;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.viewpagerindicator.LinePageIndicator;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop_28.adapter.ColorAdapter_28;
import e.wolfsoft1.uiuxlabecommerce_jp_shop_28.adapter.Pants_ViewpagerAdapter_Shop28;
import e.wolfsoft1.uiuxlabecommerce_jp_shop_28.adapter.SizeAdapter_28;
import e.wolfsoft1.uiuxlabecommerce_jp_shop_28.model.Color_Model;
import e.wolfsoft1.uiuxlabecommerce_jp_shop_28.model.Size_Model;

public class Shop_28 extends AppCompatActivity {


    ArrayList<Size_Model> size_modelArrayList;
    private String size[] = {"X", "XL", "S", "XS", "XL", "XX", "L"};

    ViewPager pantsViewpager_shop28;
    RecyclerView recyclrerview_color28, recyclrerview_size28;
    private Integer color[] = {R.drawable.ic_color27_1, R.drawable.ic_color_light, R.drawable.ic_color27_3, R.drawable.ic_color27_4, R.drawable.ic_color27_5, R.drawable.ic_color27_6, R.drawable.ic_color27_7};
    ArrayList<Color_Model> color_modelArrayList;
    LinePageIndicator indicator_line;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_28);

        indicator_line = findViewById(R.id.indicator_line);
        recyclrerview_size28 = findViewById(R.id.recyclrerview_size28);
        recyclrerview_color28 = findViewById(R.id.recyclrerview_color28);
        pantsViewpager_shop28 = findViewById(R.id.pantsViewpager_shop28);


        Pants_ViewpagerAdapter_Shop28 pantsViewpagerAdapter = new Pants_ViewpagerAdapter_Shop28(getSupportFragmentManager(), 3);
        pantsViewpager_shop28.setAdapter(pantsViewpagerAdapter);

        indicator_line.setViewPager(pantsViewpager_shop28);


        size_modelArrayList = new ArrayList<>();

        for (int i = 0; i < size.length; i++) {
            Size_Model size_model = new Size_Model(size[i]);
            size_modelArrayList.add(size_model);
        }
        recyclrerview_size28.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter_28 sizeAdapter = new SizeAdapter_28(this, size_modelArrayList);
        recyclrerview_size28.setAdapter(sizeAdapter);

        color_modelArrayList = new ArrayList<>();

        for (int i = 0; i < color.length; i++) {
            Color_Model color_model = new Color_Model(color[i]);
            color_modelArrayList.add(color_model);
        }

        recyclrerview_color28.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter_28 adapter = new ColorAdapter_28(this, color_modelArrayList);
        recyclrerview_color28.setAdapter(adapter);
    }
}
