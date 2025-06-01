package com.devricks.pomodoro.technique.util;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech {
    private static final String VOICE_NAME = "kevin16";

    public static void speak(String text) {
        try {
            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
            Voice voice = VoiceManager.getInstance().getVoice(VOICE_NAME);

            if (voice != null) {
                voice.allocate();
                voice.speak(text);
                voice.deallocate();
            } else {
                System.out.println("Voice not found.");
            }
        } catch (Exception e) {
            System.err.println("An error occurred while trying to speak: " + e.getMessage());
        }
    }
}
