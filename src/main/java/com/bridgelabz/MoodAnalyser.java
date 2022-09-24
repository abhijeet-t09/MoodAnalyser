package com.bridgelabz;

public class MoodAnalyser {

    String analyseMood (String message){
        if(message.toLowerCase().contains("sad"))
            return "SAD";
        else if (message.toLowerCase().contains("happy"))
            return "HAPPY";
        return message;
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String happyMood = moodAnalyser.analyseMood("I am in a Happy Mood");
        System.out.println("Mood is " + happyMood);
        String sadMood = moodAnalyser.analyseMood("I am in a Sad Mood");
        System.out.println("Mood is " + sadMood);
    }
}
