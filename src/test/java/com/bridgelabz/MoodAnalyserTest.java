package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    static MoodAnalyser moodAnalyser;

    @BeforeAll
    public static void init(){
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    public void shouldReturnSadMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String result =  moodAnalyser.analyseMood();
        Assertions.assertSame("SAD", result);

    }

    @Test
    public void shouldReturnHappyMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String result =  moodAnalyser.analyseMood();
        Assertions.assertSame("HAPPY", result);
    }

    @Test
    public void givenNullValueShouldHandleException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood();
        Assertions.assertSame("HAPPY", result);
    }
}
