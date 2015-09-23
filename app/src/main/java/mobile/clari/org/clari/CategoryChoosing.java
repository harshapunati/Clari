package mobile.clari.org.clari;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.gc.materialdesign.views.ButtonRectangle;


public class CategoryChoosing extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_choosing);
        ButtonRectangle detailedButton = (ButtonRectangle) findViewById(R.id.detailedButton);
        detailedButton.setRippleSpeed(20);
        detailedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryChoosing.this, questionSet_one.class);
                startActivity(i);
            }
        });
        ButtonRectangle instantButton = (ButtonRectangle) findViewById(R.id.instantButton);
        instantButton.setRippleSpeed(20);
        instantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoryChoosing.this, InstantResults.class);
                startActivity(i);
            }
        });
    }


}
