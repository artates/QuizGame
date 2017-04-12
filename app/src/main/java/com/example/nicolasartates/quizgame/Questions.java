package com.example.nicolasartates.quizgame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

import static com.example.nicolasartates.quizgame.R.id.imageView_question;

/**
 * Created by Nicolas Artates on 4/9/2017.
 */

public class Questions
{
    //questions are pics
    //1 ant eye
    //2 beth
    //3 bird person
    //4 jerry
    //5 linkler
    //6 morty
    // 7mrmeeseeks

    private String choices[] [] =
            {
                    {"Beth", "Morty", "Rick", "Ant Eyes Johnson"},
                    {"Squancy", "Morty", "Beth", "Ant Eyes Johnson"},
                    {"Bird Person", "Beth", "Tammy", "Mr.Meseeks"},
                    {"Tammy", "Jerry", "Beth", "Morty"},
                    {"Beth", "Linkler", "Rick", "Ant Eyes Johnson"},
                    {"Beth", "Morty", "Rick", "Ant Eyes Johnson"},
                    {"Hammer Morty", "Morty", "Evil Morty", "Mr.Meseeks"},


            };

    private String Correctanswers[] =
            {"Ant Eyes Johnson", "Beth", "Bird Person","Jerry","Linkler", "Morty","Mr.Meseeks"

            };
    public String getChoice1(int a)
    {
        String choice = choices[a][0];
        return choice;
    }
    public String getChoice2(int a)
    {
        String choice = choices[a][1];
        return choice;
    }
    public String getChoice3(int a)
    {
        String choice = choices[a][2];
        return choice;
    }
    public String getChoice4(int a)
    {
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a)
    {
        String correct_answer = Correctanswers[a];//maybe something wrong with the int passes (-1)
        return correct_answer;
    }





}
