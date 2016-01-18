package appewtc.masterung.healthrecord;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Section1Activity extends AppCompatActivity {

    //Explicit
    private Spinner ageSpinner;
    private RadioGroup sexRadioGroup, pressureRadioGroup, diabetesRadioGroup;
    private RadioButton sexMaleRadioButton, sexFemaleRadioButton,
            pressureNoHaveRadioButton, pressureHaveRadioButton,
            diabetesNoHaveRadioButton, diabetesHaveRadioButton;
    private EditText heightEditText, weightEditText, widthEditText;
    private String sexString, pressureString, diabetesString,
            heightString, weightString, widthString;
    private int ageAnInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section1);

        //Bind Widget
        bindWidget();

        //Create Age Spinner
        createAgeSpinner();

    }   // Main Method

    public void clickSection11(View view) {

        String tag = "section11";
        Log.d(tag, "ageAnInt = " + ageAnInt);


    }   // clickSection11


    private void createAgeSpinner() {

        String[] choiceStrings = new String[3];

        choiceStrings[0] = "0 - 44 ปี";
        choiceStrings[1] = "45 - 49 ปี";
        choiceStrings[2] = "50 ปี ขึ้นไป";

        ArrayAdapter<String> ageAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, choiceStrings);
        ageSpinner.setAdapter(ageAdapter);

        ageSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                ageAnInt = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                ageAnInt = 0;
            }
        });

    }   // createAgeSpinner

    private void bindWidget() {

        ageSpinner = (Spinner) findViewById(R.id.spinner);
        sexRadioGroup = (RadioGroup) findViewById(R.id.ragSex);
        pressureRadioGroup = (RadioGroup) findViewById(R.id.ragPressure);
        diabetesRadioGroup = (RadioGroup) findViewById(R.id.ragDiabetes);
        sexMaleRadioButton = (RadioButton) findViewById(R.id.radioButton);
        sexFemaleRadioButton = (RadioButton) findViewById(R.id.radioButton2);
        pressureNoHaveRadioButton = (RadioButton) findViewById(R.id.radioButton3);
        pressureHaveRadioButton = (RadioButton) findViewById(R.id.radioButton4);
        diabetesNoHaveRadioButton = (RadioButton) findViewById(R.id.radioButton5);
        diabetesHaveRadioButton = (RadioButton) findViewById(R.id.radioButton6);


    }   // bindWidget

}   // Main Class
