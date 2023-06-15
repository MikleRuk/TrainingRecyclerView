package com.example.trainingrecyclerview3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trainingrecyclerview3.databinding.CatItemBinding

class CatAdapter : RecyclerView.Adapter<CatAdapter.CatHolder>() {
    val catList = ArrayList<Cat>()
    class CatHolder(item: View) : RecyclerView.ViewHolder(item) {

        val binding = CatItemBinding.bind(item)

        fun bind(cat: Cat) = with(binding) {
            im.setImageResource(cat.imageId)
            tvTitle.text = cat.title

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cat_item, parent, false)
        return CatHolder(view)
    }

    override fun onBindViewHolder(holder: CatHolder, position: Int) {
        holder.bind(catList[position])
    }

    override fun getItemCount(): Int {
        return  catList.size
    }


    fun addCat(cat: Cat){
        catList.add(cat)
        notifyDataSetChanged()
    }


}