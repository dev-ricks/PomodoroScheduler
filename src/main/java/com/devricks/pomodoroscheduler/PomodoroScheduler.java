package com.devricks.pomodoroscheduler;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import java.util.Timer;
import java.util.TimerTask;

public class PomodoroScheduler {

    private static final int WORK_MINUTES = 25;
    private static final int BREAK_MINUTES = 5;
    private static final int MINUTE_MS = 60 * 1000;

    public static void main(String[] args) {
        Timer timer = new Timer();
        System.out.println("Pomodoro Timer Started.");

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    System.out.println("Work for 25 minutes.");
                    speak("Start working for 25 minutes, NOW!");

                    for (int i = WORK_MINUTES; i > 0; i--) {
                        System.out.println(i + " minute(s) of work left...");
                        Thread.sleep(MINUTE_MS);
                    }

                    // Speak break warning
                    speak("Get up and take a break!");

                    System.out.println("Take a 5-minute break.");
                    Thread.sleep(BREAK_MINUTES * MINUTE_MS);

                    System.out.println("Cycle complete. Starting next round...");
                } catch (InterruptedException e) {
                    System.err.println("Timer interrupted: " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("An error occurred: " + e.getMessage());
                }
            }
        }, 0, (WORK_MINUTES + BREAK_MINUTES) * MINUTE_MS);
    }

    private static void speak(String text) {
        System.setProperty("freetts.voices",
                           "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        if (voice != null) {
            voice.allocate();
            voice.speak(text);
            voice.deallocate();
        } else {
            System.out.println("Voice not found.");
        }
    }
}
