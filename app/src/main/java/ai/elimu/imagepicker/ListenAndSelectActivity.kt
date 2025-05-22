package ai.elimu.imagepicker

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import java.util.regex.Pattern

class ListenAndSelectActivity : AppCompatActivity() {
    //    private List<Word> wordsWithMatchingAudioAndImage;
    //
    //    private List<Word> wordsCorrectlySelected;
    private val progressBar: ProgressBar? = null

    private val alt1CardView: CardView? = null
    private val alt1ImageView: ImageView? = null

    private val alt2CardView: CardView? = null
    private val alt2ImageView: ImageView? = null

    private val defaultBackgroundDrawable: Drawable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(javaClass.getName(), "onCreate")
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_listen_and_select)

        //        wordsCorrectlySelected = new ArrayList<>();
//
//        progressBar = (ProgressBar) findViewById(R.id.listenAndSelectProgressBar);
//
//        alt1CardView = (CardView) findViewById(R.id.alt1CardView);
//        alt1ImageView = (ImageView) findViewById(R.id.alt1ImageView);
//
//        alt2CardView = (CardView) findViewById(R.id.alt2CardView);
//        alt2ImageView = (ImageView) findViewById(R.id.alt2ImageView);
//
//        // Fetch 10 most frequent words with matching audio and image
//        wordsWithMatchingAudioAndImage = new ArrayList<>();
//        List<Word> words = ContentProvider.getAllWords(SpellingConsistency.values());
//        Log.i(getClass().getName(), "words.size(): " + words.size());
//        for (Word word : words) {
//            Audio matchingAudio = ContentProvider.getAudio(word.getText());
//            Image matchingImage = ContentProvider.getImage(word.getText());
//            // TODO: add audio as requirement
//            if (/*(matchingAudio != null) &&*/ (matchingImage != null)) {
//                Log.i(getClass().getName(), "Adding \"" + word.getText() + "\"...");
//                Log.i(getClass().getName(), "matchingImage.getDominantColor(): " + matchingImage.getDominantColor());
//                wordsWithMatchingAudioAndImage.add(word);
//            }
//            if (wordsWithMatchingAudioAndImage.size() == 10) {
//                break;
//            }
//        }
//        Log.i(getClass().getName(), "wordsWithMatchingAudioAndImage.size(): " + wordsWithMatchingAudioAndImage.size());
//
//        defaultBackgroundDrawable = getWindow().getDecorView().getBackground();
    }

    override fun onStart() {
        Log.i(javaClass.getName(), "onStart")
        super.onStart()

        loadNextImage()
    }

    private fun loadNextImage() {
        Log.i(javaClass.getName(), "loadNextImage")

        //        if (wordsCorrectlySelected.size() == wordsWithMatchingAudioAndImage.size()) {
//            // TODO: show congratulations page
//            finish();
//            return;
//        }
//
//        // Reset background color
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
//        getWindow().getDecorView().setBackground(defaultBackgroundDrawable);
//        getWindow().getDecorView().setBackground(new ColorDrawable(Color.parseColor("#EEEEEE")));
//        progressBar.setProgress(wordsCorrectlySelected.size() * 100 / wordsWithMatchingAudioAndImage.size());
//        alt1CardView.setBackgroundColor(Color.parseColor("#FFFFFF"));
//        alt1ImageView.setAlpha(255);
//        alt2CardView.setBackgroundColor(Color.parseColor("#FFFFFF"));
//        alt2ImageView.setAlpha(255);
//
//        final Word alt1Word = wordsWithMatchingAudioAndImage.get(wordsCorrectlySelected.size());
//        Log.i(getClass().getName(), "alt1Word.getText(): " + alt1Word.getText());
//        getSupportActionBar().setTitle(alt1Word.getText());
//
//        final Image alt1Image = ContentProvider.getImage(alt1Word.getText());
//        File alt1ImageFile = MultimediaHelper.getFile(alt1Image);
//        Bitmap alt1ImageBitmap = BitmapFactory.decodeFile(alt1ImageFile.getAbsolutePath());
//        String alt1ImageDominantColor = alt1Image.getDominantColor();
//        final int alt1ColorIdentifier = parseRgbColor(alt1ImageDominantColor);
//
//        List<Word> otherWords = new ArrayList<>(wordsWithMatchingAudioAndImage);
//        otherWords.remove(alt1Word);
//        final Word alt2Word = otherWords.get((int) (Math.random() * otherWords.size()));
//        Log.i(getClass().getName(), "alt2Word.getText(): " + alt2Word.getText());
//
//        Image alt2Image = ContentProvider.getImage(alt2Word.getText());
//        File alt2ImageFile = MultimediaHelper.getFile(alt2Image);
//        Bitmap alt2ImageBitmap = BitmapFactory.decodeFile(alt2ImageFile.getAbsolutePath());
//        String alt2ImageDominantColor = alt2Image.getDominantColor();
//        final int alt2ColorIdentifier = parseRgbColor(alt2ImageDominantColor);
//
//        // TODO: play instruction audio
//
//        playWord(alt1Word);
//
//        boolean isAlt1Correct = (Math.random() > .5);
//        if (isAlt1Correct) {
//            alt1ImageView.setImageBitmap(alt1ImageBitmap);
//            alt2ImageView.setImageBitmap(alt2ImageBitmap);
//
//            alt1CardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Log.i(getClass().getName(), "alt1CardView onClick");
//
//                    MediaPlayerHelper.play(getApplicationContext(), R.raw.alternative_correct);
//
//                    wordsCorrectlySelected.add(alt1Word);
//                    progressBar.setProgress(wordsCorrectlySelected.size() * 100 / wordsWithMatchingAudioAndImage.size());
//
//                    getWindow().getDecorView().setBackgroundColor(alt1ColorIdentifier);
//                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(alt1ColorIdentifier));
//
//                    alt1CardView.setOnClickListener(null);
//
//                    alt2CardView.setOnClickListener(null);
//                    alt2CardView.setBackgroundColor(Color.parseColor("#00FFFFFF")); // 100% transparent
//                    alt2ImageView.setAlpha(128); // 50% opaque
//
//                    alt1ImageView.postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            loadNextImage();
//                        }
//                    }, 2000);
//                }
//            });
//
//            alt2CardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Log.i(getClass().getName(), "alt2CardView onClick");
//
//                    MediaPlayerHelper.play(getApplicationContext(), R.raw.alternative_incorrect);
//
//                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_shake);
//                    alt2CardView.startAnimation(animation);
//                }
//            });
//        } else {
//            alt1ImageView.setImageBitmap(alt2ImageBitmap);
//            alt2ImageView.setImageBitmap(alt1ImageBitmap);
//
//            alt2CardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Log.i(getClass().getName(), "alt2CardView onClick");
//
//                    MediaPlayerHelper.play(getApplicationContext(), R.raw.alternative_correct);
//
//                    wordsCorrectlySelected.add(alt2Word);
//                    progressBar.setProgress(wordsCorrectlySelected.size() * 100 / wordsWithMatchingAudioAndImage.size());
//
//                    getWindow().getDecorView().setBackgroundColor(alt1ColorIdentifier);
//                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(alt1ColorIdentifier));
//
//                    alt1CardView.setOnClickListener(null);
//
//                    alt2CardView.setOnClickListener(null);
//                    alt1CardView.setBackgroundColor(Color.parseColor("#00FFFFFF")); // 100% transparent
//                    alt1ImageView.setAlpha(128); // 50% opaque
//
//                    alt1ImageView.postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            loadNextImage();
//                        }
//                    }, 2000);
//                }
//            });
//
//            alt1CardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Log.i(getClass().getName(), "alt1CardView onClick");
//
//                    MediaPlayerHelper.play(getApplicationContext(), R.raw.alternative_incorrect);
//
//                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_shake);
//                    alt1CardView.startAnimation(animation);
//                }
//            });
//        }
    }

    private fun parseRgbColor(input: String): Int {
        val pattern = Pattern.compile("rgb *\\( *([0-9]+), *([0-9]+), *([0-9]+) *\\)")
        val matcher = pattern.matcher(input)
        if (matcher.matches()) {
            val rgbRed = matcher.group(1).toInt()
            val rgbGreen = matcher.group(2).toInt()
            val rgbBlue = matcher.group(3).toInt()
            val colorIdentifier = Color.rgb(rgbRed, rgbGreen, rgbBlue)
            return colorIdentifier
        } else {
            return -1
        }
    } //    private void playWord(Word word) {
    //        Log.i(getClass().getName(), "playWord");
    //
    //        // Look up corresponding Audio recording
    //        Log.d(getClass().getName(), "Looking up \"" + word.getText() + "\"");
    //        Audio audio = ContentProvider.getAudio(word.getText());
    //        Log.i(getClass().getName(), "audio: " + audio);
    //        if (audio != null) {
    //            // Play audio
    //            File audioFile = MultimediaHelper.getFile(audio);
    //            Uri uri = Uri.parse(audioFile.getAbsolutePath());
    //            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
    //            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
    //                @Override
    //                public void onCompletion(MediaPlayer mediaPlayer) {
    //                    Log.i(getClass().getName(), "onCompletion");
    //                    mediaPlayer.release();
    //                }
    //            });
    //            mediaPlayer.start();
    //        } else {
    //            // Audio recording not found. Fall-back to TTS.
    //            TtsHelper.speak(getApplicationContext(), word.getText());
    //        }
    //    }
}
