package RV;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android2_lesson1.R;

import java.util.ArrayList;

public class HomeFragmentAdapter extends RecyclerView.Adapter<HomeFragmentViewHolder> {

    ArrayList<String> list;

    public HomeFragmentAdapter() {
        list = new ArrayList<>();
        list.add("Рамазан");
        list.add("Нурбек");
        list.add("Нуракбар");
        list.add("Мурас");
        list.add("Илим");
        list.add("Бекмурат");
        list.add("Эрмек");
        list.add("Нуркыз");
        list.add("Анарбек");
        list.add("Айдана");
        list.add("Кайрат");
        list.add("Нурболот");
        list.add("Али");
        list.add("Эламан");
        list.add("Нурэл");
    }

    @NonNull
    @Override
    public HomeFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        return new HomeFragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeFragmentViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
