package com.thisrahul.engilife.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.thisrahul.engilife.R
import com.thisrahul.engilife.databinding.LocationFirstItemBinding
import com.thisrahul.engilife.databinding.LocationItemBinding
import com.thisrahul.engilife.databinding.LocationLastItemBinding
import com.thisrahul.engilife.model.Location
import java.lang.Exception

class LocationAdapter(val context: Context,val list : ArrayList<Location>) : RecyclerView.Adapter<LocationAdapter.LocationViewHolder>() {

    class LocationViewHolder(val binding : ViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
        var binding : ViewBinding
        if(viewType == 0){
           binding = LocationFirstItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        }else if (viewType == list.size+1){
            binding = LocationLastItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        }else{
           binding = LocationItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        }
        return LocationViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
       when(position){
           0 ->{
               holder.itemView.setOnClickListener{
                   Toast.makeText(context,"",Toast.LENGTH_SHORT).show()
               }
           }
           list.size+1 ->{

           }
           else ->{
               val location = list[position-1];

               ((holder.binding) as LocationItemBinding).imgLocation.setImageResource(location.image)

               (holder.binding).txtLocationName.text = location.name
           }
       }

        holder.itemView.setOnClickListener{

        }
    }

    override fun getItemViewType(position: Int): Int {
        return position;
    }

    override fun getItemCount(): Int {
        try {
            return list.size + 2
        }catch (e : Exception){
            e.printStackTrace()
        }
        return 0
    }
}