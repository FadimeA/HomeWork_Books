package com.example.homework_books;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BooksAdapter extends RecyclerView.Adapter<BooksViewHolder> {
    private final LayoutInflater inflater;
    private final ArrayList<Book> books;

    public BooksAdapter(LayoutInflater inflater, ArrayList<Book> books) {
        this.inflater = inflater;
        this.books = books;
    }

    @NonNull
    @Override
    public BooksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_books,parent,false);
        return new BooksViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull BooksViewHolder holder, int position) {
        Book book = books.get(position);
        holder.onBind(book);
    }



    @Override
    public int getItemCount() {
        return books.size();
    }
}
