package skamila.viewmodels;

import android.arch.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
