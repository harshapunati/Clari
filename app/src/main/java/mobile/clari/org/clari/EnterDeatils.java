package mobile.clari.org.clari;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.Toolbar;

import com.gc.materialdesign.views.ButtonRectangle;

import java.util.Calendar;


public class EnterDeatils extends ActionBarActivity {
    EditText enterName;
    ButtonRectangle dobButton;
    static final int DATE_DIALOG_ID = 999;
    private int year = 2015;
    private int month = 0;
    private int day = 23;
    ButtonRectangle finishButton;
    RadioGroup radioSexGroup;
    int mfSet = 1;
    RadioButton radioSexButton;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_deatils);
        enterName = (EditText) findViewById(R.id.enterName);
        dobButton = (ButtonRectangle) findViewById(R.id.dobButton);
        radioSexGroup = (RadioGroup) findViewById(R.id.radioGrp);
        Calendar calendar = Calendar.getInstance();
        final int Currentyear = calendar.get(Calendar.YEAR);
        dobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);
            }
        });
        dobButton.setRippleSpeed(20);
        finishButton = (ButtonRectangle) findViewById(R.id.finishButton);
        finishButton.setRippleSpeed(20);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioSexGroup.getCheckedRadioButtonId();
                radioSexButton = (RadioButton) findViewById(selectedId);
                if (selectedId == R.id.radioM) {
                    mfSet = 1;
                } else {
                    mfSet = 0;
                }
                if (enterName.getText().toString().trim().equals("")) {
                    enterName.setError("Name is required!");
                    //You can Toast a message here that the Username is Empty
                } else if (flag == 0) {
                    Toast.makeText(EnterDeatils.this, "Enter dob", Toast.LENGTH_SHORT).show();
                } else if (year >= Currentyear) {
                    Toast.makeText(EnterDeatils.this, "Enter correct dob", Toast.LENGTH_SHORT).show();

                } else {
                    Globals g = (Globals) getApplication();
                    g.setName(enterName.getText().toString());
                    g.setdobYear(year);
                    g.setdobDate(day);
                    g.setdobMonth(month);
                    g.setmf(mfSet);

                    Intent i = new Intent(EnterDeatils.this, CategoryChoosing.class);
                    startActivity(i);
                }

            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_DIALOG_ID:
                // set date picker as current date
                return new DatePickerDialog(this, datePickerListener,
                        year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener datePickerListener
            = new DatePickerDialog.OnDateSetListener() {

        // when dialog box is closed, below method will be called.
        public void onDateSet(DatePicker view, int selectedYear,
                              int selectedMonth, int selectedDay) {
            year = selectedYear;
            month = selectedMonth;
            day = selectedDay;
            flag = 1;


        }
    };

}
