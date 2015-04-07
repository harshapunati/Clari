package mobile.clari.org.clari;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.gc.materialdesign.views.ButtonFlat;
import com.gc.materialdesign.views.ButtonRectangle;
import com.gc.materialdesign.widgets.Dialog;


public class MainActivity extends ActionBarActivity {
    SharedPreferences sharedPreferences;
    final String introScreenShownPref = "introScreenShown";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        Boolean introScreenShown = sharedPreferences.getBoolean(introScreenShownPref, false);
        if (!introScreenShown) {
            ButtonRectangle okButton = (ButtonRectangle) findViewById(R.id.okButton);
            okButton.setRippleSpeed(20);
            okButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 /*   new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Terms and conditions")
                            .setMessage("I have read terms and conditions")
                            .setPositiveButton("I agree", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    SharedPreferences.Editor editor = sharedPreferences.edit();
                                    editor.putBoolean(introScreenShownPref, true);
                                    editor.apply();
                                    Intent intent = new Intent(MainActivity.this, EnterDeatils.class);
                                    startActivity(intent);
                                    finish();
                                }
                            })
                            .setNegativeButton("May be later", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            }).show();*/
                    final Dialog dialog = new Dialog(MainActivity.this, "Terms and conditions", "I have read the terms and conditions");
                    dialog.setOnAcceptButtonClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putBoolean(introScreenShownPref, true);
                            editor.apply();
                            Intent intent = new Intent(MainActivity.this, EnterDeatils.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    dialog.addCancelButton("May be later!", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();

                }
            });
        } else {
            Intent intent = new Intent(MainActivity.this, EnterDeatils.class);
            startActivity(intent);
            finish();
        }

    }


}
