package com.xiaoyaoprefecture.toolbarmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * 简单的玩了一下toolbar与menu的结合
 */
public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar= (Toolbar) findViewById(R.id.mToolbar);
        mToolbar.inflateMenu(R.menu.firstmenu);
        mToolbar.setTitle("我只是随便玩玩");
        mToolbar.setNavigationIcon(R.mipmap.ic_launcher);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你娃儿再点两下试试呀",Toast.LENGTH_SHORT).show();
            }
        });
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mfirst_1:
                        Toast.makeText(MainActivity.this,"你点击了导出",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mfirst_2:
                        Toast.makeText(MainActivity.this,"你一天都在瞎几把点",Toast.LENGTH_SHORT).show();
                        break;

                }
                return false;
            }
        });
    }


}
