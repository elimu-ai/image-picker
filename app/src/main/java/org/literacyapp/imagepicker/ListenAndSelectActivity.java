package org.literacyapp.imagepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.literacyapp.contentprovider.ContentProvider;
import org.literacyapp.contentprovider.model.content.Word;
import org.literacyapp.contentprovider.model.content.multimedia.Audio;
import org.literacyapp.contentprovider.model.content.multimedia.Image;

import java.util.ArrayList;
import java.util.List;

public class ListenAndSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(getClass().getName(), "onCreate");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_listen_and_select);
    }

    @Override
    protected void onStart() {
        Log.i(getClass().getName(), "onStart");
        super.onStart();

        // Fetch 10 most frequent words with matching audio and image
        List<Word> wordsWithMatchingAudioAndImage = new ArrayList<>();

        List<Word> words = ContentProvider.getAllWordsOrderedByFrequency();
        Log.i(getClass().getName(), "words.size(): " + words.size());
        for (Word word : words) {
            Audio matchingAudio = ContentProvider.getAudio(word.getText());
            Image matchingImage = ContentProvider.getImage(word.getText());
            // TODO: add audio as requirement
            if (/*(matchingAudio != null) &&*/ (matchingImage != null)) {
                Log.i(getClass().getName(), "Adding \"" + word.getText() + "\"...");
                wordsWithMatchingAudioAndImage.add(word);
            }
            if (wordsWithMatchingAudioAndImage.size() == 10) {
                break;
            }
        }
        Log.i(getClass().getName(), "wordsWithMatchingAudioAndImage.size(): " + wordsWithMatchingAudioAndImage.size());


    }
}
