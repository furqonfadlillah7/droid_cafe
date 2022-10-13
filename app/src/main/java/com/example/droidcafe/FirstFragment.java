package com.example.droidcafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.droidcafe.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.donut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.donut_order_message));
            }
        });

        view.findViewById(R.id.ice_cream).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.ice_cream_order_message));
            }
        });

        view.findViewById(R.id.froyo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.froyo_order_message));
            }
        });


    }

    public void displayToast(String message) {
        Toast.makeText(getActivity(), message,
                Toast.LENGTH_SHORT).show();
    }
}
