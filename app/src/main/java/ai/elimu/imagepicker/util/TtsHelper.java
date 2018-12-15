package ai.elimu.imagepicker.util;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.util.Log;

import ai.elimu.imagepicker.ImagePickerApplication;

public class TtsHelper {

    public static void speak(Context context, String text) {
        Log.i(TtsHelper.class.getName(), "speak");

        Log.i(TtsHelper.class.getName(), "text: " + text);

        ImagePickerApplication application = (ImagePickerApplication) context;
        TextToSpeech tts = application.getTts();
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
    }
}
