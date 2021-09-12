package com.thisrahul.engilife.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thisrahul.engilife.databinding.WalletItemBinding
import com.thisrahul.engilife.model.Wallet

class WalletAdapter(val list : ArrayList<Wallet>) : RecyclerView.Adapter<WalletAdapter.WalletViewHolder>() {

    class WalletViewHolder(val binding : WalletItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
       val binding = WalletItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return WalletViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
       val item = list[position]

        holder.binding.imgWallet.setImageResource(item.img)
        holder.binding.txtRs.text = item.rs
    }

    override fun getItemCount(): Int {
        try {
            return list.size
        }catch (e : Exception){
            e.printStackTrace()
        }
       return 0
    }
}