package com.example.courseschedule;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.widget.CardView;

import java.util.ArrayList;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {
    private ArrayList<Schedule> mSchedules;
    private RecyclerViewClickListener mListener;

    public ScheduleAdapter(ArrayList<Schedule> schedules, RecyclerViewClickListener listener) {
        mSchedules = schedules;
        mListener = listener;
    }

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    public static class ScheduleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView weekNo, date;
        private RecyclerViewClickListener mListener;

        public ScheduleViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            weekNo = v.findViewById(R.id.tvWeekNo);
            date = v.findViewById(R.id.tvDate);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }

    @Override
    public ScheduleAdapter.ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_list_row, parent, false);
        return new ScheduleViewHolder(v, mListener);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ScheduleViewHolder holder, int position) {
        Schedule schedule = mSchedules.get(position);
        holder.weekNo.setText(schedule.getWeekNo());
        holder.date.setText(schedule.getDate());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mSchedules.size();
    }

}
