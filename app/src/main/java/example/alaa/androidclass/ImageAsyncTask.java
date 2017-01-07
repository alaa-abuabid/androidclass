package example.alaa.androidclass;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by Alaa ab on 1/6/2017.
 */

public class ImageAsyncTask extends AsyncTask<String,Integer,Bitmap>
{
    ImageView imageView;
    private Bitmap bitmap = null ;
    ImageAsyncTask(ImageView imageView)
    {
        this.imageView=imageView;
    }
    @Override
    protected Bitmap doInBackground(String... params)
    {
        try {
            URL url =new URL(params[0]);
            bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap)
    {
         imageView.setImageBitmap(bitmap);
    }
}