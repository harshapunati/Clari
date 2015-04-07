package mobile.clari.org.clari;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;


public class questionSet_one extends ActionBarActivity {
    RadioGroup que1aGroup;
    RadioGroup que1cGroup;
    RadioGroup que1dGroup;
    int selectedId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_set_one);
        que1aGroup = (RadioGroup) findViewById(R.id.radioGrp1a);
        que1cGroup = (RadioGroup) findViewById(R.id.radioGrp1c);
        que1dGroup = (RadioGroup) findViewById(R.id.radioGrp1d);
        ButtonRectangle nextButton = (ButtonRectangle) findViewById(R.id.nextset1);
        nextButton.setRippleSpeed(20);
        final Globals g = (Globals) getApplication();
        g.setAns1a("");
        g.setAns1c("");
        g.setAns1d("");

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checking que1

                if ((que1aGroup.getCheckedRadioButtonId() == -1) || (que1cGroup.getCheckedRadioButtonId() == -1) || (que1dGroup.getCheckedRadioButtonId() == -1)) {
                    Toast.makeText(questionSet_one.this, "Answer all the questions", Toast.LENGTH_SHORT).show();
                } else {
                    //storing a
                    int selectedId = que1aGroup.getCheckedRadioButtonId();
                    if (selectedId == R.id.radio1aYes) {
                        g.setAns1a("yes");
                    } else {
                        g.setAns1a("no");
                    }
                    //storing c
                    selectedId = que1cGroup.getCheckedRadioButtonId();
                    if (selectedId == R.id.radio1cYes) {
                        g.setAns1c("yes");
                    } else {
                        g.setAns1c("no");
                    }
                    //storing d
                    selectedId = que1dGroup.getCheckedRadioButtonId();
                    if (selectedId == R.id.radio1dYes) {
                        g.setAns1d("yes");
                    } else {
                        g.setAns1d("no");
                    }

                    if (g.getAns1a().equals("yes")) {
                        Intent i = new Intent(questionSet_one.this, que_oneA_yes.class);
                        startActivity(i);
                        finish();
                    } else {
                        Intent i = new Intent(questionSet_one.this, que_oneA_no.class);
                        startActivity(i);
                        finish();
                    }
                }

            }
        });
        ButtonRectangle que1eButton = (ButtonRectangle) findViewById(R.id.que1eButton);
        que1eButton.setRippleSpeed(20);
        que1eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.setAns1a("");
                g.setAns1c("");
                g.setAns1d("");

                Intent i = new Intent(questionSet_one.this, questionSet_two.class);
                startActivity(i);
                finish();
            }
        });

    }


}
