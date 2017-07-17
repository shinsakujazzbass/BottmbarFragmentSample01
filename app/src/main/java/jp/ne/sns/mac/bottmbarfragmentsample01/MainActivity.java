package jp.ne.sns.mac.bottmbarfragmentsample01;

import android.support.annotation.IdRes;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends ActionBarActivity {

    BottomBar mBottomBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomBar = BottomBar.attach(this,savedInstanceState);

        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if(menuItemId == R.id.Bottombaritemone){
                    Home f = new Home();
                    getSupportFragmentManager().beginTransaction().replace(R.id.farame,f).commit();
                } else   if(menuItemId == R.id.Bottombaritemtwo){
                    Note f = new Note();
                    getSupportFragmentManager().beginTransaction().replace(R.id.farame,f).commit();
                } else   if(menuItemId == R.id.BottombaritemThree){
                    Camera f = new Camera();
                    getSupportFragmentManager().beginTransaction().replace(R.id.farame,f).commit();
                } else   if(menuItemId == R.id.Bottombaritemfour){
                    Mails f = new Mails();
                    getSupportFragmentManager().beginTransaction().replace(R.id.farame,f).commit();
                } else   if(menuItemId == R.id.Bottombaritemfive){
                    Settings f = new Settings();
                    getSupportFragmentManager().beginTransaction().replace(R.id.farame,f).commit();
                }

            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });

    }
}
