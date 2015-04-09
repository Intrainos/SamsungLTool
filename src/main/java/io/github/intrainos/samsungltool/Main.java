package io.github.intrainos.samsungltool;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Main extends Activity {
    public static final int MENU1 = Menu.FIRST +0;


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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(menu.NONE, MENU1, Menu.NONE, "Homepage");

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
