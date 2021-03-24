package RV;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android2_lesson1.R;


public class HomeFragmentViewHolder extends RecyclerView.ViewHolder {
TextView simpleText;

    public HomeFragmentViewHolder(@NonNull View itemView) {
        super(itemView);

        simpleText = itemView.findViewById(R.id.tv_item1);
    }

    public void onBind (String data){
        simpleText.setText(data);
    }
}
