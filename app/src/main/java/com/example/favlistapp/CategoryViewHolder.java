package com.example.favlistapp;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CategoryViewHolder extends RecyclerView.ViewHolder {
    private TextView itemName;
    private TextView itemNumber;
    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);

        itemName = itemView.findViewById(R.id.categNameTxtView); // in fragments and, in ViewHolders, we must precede
                                            // our findViewById with view.,.. or in this case, itemView.
                                        // if our View had been called view, we would use view.findView...
        itemNumber = itemView.findViewById(R.id.categNumberTxtView);

    }

    public TextView getItemName() {
        return itemName;
    }

    public TextView getItemNumber() {
        return itemNumber;
    }
}
