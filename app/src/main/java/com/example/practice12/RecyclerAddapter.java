package com.example.practice12;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerAddapter extends RecyclerView.Adapter<RecyclerAddapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<State> states;

    public RecyclerAddapter(Context context, List<State> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        State state = states.get(position);
        holder.flagView.setImageResource(state.getFlagResource());
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getCapital());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(inflater.getContext(), DetailActivity.class);
            intent.putExtra("name", state.getName());
            intent.putExtra("capital", state.getCapital());
            intent.putExtra("flagResource", state.getFlagResource());
            inflater.getContext().startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView;
        final TextView capitalView;

        public ViewHolder(@NonNull View view) {
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.capital);
        }
    }
}
