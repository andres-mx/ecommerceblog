package fragments;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidit123.androiddelivery.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import models.Profile;
import utils.GlobalMethods;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {
    ImageView imageViewProfile;
    TextView textViewUserName, textViewEmail;
    String profileString;
    Profile profile;
    Gson gson;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        textViewUserName = (TextView) root.findViewById(R.id.textViewUserName);
        textViewEmail = (TextView) root.findViewById(R.id.textViewEmail);
        imageViewProfile = (ImageView) root.findViewById(R.id.imageViewPhotoProfile);
        load();
        return root;
    }

    private void load()
    {
        try {
            profile = new Profile();
            gson = new GsonBuilder().create();
            profileString = GlobalMethods.loadStorage(getActivity(), getActivity(), "profile");
            profile = gson.fromJson(profileString, Profile.class);
            textViewUserName.setText(profile.getUser_name().toString());
            textViewEmail.setText(profile.getEmail().toString());
            Picasso.with(getActivity()).load(profile.getUrl_image().toString()).into(imageViewProfile,
                    new Callback() {
                        @Override
                        public void onSuccess() {

                        }

                        @Override
                        public void onError() {

                        }
                    });
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}






