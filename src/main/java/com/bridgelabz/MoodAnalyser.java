package com.bridgelabz;

public class MoodAnalyser {
    String message;
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodException {
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            throw new MoodException(MoodException.ExceptionType.NULL, "Message is Null");
        }
    }

//    String analyseMood (){
//
//        try {
//            if (message.toLowerCase().contains("sad"))
//                return "SAD";
//            else
//                return "HAPPY";
//        }
//        catch (Exception e){
//            return "HAPPY";
//        }
//
//        if(message.toLowerCase().contains("sad"))
//            return "SAD";
//        else if (message.toLowerCase().contains("happy"))
//            return "HAPPY";
//        return message;
//    }
//
//    public static void main(String[] args) {
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String happyMood = moodAnalyser.analyseMood();
//        System.out.println("Mood is " + happyMood);
//
//        String sadMood = moodAnalyser.analyseMood();
//        System.out.println("Mood is " + sadMood);
//    }
}
