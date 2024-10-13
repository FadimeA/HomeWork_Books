package com.example.homework_books;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BooksViewHolder extends RecyclerView.ViewHolder {
    private ImageView bookImage;
    private TextView tvName, tvAuthor,tvPrice;

    public BooksViewHolder(@NonNull View itemView) {
        super(itemView);
        bookImage = itemView.findViewById(R.id.iv_book);
        tvName= itemView.findViewById(R.id.tv_name);
        tvAuthor = itemView.findViewById(R.id.tv_author);
        tvPrice= itemView.findViewById(R.id.tv_price);
    }


    public void onBind(Book book) {
        Glide.with(bookImage.getContext()).load(book.getImage()).into(bookImage);
        tvName.setText(book.getName());
        tvAuthor.setText(book.getAuthor());
        tvPrice.setText(book.getPrice());
    }
}
