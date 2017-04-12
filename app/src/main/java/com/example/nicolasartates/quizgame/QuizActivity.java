package com.example.nicolasartates.quizgame;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static com.example.nicolasartates.quizgame.R.id.imageView_question;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener
{
    Boolean scoreb = false;
    Button button_answer1;
    Button button_answer2;
    Button button_answer3;
    Button button_answer4;

    TextView textView_Score;

    ImageView imageView_question;

    private String answers;
    private int Score = 0;
    private int questionslegnth = 10;
    int questionsanswered=0;

    String Correctanswer;
    Random r;

    private Animation shakeAnimation;

    int a=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        button_answer1 = (Button) findViewById(R.id.button_answer1);
        button_answer2 = (Button) findViewById(R.id.button_answer2);
        button_answer3 = (Button) findViewById(R.id.button_answer3);
        button_answer4 = (Button) findViewById(R.id.button_answer4);

        textView_Score = (TextView) findViewById(R.id.textView_Score);

        imageView_question = (ImageView) findViewById(R.id.imageView_question);

        button_answer1.setOnClickListener(this);
        button_answer2.setOnClickListener(this);
        button_answer3.setOnClickListener(this);
        button_answer4.setOnClickListener(this);

        //random number stuff
        int min = 1;
        int max = 5;
        final Random r = new Random();
        int number = r.nextInt(max - min + 1)+ min;
        int mystring = number;
        getQuestion(a);


        // load the shake animation that's used for incorrect answers
        shakeAnimation = AnimationUtils.loadAnimation(this,
                R.anim.incorrect_shake);
        shakeAnimation.setRepeatCount(3); // animation repeats 3 times

        //need to add the rest of the buttons
        button_answer1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(button_answer1.getText() == Correctanswer)
                {
                    if (scoreb == false)
                    {Score++;
                    textView_Score.setText("Score: " + Score);}
                    else
                    {}
                    //change int
                    questionsanswered++;
                    a++;

                    if (a == 10 )
                        ScoreAlert();
                    else getQuestion(a);
                }
                //else Add wrong toast also set text to blank
                else
                {
                    button_answer1.setText("");
                    wrongtoast();
                    button_answer1.startAnimation(shakeAnimation);
                    scoreb= true;


                }
            }
        });

        button_answer2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(button_answer2.getText() == Correctanswer)
                {
                    if (scoreb == false)
                    {Score++;
                    textView_Score.setText("Score: " + Score);}
                    else {}
                    questionsanswered++;
                    a++;
                    if (a == 10)
                        ScoreAlert();
                    else getQuestion(a);
                }
                //else Add wrong toast also set text to blank
                else
                {
                    button_answer2.setText("");
                    wrongtoast();
                    button_answer2.startAnimation(shakeAnimation);
                    scoreb= true;


                }
            }
        });

        button_answer3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(button_answer3.getText() == Correctanswer)
                {
                    if (scoreb == false)
                    {Score++;
                    textView_Score.setText("Score: " + Score);}
                    else {}
                    questionsanswered++;
                    a++;
                    if (a == 10)
                        ScoreAlert();
                    else getQuestion(a);
                }
                //else Add wrong toast also set text to blank
                else
                {
                    button_answer3.setText("");
                    wrongtoast();
                    button_answer3.startAnimation(shakeAnimation);
                    scoreb= true;


                }
            }
        });

        button_answer4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(button_answer4.getText() == Correctanswer)
                {
                    if (scoreb == false)
                    {Score++;
                    textView_Score.setText("Score: " + Score);}
                    else{}
                    questionsanswered++;
                    a++;
                    if (a == 10)
                        ScoreAlert();
                    else getQuestion(a);
                }
                //else Add wrong toast also set text to blank
                else
                {
                    button_answer4.setText("");
                    wrongtoast();
                    button_answer4.startAnimation(shakeAnimation);
                    scoreb= true;



                }
            }
        });




    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button_answer1:

                break;

            case R.id.button_answer2:

                break;

            case R.id.button_answer3:

                break;

            case R.id.button_answer4:

                break;

        }

    }
    //need to finish the rest of the questions
    public void getQuestion(int a)
    {
        if (a == 1)
        {
            imageView_question.setImageResource(R.drawable.ant_eye_johnson);

            button_answer1.setText("Beth");
            button_answer2.setText("Morty");
            button_answer3.setText("Rick" );
            button_answer4.setText("Ant Eyes Johnson");

            Correctanswer = "Ant Eyes Johnson";
            scoreb = false;
        }
        else if (a == 2)
        {
            imageView_question.setImageResource(R.drawable.beth);

            button_answer1.setText("Squancy");
            button_answer2.setText("Morty");
            button_answer3.setText("Beth" );
            button_answer4.setText("Ant Eyes Johnson");

            Correctanswer = "Beth";
            scoreb = false;
        }
        else if (a == 3)
        {
            imageView_question.setImageResource(R.drawable.birdperson);

            button_answer1.setText("Bird Person");
            button_answer2.setText("Beth");
            button_answer3.setText("Tammy" );
            button_answer4.setText("Mr.Meseeks");

            Correctanswer = "Bird Person";
            scoreb = false;
        }
        else if (a == 4)
        {
            imageView_question.setImageResource(R.drawable.jerry); //"Tammy", "Jerry", "Beth", "Morty"

            button_answer1.setText("Tammy");
            button_answer2.setText("Jerry");
            button_answer3.setText("Beth" );
            button_answer4.setText("Morty");

            Correctanswer = "Jerry";
            scoreb = false;
        }
        else if (a == 5)
        {
            imageView_question.setImageResource(R.drawable.linkler); //"Beth", "Linkler", "Rick", "Ant Eyes Johnson"

            button_answer1.setText("Beth");
            button_answer2.setText("Linkler");
            button_answer3.setText("Rick" );
            button_answer4.setText("Ant Eyes Johnson");

            Correctanswer = "Linkler";
            scoreb = false;
        }
        if (a == 6) {
            imageView_question.setImageResource(R.drawable.morty); //{"Beth", "Morty", "Rick", "Ant Eyes Johnson"}

            button_answer1.setText("Beth");
            button_answer2.setText("Morty");
            button_answer3.setText("Rick");
            button_answer4.setText("Ant Eyes Johnson");

            Correctanswer = "Morty";
            scoreb = false;
        }
        if (a == 7) {
            imageView_question.setImageResource(R.drawable.mrmeeseeks); //"Hammer Morty", "Morty", "Evil Morty", "Mr.Meseeks"

            button_answer1.setText("Hammer Morty");
            button_answer2.setText("Morty");
            button_answer3.setText("Evil Morty");
            button_answer4.setText( "Mr.Meseeks");

            Correctanswer = "Mr.Meseeks";
            scoreb = false;
        }
        if (a == 8) {
            imageView_question.setImageResource(R.drawable.mrpoopybutthole); //"Hammer Morty", "Morty", "Evil Morty", "Mr.Meseeks"

            button_answer1.setText("Morty");
            button_answer2.setText("Summer");
            button_answer3.setText("Rick");
            button_answer4.setText( "Mr.Poopybutthole");

            Correctanswer = "Mr.Poopybutthole";
            scoreb = false;
        }
        if (a == 9) {
            imageView_question.setImageResource(R.drawable.rick); //"Hammer Morty", "Morty", "Evil Morty", "Mr.Meseeks"

            button_answer1.setText("Snuffles");
            button_answer2.setText("Beth");
            button_answer3.setText("Rick");
            button_answer4.setText( "Mr.Meseeks");

            Correctanswer = "Rick";
            scoreb = false;
        }
        if (a == 10) {
            imageView_question.setImageResource(R.drawable.squanchy); //"Hammer Morty", "Morty", "Evil Morty", "Mr.Meseeks"

            button_answer1.setText("Squanchy");
            button_answer2.setText("Rick");
            button_answer3.setText("Morty");
            button_answer4.setText( "Beth");

            Correctanswer = "Squanchy";
            scoreb = false;
        }
        if (a == 11) {
            imageView_question.setImageResource(R.drawable.tammy); //"Hammer Morty", "Morty", "Evil Morty", "Mr.Meseeks"

            button_answer1.setText("Tammy");
            button_answer2.setText("Mr.meeseeks");
            button_answer3.setText("Snuffles");
            button_answer4.setText( "Bird Person");

            Correctanswer = "Tammy";
            scoreb = false;
        }

    }

    private void ScoreAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);
        alertDialogBuilder.setMessage("Your Score is " + Score +". You got " + (Score*10)+ "% of the questions correct!" )
        .setCancelable(false)
        .setPositiveButton("Exit",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));

                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    public void wrongtoast()
    {
        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
    }

}
