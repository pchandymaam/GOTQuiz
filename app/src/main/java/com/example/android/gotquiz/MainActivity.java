package com.example.android.gotquiz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //* Checks to see if question 1 was answered correctly and adds 1 to the score.
    private void checkQuestionOne() {
        EditText hodorStandsFor = findViewById(R.id.hodorStandsFor);
        String hodorAnswer = hodorStandsFor.getText().toString();
        if (hodorAnswer.trim().equalsIgnoreCase("Hold the door")){
            score += 1;
        }
    }

    //* Checks to see if question 2 was answered correctly and adds 1 to the score.
    private void checkQuestionTwo() {
        RadioButton radioRhaegarTargarean = findViewById(R.id.rhaegarTargarean);
        boolean isRhaegarTargareadChecked = radioRhaegarTargarean.isChecked();
        if (isRhaegarTargareadChecked) {
            score += 1;
        }
    }

    //* Checks to see if question 3 was answered correctly and adds 1 to the score.
    private void checkQuestionThree(){
        RadioButton radioBrotherSister = findViewById(R.id.brotherAndSister);
        boolean isBrotherAndSisterChecked = radioBrotherSister.isChecked();
        if (isBrotherAndSisterChecked){
            score +=1;
        }
    }

    //* Checks to see if question 4 was answered correctly and adds 1 to the score.
    private void checkQuestionFour(){
        CheckBox unburned = findViewById(R.id.unburned);
        CheckBox andalQueen = findViewById(R.id.andalsQueen);
        CheckBox desertKhaleesi = findViewById(R.id.desertKhaleesi);
        CheckBox khaleesi = findViewById(R.id.khaleesi);
        CheckBox chainBreaker = findViewById(R.id.chainBreaker);
        CheckBox slaveFreer = findViewById(R.id.slaveFreer);
        CheckBox dragonMother = findViewById(R.id.dragonMother);
        CheckBox motherOfDragons = findViewById(R.id.motherOfDragons);
        CheckBox unburnt = findViewById(R.id.unburnt);
        CheckBox firstOfName = findViewById(R.id.firstOfName);

        boolean isUnburnedChecked = unburned.isChecked();
        boolean isAndalQueenChecked = andalQueen.isChecked();
        boolean isDesertKhaleesiChecked = desertKhaleesi.isChecked();
        boolean isKhaleesiChecked = khaleesi.isChecked();
        boolean isChainBreakerChecked = chainBreaker.isChecked();
        boolean isSlaveFreerChecked = slaveFreer.isChecked();
        boolean isDragonMotherChecked = dragonMother.isChecked();
        boolean isMotherOfDragonsChecked = motherOfDragons.isChecked();
        boolean isUnburntChecked = unburnt.isChecked();
        boolean isFirstOfNameChecked = firstOfName.isChecked();

        if (!isUnburnedChecked && isAndalQueenChecked && !isDesertKhaleesiChecked && isKhaleesiChecked && isChainBreakerChecked && !isSlaveFreerChecked && !isDragonMotherChecked && isMotherOfDragonsChecked && isUnburntChecked && isFirstOfNameChecked){
            score +=1;
        }
    }

    //* Checks to see if question 5 was answered correctly and adds 1 to the score.
    private void checkQuestionFive(){
        CheckBox greyWind = findViewById(R.id.greyWind);
        CheckBox lady = findViewById(R.id.lady);
        CheckBox nymeria = findViewById(R.id.nymeria);
        CheckBox summer = findViewById(R.id.summer);
        CheckBox shaggyDog = findViewById(R.id.shaggyDog);
        CheckBox ghost = findViewById(R.id.ghost);

        boolean isGreyWindChecked = greyWind.isChecked();
        boolean isLadyChecked = lady.isChecked();
        boolean isNymeriaChecked = nymeria.isChecked();
        boolean isSummerChecked = summer.isChecked();
        boolean isShaggyDogChecked = shaggyDog.isChecked();
        boolean isGhostChecked = ghost.isChecked();

        if (isGreyWindChecked && isLadyChecked && !isNymeriaChecked && isSummerChecked && isShaggyDogChecked && !isGhostChecked){
            score +=1;
        }
    }

    //* Checks to see if question 6 was answered correctly and adds 1 to the score.
    private void checkQuestionSix(){
        RadioButton radioTyrionLannister = findViewById(R.id.tyrionLannister);
        boolean isTyrionLannisterChecked= radioTyrionLannister.isChecked();
        if (isTyrionLannisterChecked){
            score +=1;
        }
    }

    //* Checks to see if question 7 was answered correctly and adds 1 to the score.
    private void checkQuestionSeven(){
        RadioButton radioBronn = findViewById(R.id.bronn);
        boolean isBronnChecked = radioBronn.isChecked();
        if (isBronnChecked){
            score +=1;
        }
    }

    //* Checks to see if question 8 was answered correctly and adds 1 to the score.
    private void checkQuestionEight(){
        RadioButton radioYes = findViewById(R.id.yes);
        boolean isYesChecked = radioYes.isChecked();
        if (isYesChecked) {
            score +=1;
        }
    }

    //*  Checks all of the quiz questions for accuracy.  Presents a custom toast message.
    public void submitQuiz (View view) {
        checkQuestionOne();
        checkQuestionTwo();
        checkQuestionThree();
        checkQuestionFour();
        checkQuestionFive();
        checkQuestionSix();
        checkQuestionSeven();
        checkQuestionEight();

        //*  Presents a custom toast depending on the final score for the quiz.
        if (score == 8) {
            Toast.makeText(this, "You scored " + score + " out of 8.  \nYou are truly a Game of Thrones fan!" , Toast.LENGTH_LONG).show();
        }
        else if (score == 5 || score == 6 || score == 7) {
            Toast.makeText(this, "You scored " + score + " out of 8. \nNot quite a hardcore fan yet!" , Toast.LENGTH_LONG).show();
        }
        else if (score == 2 || score == 3 || score == 4) {
            Toast.makeText(this, "You scored " + score + " out of 8. \nBetter rewatch the show before next season!" , Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "You scored " + score + " out of 8. \nGame of Thrones? What's Game of Thrones?" , Toast.LENGTH_LONG).show();
        }

        score = 0;

    }
}