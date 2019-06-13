package skamila.viewmodels;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CounterViewModel mViewModel;
    private Button plus;
    private Button minus;
    private TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        counter = findViewById(R.id.counter);

        mViewModel = ViewModelProviders.of(this).get(CounterViewModel.class);
        setCounter(mViewModel.getCounter());

        plus.setOnClickListener(v -> increaseCounter());
        minus.setOnClickListener(v -> decreaseCounter());
    }

    private void increaseCounter(){
        mViewModel.setCounter(mViewModel.getCounter() + 1);
        counter.setText(mViewModel.getCounter() + "");
    }

    private void decreaseCounter(){
        mViewModel.setCounter(mViewModel.getCounter() - 1);
        counter.setText(mViewModel.getCounter() + "");
    }

    private void setCounter(int number){
        counter.setText(number + "");
    }

}
