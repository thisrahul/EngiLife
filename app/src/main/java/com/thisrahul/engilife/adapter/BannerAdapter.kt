package com.thisrahul.engilife.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thisrahul.engilife.databinding.BannerItemBinding
import com.thisrahul.engilife.databinding.LocationFirstItemBinding
import java.lang.Exception

class BannerAdapter(val list : ArrayList<Int>) : RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {

    class BannerViewHolder(val binding: BannerItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
       val binding = BannerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BannerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
       val img = list[position]

        holder.binding.imgBanner.setImageResource(img)

        holder.itemView.setOnClickListener{

        }
    }

    override fun getItemCount(): Int {
        try {
            return list.size;

        }catch (e : Exception){
            e.printStackTrace()
        }
        return 0;
    }
}