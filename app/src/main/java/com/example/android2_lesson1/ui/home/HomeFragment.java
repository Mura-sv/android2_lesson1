package com.example.android2_lesson1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android2_lesson1.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import RV.HomeFragmentAdapter;

public class HomeFragment extends Fragment {

    private FloatingActionButton fab;
    private NavController navController;
    HomeFragmentAdapter adapter;
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setupListeners();
        adapter = new HomeFragmentAdapter();
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);

    }

    private void initView(View view) {
        fab = view.findViewById(R.id.fab);
        recyclerView = view.findViewById(R.id.rv);
    }

    private void setupListeners() {

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_navigation_home_to_formFragment);
            }
        });
    }
}