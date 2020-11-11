package com.example.favlistapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.favlistapp.CategoryViewHolder;
import com.google.android.material.tabs.TabLayout;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {
    // the following array will, ultimately, populate the textView "nameTxtView" and the index
    // value for each item +1 will populate the textView "numberTxtView"
    String [] categories = {"hobbies", "Sports", "games", "electronic gadgets", "foods", "countries" };

    @NonNull
    @Override
    // the following is an auto generated method that accesses the CategoryViewHolder constructor in that class,
    // CategoryViewHolder.java
    // by gaining access to that class we can "adapt" the viewHolder layout content into the parent layout
    // using the objects defined/created in the CategoryViewHolder java coding
    // the method assigns the parent layout as the viewGroup to which the view, "category_view_holder"
    // will be added.  Android stores views as integers in the "R" resources class so a return
    // of type "integer" is expected
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mlayoutInflater = LayoutInflater.from(parent.getContext());
        // the above line, directs the inflater, that inflates the view holder layout to consider the
        // context (style and layout) of the parent layout.  The inflater is named mlayoutInflator
        View mview = mlayoutInflater.inflate(R.layout.category_view_holder, parent, false);
        // the above, creates an instance of the viewType View and gives it a value equal to
        // the "category_view_holder" layout. It is inflated to the parent (inserted into that parent
        // layout and we have named it mview
        Log.i("myTag", "the value of mview = "+ mview); // sends the integer value for mview to the logcat
        return new CategoryViewHolder(mview);
        // when mview was created in the prior line of code, an integer was assigned to it that
        // identifies it within the "R" resources class.  Returning mview to the method, returns
        // this integer and satisfies the parameter, int viewType
    }
    @Override
    // this was also auto-implemented after adding <CategoryViewHolder> to line 16, above
    // not a constructor because it has a void return type.  It is a method.
    // <CategoryViewHolder> is the class that extends ViewHolder and that is used by the adapter
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        holder.getItemNumber().setText(Integer.toString(position+1));
        holder.getItemName().setText(categories[position]);
        Log.i("myTag", "position has a value = "+position);
    }
    // another, auto-implemented method, after declaring the <CategoryViewHolder> in line 16
    @Override
    public int getItemCount() { // not a constructor because it has return type of int
        return categories.length;
    }
}
