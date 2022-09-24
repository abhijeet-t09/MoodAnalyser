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
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("SAD", result);
        }
        catch(MoodException e){
            Assertions.assertEquals(MoodException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void shouldReturnHappyMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("HAPPY", result);
        }
        catch(MoodException e){
            Assertions.assertEquals(MoodException.ExceptionType.NULL, e.type);

        }
    }
    @Test
    public void ShouldHandleNullMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("HAPPY", result);
        }
        catch(MoodException e){
            Assertions.assertEquals("Message is Null", e.getMessage());
        }

    }

//    @Test
//    public void shouldReturnSadMood(){
//        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
//        String result =  moodAnalyser.analyseMood();
//        Assertions.assertSame("SAD", result);
//
//    }
//
//    @Test
//    public void shouldReturnHappyMood(){
//        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
//        String result =  moodAnalyser.analyseMood();
//        Assertions.assertSame("HAPPY", result);
//    }
//
//    @Test
//    public void givenNullValueShouldHandleException(){
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String result = moodAnalyser.analyseMood();
//        Assertions.assertSame("HAPPY", result);
//    }
}
