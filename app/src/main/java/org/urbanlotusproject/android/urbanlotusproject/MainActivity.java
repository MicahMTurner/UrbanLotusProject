package org.urbanlotusproject.android.urbanlotusproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float emotionalScore, completedQuestions = 0;
    float emotionalTotal = 20;
    float totalQuestions = 5;
    String eScoreMessage, completenessMessage, metricsMessage;
    boolean userRaceInput, userEthnicityInput= false;
    CheckBox checkboxNativeAmerican, checkboxAsian, checkboxBlack, checkboxIslander, checkboxWhite,checkboxOther;
    CheckBox checkBoxLatino, checkBoxNotLatino;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Make CheckBox variable holders based on the view ID resource.
        checkboxAsian = findViewById(R.id.checkbox_race_asian);
        checkboxNativeAmerican = findViewById(R.id.checkbox_race_native);
        checkboxBlack = findViewById(R.id.checkbox_race_black);
        checkboxIslander = findViewById(R.id.checkbox_race_islander);
        checkboxWhite = findViewById(R.id.checkbox_race_white);
        checkboxOther = findViewById(R.id.checkbox_race_other);
        checkBoxLatino = findViewById(R.id.checkbox_ethnicity_latino);
        checkBoxNotLatino = findViewById(R.id.checkbox_ethnicity_not_latino);
// Create a spinner variable holder for the Gender values.
        Spinner spinner = findViewById(R.id.gender);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);}

//Award points for completion and emotional state for question number one.
    public void questionOneAnswered(View v) {
        switch (v.getId()) {
            case R.id.q1_0:
                emotionalScore +=4;
                completedQuestions += 1;
                break;
            case R.id.q1_1:
                emotionalScore += 3;
                completedQuestions += 1;
                break;
            case R.id.q1_2:
                emotionalScore += 2;
                completedQuestions += 1;
                break;
            case R.id.q1_3:
                emotionalScore +=1;
                completedQuestions += 1;
                break;
            case R.id.q1_4:
                completedQuestions += 1;
                break;
            default:
                completedQuestions -= 1;
                break;
        }
    }
    //Award points for completion and emotional state for question number two.
    public void questionTwoAnswered(View v) {
        switch (v.getId()) {
            case R.id.q2_0:
                emotionalScore +=4;
                completedQuestions += 1;
                break;
            case R.id.q2_1:
                emotionalScore += 3;
                completedQuestions += 1;
                break;
            case R.id.q2_2:
                emotionalScore += 2;
                completedQuestions += 1;
                break;
            case R.id.q2_3:
                emotionalScore +=1;
                completedQuestions += 1;
                break;
            case R.id.q2_4:
                completedQuestions += 1;
                break;
            default:
                completedQuestions -= 1;
                break;
        }
    }
    //Award points for completion and emotional state for question number three.
    public void questionThreeAnswered(View v) {
        switch (v.getId()) {
            case R.id.q3_0:
                emotionalScore +=4;
                completedQuestions += 1;
                break;
            case R.id.q3_1:
                emotionalScore += 3;
                completedQuestions += 1;
                break;
            case R.id.q3_2:
                emotionalScore += 2;
                completedQuestions += 1;
                break;
            case R.id.q3_3:
                emotionalScore +=1;
                completedQuestions += 1;
                break;
            case R.id.q3_4:
                completedQuestions += 1;
                break;
            default:
                completedQuestions -= 1;
                break;
        }
    }
    //Award points for completion and emotional state for question number four.
    public void questionFourAnswered(View v) {
        switch (v.getId()) {
            case R.id.q4_0:
                completedQuestions += 1;
                break;
            case R.id.q4_1:
                emotionalScore += 1;
                completedQuestions += 1;
                break;
            case R.id.q4_2:
                emotionalScore += 2;
                completedQuestions += 1;
                break;
            case R.id.q4_3:
                emotionalScore +=3;
                completedQuestions += 1;
                break;
            case R.id.q4_4:
                emotionalScore +=4;
                completedQuestions += 1;
                break;
            default:
                completedQuestions -= 1;
                break;
        }
    }
    //Award points for completion and emotional state for question number five.
    public void questionFiveAnswered(View v) {
        switch (v.getId()) {
            case R.id.q5_0:
                completedQuestions += 1;
                break;
            case R.id.q5_1:
                emotionalScore += 1;
                completedQuestions += 1;
                break;
            case R.id.q5_2:
                emotionalScore += 2;
                completedQuestions += 1;
                break;
            case R.id.q5_3:
                emotionalScore +=3;
                completedQuestions += 1;
                break;
            case R.id.q5_4:
                emotionalScore +=4;
                completedQuestions += 1;
                break;
            default:
                completedQuestions -= 1;
                break;
        }
    }

    // This function checks the CheckBox views and their value
    public void onCheckBoxClicked(View view) {
        // Create a variable to hold the boolean .isChecked value of the target view.
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked for race and ethnicity
        switch(view.getId()) {
            case R.id.checkbox_race_native:
                if (checked)
                    userRaceInput = true;

            case R.id.checkbox_race_asian:
                if (checked)
                    userRaceInput= true;

            case R.id.checkbox_race_black:
                if (checked)
                    userRaceInput= true;

            case R.id.checkbox_race_islander:
                if (checked)
                    userRaceInput= true;

            case R.id.checkbox_race_white:
                if (checked)
                    userRaceInput= true;

            case R.id.checkbox_race_other:
                if (checked)
                    userRaceInput= true;
            case R.id.checkbox_ethnicity_latino:
                if (checked)
                    userEthnicityInput= true;

            case R.id.checkbox_ethnicity_not_latino:
                if (checked)
                    userEthnicityInput= true;
            default:
                userEthnicityInput = false;
                userRaceInput = true;
                break;
            //now we can check the boxes against their default values for user interaction.
        }
    }
