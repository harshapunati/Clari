package mobile.clari.org.clari;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;


//question keys
//oneAFlowQue1 -- 1
//oneAFlowQue1Yes -- 2
//oneAFlowQue1No -- 3
//end flow -- 4

public class que_oneA_yes extends ActionBarActivity {
    RadioGroup radioGroup;
    int key = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que_one_a_yes);
        final TextView queText = (TextView) findViewById(R.id.questionText);
        final AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        final AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);
        fadeIn.setDuration(1200);
        fadeIn.setFillAfter(true);
        fadeOut.setDuration(1200);
        fadeOut.setFillAfter(true);
        fadeOut.setStartOffset(4200 + fadeIn.getStartOffset());
        key = 1;
        queText.setText(R.string.oneAFlowQue1);
        queText.startAnimation(fadeIn);

        radioGroup = (RadioGroup) findViewById(R.id.radioGrp1a);
        final ButtonRectangle next = (ButtonRectangle) findViewById(R.id.nextButton);
        next.setRippleSpeed(20);
        next.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        //Toast.makeText(que_oneA_yes.this, key + "", Toast.LENGTH_SHORT).show();
                                        if (radioGroup.getCheckedRadioButtonId() == -1) {
                                            Toast.makeText(que_oneA_yes.this, "select answer", Toast.LENGTH_SHORT).show();
                                        } else {
                                            int selectedId = radioGroup.getCheckedRadioButtonId();
                                            if (selectedId == R.id.radio1aYes) {
                                                if (key == 1) {
                                                    key = 2;
                                                    queText.startAnimation(fadeOut);
                                                    queText.setText(R.string.oneAFlowQue1Yes);
                                                    queText.startAnimation(fadeIn);
                                                    radioGroup.clearCheck();
                                                    next.setVisibility(View.INVISIBLE);
                                                    radioGroup.setVisibility(View.INVISIBLE);

                                                } else if (key == 3) {
                                                    Globals g = (Globals) getApplication();
                                                    if ((g.getAns1c().equals("yes")) && (g.getAns1d().equals("yes"))) {
                                                        key = 4;//end
                                                        queText.startAnimation(fadeOut);
                                                        queText.setText(R.string.oneANoCyesDyes);
                                                        queText.startAnimation(fadeIn);
                                                        radioGroup.clearCheck();
                                                        next.setVisibility(View.INVISIBLE);
                                                        radioGroup.setVisibility(View.INVISIBLE);

                                                    }
                                                    else if ((g.getAns1c().equals("yes")) && (g.getAns1d().equals("no"))) {
                                                        key = 4;//end
                                                        queText.startAnimation(fadeOut);
                                                        queText.setText(R.string.oneANoCyesDno);
                                                        queText.startAnimation(fadeIn);
                                                        radioGroup.clearCheck();
                                                        next.setVisibility(View.INVISIBLE);
                                                        radioGroup.setVisibility(View.INVISIBLE);

                                                    }
                                                    else if ((g.getAns1c().equals("no")) && (g.getAns1d().equals("yes"))) {
                                                        key = 4;//end
                                                        queText.startAnimation(fadeOut);
                                                        queText.setText(R.string.oneANoCnoDyes);
                                                        queText.startAnimation(fadeIn);
                                                        radioGroup.clearCheck();
                                                        next.setVisibility(View.INVISIBLE);
                                                        radioGroup.setVisibility(View.INVISIBLE);

                                                    }
                                                    else if ((g.getAns1c().equals("no")) && (g.getAns1d().equals("no"))) {
                                                        key = 4;//end
                                                        queText.startAnimation(fadeOut);
                                                        queText.setText(R.string.oneANoCnoDno);
                                                        queText.startAnimation(fadeIn);
                                                        radioGroup.clearCheck();
                                                        next.setVisibility(View.INVISIBLE);
                                                        radioGroup.setVisibility(View.INVISIBLE);

                                                    }
                                                }


                                            } else {
                                                if (key == 1) {
                                                    key = 3;
                                                    queText.startAnimation(fadeOut);
                                                    queText.setText(R.string.oneAFlowQue1No);
                                                    queText.startAnimation(fadeIn);
                                                    radioGroup.clearCheck();

                                                } else if (key == 3) {
                                                    key = 2;
                                                    queText.startAnimation(fadeOut);
                                                    queText.setText(R.string.oneAFlowQue1Yes);
                                                    queText.startAnimation(fadeIn);
                                                    radioGroup.clearCheck();
                                                    next.setVisibility(View.INVISIBLE);
                                                    radioGroup.setVisibility(View.INVISIBLE);

                                                }

                                            }

                                        }
                                    }
                                }

        );

    }


}
