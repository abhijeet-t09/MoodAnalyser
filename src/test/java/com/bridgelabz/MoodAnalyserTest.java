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
        String result =  moodAnalyser.analyseMood("I am in a Sad Mood");
        Assertions.assertSame("SAD", result);

    }

    @Test
    public void shouldReturnHappyMood(){
        String result =  moodAnalyser.analyseMood("I am in a Happy Mood");
        Assertions.assertSame("HAPPY", result);
    }
}
