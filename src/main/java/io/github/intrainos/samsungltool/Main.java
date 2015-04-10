package io.github.intrainos.samsungltool;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Main extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gotoAppops = (Button) findViewById(R.id.gotoAppops);
        gotoAppops.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent AppopsIntent = new Intent();
                AppopsIntent.setClassName("com.android.settings", "com.android.settings.Settings");
                AppopsIntent.setAction("android.intent.action.MAIN");
                AppopsIntent.addCategory("android.intent.category.DEFAULT");
                AppopsIntent.setFlags(268468224);
                AppopsIntent.putExtra(":android:show_fragment", "com.android.settings.applications.AppOpsSummary");
                startActivity(AppopsIntent);
            }
        });

        Button TouchLightSetting = (Button) findViewById(R.id.gotoTouchlightSetting);
        TouchLightSetting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent TouchLightSetting = new Intent(getApplicationContext(), TouchLight.class);
                startActivity(TouchLightSetting);
            }
        });


        Button gotoSViewWPSetting = (Button) findViewById(R.id.gotoSViewWPSetting);
        gotoSViewWPSetting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent gotoSViewWPSetting = new Intent();
                gotoSViewWPSetting.setClassName("com.android.settings", "com.android.settings.SViewColor2014");
                gotoSViewWPSetting.setAction("android.intent.action.MAIN");
                gotoSViewWPSetting.addCategory("android.intent.category.DEFAULT");
                gotoSViewWPSetting.setFlags(268468224);
                startActivity(gotoSViewWPSetting);
            }
        });

        Button gotoToolBoxSetting = (Button) findViewById(R.id.gotoToolBoxSetting);
        gotoToolBoxSetting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent gotoToolBoxSetting = new Intent();
                gotoToolBoxSetting.setClassName("com.android.settings", "com.android.settings.Settings$ToolboxMenuActivity");
                gotoToolBoxSetting.setAction("android.intent.action.MAIN");
                gotoToolBoxSetting.addCategory("android.intent.category.DEFAULT");
                gotoToolBoxSetting.setFlags(268468224);
                startActivity(gotoToolBoxSetting);
            }
        });

        Button gotoToolBoxList = (Button) findViewById(R.id.gotoToolBoxList);
        gotoToolBoxList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent gotoToolBoxList = new Intent();
                gotoToolBoxList.setClassName("com.android.settings", "com.android.settings.Settings$ToolboxListActivity");
                gotoToolBoxList.setAction("android.intent.action.MAIN");
                gotoToolBoxList.addCategory("android.intent.category.DEFAULT");
                gotoToolBoxList.setFlags(268468224);
                startActivity(gotoToolBoxList);
            }
        });

        Button gotoDownloadBoosterSetting = (Button) findViewById(R.id.gotoDownloadBoosterSetting);
        gotoDownloadBoosterSetting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent gotoDownloadBoosterSetting = new Intent();
                gotoDownloadBoosterSetting.setClassName("com.android.settings", "com.android.settings.Settings$SmartBondingSettingsActivity");
                gotoDownloadBoosterSetting.setAction("android.intent.action.MAIN");
                gotoDownloadBoosterSetting.addCategory("android.intent.category.DEFAULT");
                gotoDownloadBoosterSetting.setFlags(268468224);
                startActivity(gotoDownloadBoosterSetting);
            }
        });

        Button goto2014PowerSavingModeSetting = (Button) findViewById(R.id.goto2014PowerSavingModeSetting);
        goto2014PowerSavingModeSetting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent goto2014PowerSavingModeSetting = new Intent();
                goto2014PowerSavingModeSetting.setClassName("com.android.settings", "com.android.settings.Settings$PowerSavingModeSettings2014Activity");
                goto2014PowerSavingModeSetting.setAction("android.intent.action.MAIN");
                goto2014PowerSavingModeSetting.addCategory("android.intent.category.DEFAULT");
                goto2014PowerSavingModeSetting.setFlags(268468224);
                startActivity(goto2014PowerSavingModeSetting);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();




        /*
        //Not Use
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about)
        {
            return true;

        }

        return super.onOptionsItemSelected(item);
        */
        return false;
    }
}
