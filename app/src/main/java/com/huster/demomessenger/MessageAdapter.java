package com.huster.demomessenger;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {

    public MessageAdapter(List<Message> dataSet) {
        this.dataSet = dataSet;
    }

    private List<Message> dataSet;

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_message, parent, false);
        MessageViewHolder viewHolder = new MessageViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        Message item = dataSet.get(position);

        TextView tvName = holder.itemView.findViewById(R.id.tvName);
        TextView tvMsg = holder.itemView.findViewById(R.id.tvMsg);

//        holder.itemView.setOnClickListener();

        tvName.setText(item.getName());
        tvMsg.setText(item.getMsg());
    }

    @Override
    public int getItemCount() {
        if(dataSet == null) return 0;
        return dataSet.size();
    }
}

class MessageViewHolder extends RecyclerView.ViewHolder{
    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
