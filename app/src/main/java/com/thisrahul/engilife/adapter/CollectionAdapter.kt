package com.thisrahul.engilife.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thisrahul.engilife.R
import com.thisrahul.engilife.databinding.CollectionItemBinding
import com.thisrahul.engilife.model.Collection

class CollectionAdapter(val context: Context, val list: ArrayList<Collection>) : RecyclerView.Adapter<CollectionAdapter.CollectionViewHolder>() {

    class CollectionViewHolder(val binding: CollectionItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val binding = CollectionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CollectionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        val item = list.get(position)

        holder.binding.txtTitle.text = item.title
        holder.binding.txtSubTitle.text = item.subTitle
        holder.binding.txtRating.text = item.rating
        if (item.isTagShow) {
            holder.binding.txtTag.text = item.tag
            if (item.tagBackgroundColor.equals("tag")){
                holder.binding.txtTag.setBackgroundResource(R.drawable.tag1)
            }else   if (item.tagBackgroundColor.equals("tag1")){
                holder.binding.txtTag.setBackgroundResource(R.drawable.tag)
            }else   if (item.tagBackgroundColor.equals("tag")){
                holder.binding.txtTag.setBackgroundResource(R.drawable.tag2)
            }
        } else {
            holder.binding.txtTag.visibility = View.GONE
        }
        holder.binding.imgCollection.setImageResource(item.img)

    }

    override fun getItemCount(): Int {
        try {
            return list.size
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return 0
    }
}