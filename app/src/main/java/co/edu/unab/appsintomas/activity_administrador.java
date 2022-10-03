package co.edu.unab.appsintomas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import co.edu.unab.appsintomas.controlador.PagerController;

public class activity_administrador extends AppCompatActivity {
 private TabLayout tabLayout;
 private ViewPager viewPager;
 private TabItem tabcursos,tabdocentes,tabalumnos;
 private PagerController pagerController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);
        getSupportActionBar().hide();
        setup();
    }


    public void setup(){
            tabLayout= findViewById(R.id.tabadmin);
            viewPager= findViewById(R.id.viewpager);
            tabcursos=findViewById(R.id.tabcursos);
            tabdocentes=findViewById(R.id.tabdocentes);
            tabalumnos= findViewById(R.id.tabestudiantes);
            pagerController = new PagerController(getSupportFragmentManager(),tabLayout.getTabCount());
            viewPager.setAdapter(pagerController);
            tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                    if(tab.getPosition()==0){

                    pagerController.notifyDataSetChanged();

                    }

                    if(tab.getPosition()==1){

                        pagerController.notifyDataSetChanged();

                    }
                    if(tab.getPosition()==2){

                        pagerController.notifyDataSetChanged();

                    }

                    }


                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}