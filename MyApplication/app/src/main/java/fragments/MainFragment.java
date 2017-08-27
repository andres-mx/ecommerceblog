package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.androidit123.androiddelivery.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    Spinner spinnerAddres;
    Button buttonAddAddress, buttonContinue;
    TextView textViewDateRetirement, textViewHourRetirement, textViewDateDelivery, textViewHourDelivery;
    ImageView imageViewDateRetirement, imageViewHourRetirement, imageViewDateDelivery, imageViewHourDelivery;
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        spinnerAddres = (Spinner) view.findViewById(R.id.spinnerAddress);
        buttonAddAddress = (Button) view.findViewById(R.id.buttonAddAddress);
        buttonContinue = (Button) view.findViewById(R.id.buttonContinue);
        textViewDateRetirement = (TextView) view.findViewById(R.id.textViewDateRetirement);
        textViewHourRetirement = (TextView) view.findViewById(R.id.textViewHourRetirement);
        textViewDateDelivery = (TextView) view.findViewById(R.id.textViewDateDelivery);
        textViewHourDelivery = (TextView) view.findViewById(R.id.textViewHourDelivery);
        imageViewDateRetirement = (ImageView) view.findViewById(R.id.imageViewDateRetirement);
        imageViewHourRetirement = (ImageView) view.findViewById(R.id.imageViewHourRetirement);
        imageViewDateDelivery = (ImageView) view.findViewById(R.id.imageViewDateDelivery);
        imageViewHourDelivery = (ImageView) view.findViewById(R.id.imageViewHourDelivery);
        // Inflate the layout for this fragment
        return view;
    }

}
