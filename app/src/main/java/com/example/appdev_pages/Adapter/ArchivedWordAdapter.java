package com.example.appdev_pages.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdev_pages.Model.ArchivedWord;
import com.example.appdev_pages.R;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

import java.util.List;

public class ArchivedWordAdapter extends FirestoreRecyclerAdapter<ArchivedWord, ArchivedWordAdapter.ViewHolder> {

    public ArchivedWordAdapter(@NonNull FirestoreRecyclerOptions<ArchivedWord> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull ArchivedWord model) {
        holder.archiveWord.setText(model.getWord());
        holder.definition.setText(model.getDefinition());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent,false);
        return new ViewHolder(view);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView archiveWord, definition;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            archiveWord = itemView.findViewById(R.id.archived_word);
            definition = itemView.findViewById(R.id.definition);
        }
    }

}
