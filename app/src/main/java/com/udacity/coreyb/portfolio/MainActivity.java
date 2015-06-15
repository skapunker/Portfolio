package com.udacity.coreyb.portfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonOneOnClick(View v) {
        Toast.makeText(getBaseContext(), "My First Project", Toast.LENGTH_SHORT) .show();
    }

    public void buttonTwoOnClick(View v) {
        Toast.makeText(getBaseContext(), "This will launch my Scores app!", Toast.LENGTH_SHORT) .show();
    }

    public void buttonThreeOnClick(View v) {
        Toast.makeText(getBaseContext(), "This will launch my Library app!", Toast.LENGTH_SHORT) .show();
    }

    public void buttonFourOnClick(View v) {
        Toast.makeText(getBaseContext(), "This will launch my Build it Bigger app!", Toast.LENGTH_SHORT) .show();
    }

    public void buttonFiveOnClick(View v) {
        Toast.makeText(getBaseContext(), "This will launch my XYZ Reader!", Toast.LENGTH_SHORT) .show();
    }

    public void buttonSixOnClick(View v) {
        Toast.makeText(getBaseContext(), "This will launch my own app!", Toast.LENGTH_SHORT) .show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getBaseContext(), "Nothing Here Yet", Toast.LENGTH_SHORT) .show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
