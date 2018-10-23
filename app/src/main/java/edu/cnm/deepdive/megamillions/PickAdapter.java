package edu.cnm.deepdive.megamillions;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;


public class PickAdapter extends RecyclerView.Adapter<PickAdapter.Holder> {

  private AppCompatActivity context;
  private List<int[]> picks;

  public PickAdapter(AppCompatActivity context, List<int[]> picks) {
    this.context = context;
    this.picks = picks;

  }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
      View view = LayoutInflater.from(context)
          .inflate(android.R.layout.simple_list_item_1,viewGroup, false);
      return new Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

    }

    @Override
    public int getItemCount() {
      return 0;
    }


    public class Holder extends RecyclerView.ViewHolder {

      public Holder(@NonNull View view) {
        super(view);
        //Assume that view is a TextView
      }



    }


  }