// This function calculates the total percentage of completion and their current stress level
    //then shows the user a message and some resources if they feel overwhelmed.
    public void submitButtonClicked(View view) {
        EditText initials = findViewById(R.id.userInitials);
        Log.v("Emotional Responses", Float.toString(emotionalScore));
        float eScore = emotionalScore / emotionalTotal * 100;
        eScore = Math.round(eScore);
        Log.v("Score: ", Float.toString(eScore * 100) + "%");
        if (eScore < 35){
            eScoreMessage = "You are not alone!" + " Call 1-800-273-8255" + "\n For suicide prevention";
        }    else {
            eScoreMessage = "Feeling: " + eScore + "%";
        }
        Toast.makeText(MainActivity.this, eScoreMessage, Toast.LENGTH_LONG).show();

        Log.v("Complete Answers", Float.toString(completedQuestions));
        float cScore = completedQuestions / totalQuestions * 100;
        cScore = Math.round(cScore);
        Log.v("Completed: ", Float.toString(cScore * 100) + "%");
        completenessMessage = "Completed: " + cScore + "%";
        Toast.makeText(MainActivity.this, completenessMessage, Toast.LENGTH_LONG).show();
        Log.v( "Metrics Filled out:", Boolean.toString(userRaceInput));


        if (initials.getText().toString().equals("")) {
            metricsMessage = "You haven't entered your initials";
        } else {
            metricsMessage = "Thank You!";
        }
        Toast.makeText(MainActivity.
                this, metricsMessage, Toast.LENGTH_LONG).show();
        resetQuiz();
    }
// This function resets radio groups, score variables and booleans.
    public void resetQuiz(){
        RadioGroup radioOne = findViewById(R.id.q1_group);
        radioOne.clearCheck();
        RadioGroup radioTwo = findViewById(R.id.q2_group);
        radioTwo.clearCheck();
        RadioGroup radioThree = findViewById(R.id.q3_group);
        radioThree.clearCheck();
        RadioGroup radioFour = findViewById(R.id.q4_group);
        radioFour.clearCheck();
        RadioGroup radioFive = findViewById(R.id.q5_group);
        radioFive.clearCheck();
        emotionalScore = 0;
        completedQuestions = 0;
        userRaceInput = false;
    }
}


