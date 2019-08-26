package com.example.jokerwan.divergentbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.jokerwan.divergentbutton.widget.ButtonData;
import com.example.jokerwan.divergentbutton.widget.ButtonEventListener;
import com.example.jokerwan.divergentbutton.widget.SectorMenuButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBottomSectorMenuButton();
        initTopSectorMenuButton();
        initRightSectorMenuButton();
        initCenterSectorMenuButton();
        initBottomRightSectorMenuButton();
    }

    private void initTopSectorMenuButton() {
        SectorMenuButton sectorMenuButton = findViewById(R.id.top_sector_menu);
        final List<ButtonData> buttonDatas = new ArrayList<>();
        int[] drawable = {R.mipmap.main_btn, R.mipmap.one_share,
                R.mipmap.quick_share, R.mipmap.batch_share};
        for (int i = 0; i < 4; i++) {
            ButtonData buttonData = ButtonData.buildIconButton(this, drawable[i], 0);
            buttonData.setBackgroundColorId(this, R.color.colorAccent);
            buttonDatas.add(buttonData);
        }
        sectorMenuButton.setButtonDatas(buttonDatas);
        setListener(sectorMenuButton);
    }

    private void initRightSectorMenuButton() {
        SectorMenuButton sectorMenuButton = findViewById(R.id.right_sector_menu);
        final List<ButtonData> buttonDatas = new ArrayList<>();
        String[] text = {"更多", "收藏",
                "转发", "点赞"};
        for (int i = 0; i < 4; i++) {
            ButtonData buttonData = ButtonData.buildTextButton(text[i]);
            buttonData.setBackgroundColorId(this, R.color.colorAccent);
            buttonDatas.add(buttonData);
        }
        sectorMenuButton.setButtonDatas(buttonDatas);
        setListener(sectorMenuButton);
    }

    private void initCenterSectorMenuButton() {
        SectorMenuButton sectorMenuButton = findViewById(R.id.center_sector_menu);
        final List<ButtonData> buttonDatas = new ArrayList<>();
        int[] drawable = {R.mipmap.main_btn, R.mipmap.one_share,
                R.mipmap.quick_share, R.mipmap.batch_share,R.mipmap.batch_share, R.mipmap.one_share,
                R.mipmap.quick_share, R.mipmap.batch_share,R.mipmap.quick_share, R.mipmap.main_btn};
        for (int i = 0; i < 9; i++) {
            ButtonData buttonData = ButtonData.buildIconButton(this, drawable[i], 0);
            buttonData.setBackgroundColorId(this, R.color.colorAccent);
            buttonDatas.add(buttonData);
        }
        sectorMenuButton.setButtonDatas(buttonDatas);
        setListener(sectorMenuButton);
    }

    private void initBottomSectorMenuButton() {
        SectorMenuButton sectorMenuButton = findViewById(R.id.bottom_sector_menu);
        final List<ButtonData> buttonDatas = new ArrayList<>();
        int[] drawable = {R.mipmap.main_btn, R.mipmap.one_share,
                R.mipmap.quick_share, R.mipmap.batch_share};
        for (int i = 0; i < 4; i++) {
            ButtonData buttonData = ButtonData.buildIconButton(this, drawable[i], 0);
            buttonData.setBackgroundColorId(this, R.color.colorAccent);
            buttonDatas.add(buttonData);
        }
        sectorMenuButton.setButtonDatas(buttonDatas);
        setListener(sectorMenuButton);
    }

    private void initBottomRightSectorMenuButton() {
        SectorMenuButton sectorMenuButton = findViewById(R.id.bottom_right_sector_menu);
        final List<ButtonData> buttonDatas = new ArrayList<>();
        int[] drawable = {R.mipmap.main_btn, R.mipmap.one_share,
                R.mipmap.quick_share, R.mipmap.batch_share};
        for (int i = 0; i < 4; i++) {
            ButtonData buttonData = ButtonData.buildIconButton(this, drawable[i], 0);
            buttonData.setBackgroundColorId(this, R.color.colorAccent);
            buttonDatas.add(buttonData);
        }
        sectorMenuButton.setButtonDatas(buttonDatas);
        setListener(sectorMenuButton);
    }

    private void setListener(final SectorMenuButton button) {
        button.setButtonEventListener(new ButtonEventListener() {
            @Override
            public void onButtonClicked(int index) {
                showToast("按钮" + index);
            }

            @Override
            public void onExpand() {
                showToast("展开");
            }

            @Override
            public void onCollapse() {
                showToast("收起");
            }
        });
    }

    private void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}

