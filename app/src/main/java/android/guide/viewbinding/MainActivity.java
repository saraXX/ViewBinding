package android.guide.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.guide.viewbinding.databinding.ActivityMainBinding;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
// TODO 3 : create an instance of binding class.
//        note: there will be a binding class for each layout i create in the project
//        that have the same name plus Binding at the end of the name.
//        i can't see binding classes under package browser but it's exist.
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TODO 4 : comment this section cuz we don't need it anymore.
//        setContentView(R.layout.activity_main);
//        TODO 5 : declare and initializing bind class
        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        root mean the layout
        View view = binding.getRoot();
        setContentView(view);

//        TODO 6 : manage views in java :
        binding.editTextTextPersonName.setText("enter your name");


    }
}