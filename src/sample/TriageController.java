package sample;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;

public class TriageController {

    //AnchorPanes
    @FXML public AnchorPane welcomePane;
    @FXML public AnchorPane introPane;
    @FXML public AnchorPane scalePane;
    @FXML public AnchorPane finalGradePane;
    @FXML public AnchorPane exampleIntroPane;
    @FXML public AnchorPane exampleIntroContPane;
    @FXML public AnchorPane exampleZeroPane;
    @FXML public AnchorPane exampleOnePane;
    @FXML public AnchorPane exampleTwoPane;
    @FXML public AnchorPane exampleThreePane;
    @FXML public AnchorPane testPane;
    @FXML public AnchorPane questionOnePane;
    @FXML public AnchorPane questionTwoPane;
    @FXML public AnchorPane questionThreePane;
    @FXML public AnchorPane correctAnswerPane;
    @FXML public AnchorPane incorrectAnswerPane;
    @FXML public AnchorPane lastPane;

    //LabelButtons
    @FXML public Label welcomeButton;
    @FXML public Label introButton;
    @FXML public Label scaleButton;
    @FXML public Label finalGradeButton;
    @FXML public Label exampleIntroButton;
    @FXML public Label exampleIntroContButton;
    @FXML public Label exampleZeroButton;
    @FXML public Label exampleOneButton;
    @FXML public Label exampleTwoButton;
    @FXML public Label exampleThreeButton;
    @FXML public Label testButton;
    @FXML public Label questionOneButton;
    @FXML public Label questionOneExplanation;
    @FXML public Label questionTwoExplanation;
    @FXML public Label questionThreeExplanation;
    @FXML public Label correctButton;
    @FXML public Label incorrectButton;
    @FXML public Label correctLabel;

    //Radiobuttons
    @FXML public RadioButton questionOneAnswerA;
    @FXML public RadioButton questionOneAnswerB;
    @FXML public RadioButton questionOneAnswerC;
    @FXML public RadioButton questionOneAnswerD;
    @FXML public RadioButton questionTwoAnswerA;
    @FXML public RadioButton questionTwoAnswerB;
    @FXML public RadioButton questionTwoAnswerC;
    @FXML public RadioButton questionTwoAnswerD;
    @FXML public RadioButton questionThreeAnswerA;
    @FXML public RadioButton questionThreeAnswerB;
    @FXML public RadioButton questionThreeAnswerC;
    @FXML public RadioButton questionThreeAnswerD;

    private int currentQustion=0;
    private int correctAnswers=0;

    //controllers for button presses
    @FXML private void welcomeNextPane(){
        welcomePane.setVisible(false);
        introPane.setVisible(true);
    }

    @FXML private void introNextPane(){
        introPane.setVisible(false);
        scalePane.setVisible(true);
    }

    @FXML private void scaleNextPane() {
        scalePane.setVisible(false);
        finalGradePane.setVisible(true);
    }

    @FXML private void finalGradeNextPane() {
        finalGradePane.setVisible(false);
        exampleIntroPane.setVisible(true);
    }

    @FXML private void exampleIntroNextPane() {
        exampleIntroPane.setVisible(false);
        exampleIntroContPane.setVisible(true);
    }

    @FXML private void exampleIntroContNextPane() {
        exampleIntroContPane.setVisible(false);
        exampleZeroPane.setVisible(true);
    }

    @FXML private void exampleZeroNextPane() {
        exampleZeroPane.setVisible(false);
        exampleOnePane.setVisible(true);
    }

    @FXML private void exampleOneNextPane() {
        exampleOnePane.setVisible(false);
        exampleTwoPane.setVisible(true);
    }

    @FXML private void exampleTwoNextPane() {
        exampleTwoPane.setVisible(false);
        exampleThreePane.setVisible(true);
    }

    @FXML private void exampleThreeNextPane() {
        exampleThreePane.setVisible(false);
        testPane.setVisible(true);
    }

    @FXML private void testNextPane() {
        testPane.setVisible(false);
        questionOnePane.setVisible(true);
        currentQustion=1;
    }

    @FXML private void questionOneAnswer(){
        if (questionOneAnswerA.isSelected()){
            correctAnswerPane.setVisible(true);
            correctAnswers+=1;
        }
        else{
            incorrectAnswerPane.setVisible(true);
            questionOneExplanation.setVisible(true);

        }
        questionOnePane.setVisible(false);
        currentQustion=2;
    }

    @FXML private void questionTwoAnswer(){
        if (questionTwoAnswerC.isSelected()){
            correctAnswerPane.setVisible(true);
            correctAnswers+=1;
        }
        else{
            incorrectAnswerPane.setVisible(true);
            questionTwoExplanation.setVisible(true);
        }
        questionTwoPane.setVisible(false);
        currentQustion=3;
    }

    @FXML private void questionThreeAnswer(){
        if (questionThreeAnswerD.isSelected()){
            correctAnswerPane.setVisible(true);
            correctAnswers+=1;
        }
        else{
            incorrectAnswerPane.setVisible(true);
            questionThreeExplanation.setVisible(true);
        }
        questionThreePane.setVisible(false);
        currentQustion=4;
    }

    @FXML private void answerNextPane(){
        if (currentQustion==2){
            questionTwoPane.setVisible(true);
        }
        else if (currentQustion==3){
            questionThreePane.setVisible(true);
        }
        else if(currentQustion==4){
            lastPane.setVisible(true);
            correctLabel.setText("You got "+Integer.toString(correctAnswers)+" out of 3 correct");
        }
        correctAnswerPane.setVisible(false);
        incorrectAnswerPane.setVisible(false);
    }

    @FXML private void retryTest(){
        testPane.setVisible(true);
        lastPane.setVisible(false);
        currentQustion=0;
        correctAnswers=0;
        questionOneAnswerA.setSelected(false);
        questionOneAnswerB.setSelected(false);
        questionOneAnswerC.setSelected(false);
        questionOneAnswerD.setSelected(false);
        questionTwoAnswerA.setSelected(false);
        questionTwoAnswerB.setSelected(false);
        questionTwoAnswerC.setSelected(false);
        questionTwoAnswerD.setSelected(false);
        questionThreeAnswerA.setSelected(false);
        questionThreeAnswerB.setSelected(false);
        questionThreeAnswerC.setSelected(false);
        questionThreeAnswerD.setSelected(false);
    }
}
