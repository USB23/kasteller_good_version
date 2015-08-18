package dirk.kasteller;

import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


class MainActivity extends ActionBarActivity {



    public class  PlaceholderFragment extends Fragment implements View.OnClickListener {

        double geld = 0;

        View rootView;

        public void ingevoerdehoeveelheid() {
            //geld dat wordt ingevoerd


            Button button = button;


            double vijfcent = 15;
            double tiencent = 8;
            double twintigcent = 4;
            double vijftigcent = 1;
            double eeneuro = 2;
            double tweeeuro = 5;
            double vijfeuro = 1;
            double tieneuro = 1;
            double twintigeuro = 2;
            double vijftigeuro = 1;
            double honderdeuro = 0;
            //ingevulde getallen zijn om te testen

            double amount = 0 + vijfcent / 50 + tiencent / 10 + twintigcent / 5 + vijftigcent / 2 + eeneuro + tweeeuro * 2 + vijfeuro * 5 + tieneuro * 10 + twintigeuro * 10 + vijftigeuro * 50 + honderdeuro * 100;

            geld = geld + amount;


        public void bereken(View v) {

            TextView textView = (TextView) findViewById(R.id.textView13);
            textView.setText(geld);

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*
        Handle action bar item clicks here. The action bar will
        automatically handle clicks on the Home/Up button, so long
        as you specify a parent activity in AndroidManifest.xml.
        */
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }