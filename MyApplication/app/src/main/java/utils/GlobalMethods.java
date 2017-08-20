package utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by andresaleman on 8/19/17.
 */

public class GlobalMethods
{
    public static String loadStorage(Context context, Activity activity, String type)
    {
        String session="";
        try
        {
            SharedPreferences sharedPreferences = activity.getBaseContext().getSharedPreferences(type,activity.getBaseContext().MODE_PRIVATE);
            String valueDate = "";
            session = sharedPreferences.getString(type,valueDate);
        }
        catch (Exception ex)
        {
            ex.getStackTrace();
        }

        return session;
    }

    public static void saveStorage(Activity activity, String photo, String type)
    {
        try
        {
            SharedPreferences sharedPref = activity.getBaseContext().getSharedPreferences(type,activity.getBaseContext().MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString(type, photo);
            editor.commit();
        }
        catch (Exception ex)
        {
            ex.getStackTrace();
        }
    }
}
