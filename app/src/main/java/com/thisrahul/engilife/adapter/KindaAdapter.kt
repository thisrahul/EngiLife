package com.thisrahul.engilife.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thisrahul.engilife.databinding.CollectionItemBinding
import com.thisrahul.engilife.databinding.KindaBinding
import com.thisrahul.engilife.model.Collection
import com.thisrahul.engilife.model.Kinda
import java.lang.Exception

class KindaAdapter (val context: Context, val list: ArrayList<Kinda>) : RecyclerView.Adapter<KindaAdapter.KindaViewHolder>() {

    class KindaViewHolder(val binding: KindaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KindaViewHolder {
        val binding = KindaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return KindaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KindaViewHolder, position: Int) {
       val kinda = list[position]

        holder.binding.imgKinda.setImageResource(kinda.img)

        if (kinda.isTagShow){
            holder.binding.txtTag.text = kinda.tag
        }else{
            holder.binding.txtTag.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        try {
            return list.size
        }catch (e:Exception){
            e.printStackTrace()
        }
        return 0;
    }
}