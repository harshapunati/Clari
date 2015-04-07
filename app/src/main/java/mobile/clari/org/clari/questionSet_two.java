package mobile.clari.org.clari;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;


public class questionSet_two extends ActionBarActivity {
    RadioGroup que2aGroup;
    RadioGroup que2bGroup;
    RadioGroup que2cGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_set_two);
        que2aGroup = (RadioGroup) findViewById(R.id.radioGrp2a);
        que2bGroup = (RadioGroup) findViewById(R.id.radioGrp2b);
        que2cGroup = (RadioGroup) findViewById(R.id.radioGrp2c);
        TextView que2c = (TextView) findViewById(R.id.que2c);
        ButtonRectangle nextButton = (ButtonRectangle) findViewById(R.id.nextset2);
        nextButton.setRippleSpeed(20);
        final Globals g = (Globals) getApplication();
        g.setAns2a("");
        g.setAns2b("");
        g.setAns2c("");
        if (g.getmf() == 1) {
            que2cGroup.setVisibility(View.GONE);
            que2c.setVisibility(View.GONE);
        }

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checking que1
                if (g.getmf() == 1) {
                    if ((que2aGroup.getCheckedRadioButtonId() == -1) || (que2bGroup.getCheckedRadioButtonId() == -1)) {
                        Toast.makeText(questionSet_two.this, "Answer all the questions", Toast.LENGTH_SHORT).show();
                    } else {
                        //storing a
                        int selectedId = que2aGroup.getCheckedRadioButtonId();
                        if (selectedId == R.id.radio2aYes) {
                            g.setAns2a("yes");
                        } else {
                            g.setAns2a("no");
                        }
                        //storing c
                        selectedId = que2bGroup.getCheckedRadioButtonId();
                        if (selectedId == R.id.radio2bYes) {
                            g.setAns2b("yes");
                        } else {
                            g.setAns2b("no");
                        }


                        Intent i = new Intent(questionSet_two.this, QueSetTwoResult.class);
                        startActivity(i);
                    }

                } else {
                    if ((que2aGroup.getCheckedRadioButtonId() == -1) || (que2bGroup.getCheckedRadioButtonId() == -1) || (que2cGroup.getCheckedRadioButtonId() == -1)) {
                        Toast.makeText(questionSet_two.this, "Answer all the questions", Toast.LENGTH_SHORT).show();
                    } else {
                        //storing a
                        int selectedId = que2aGroup.getCheckedRadioButtonId();
                        if (selectedId == R.id.radio2aYes) {
                            g.setAns2a("yes");
                        } else {
                            g.setAns2a("no");
                        }
                        //storing c
                        selectedId = que2bGroup.getCheckedRadioButtonId();
                        if (selectedId == R.id.radio2bYes) {
                            g.setAns2b("yes");
                        } else {
                            g.setAns2b("no");
                        }
                        //storing c
                        selectedId = que2cGroup.getCheckedRadioButtonId();
                        if (selectedId == R.id.radio2cYes) {
                            g.setAns2c("yes");
                        } else {
                            g.setAns2c("no");
                        }


                        Intent i = new Intent(questionSet_two.this, QueSetTwoResult.class);
                        startActivity(i);
                    }


                }


            }
        });
    }


}
