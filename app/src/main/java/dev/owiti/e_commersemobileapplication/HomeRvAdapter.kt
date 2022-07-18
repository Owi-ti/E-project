package dev.owiti.e_commersemobileapplication

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class HomeRvAdapter(var image_List:List<Int>):RecyclerView.Adapter<HomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        var itemview=LayoutInflater.from(parent.context).inflate(R.layout.home_images_item,parent,false)
        return HomeViewHolder(itemview)
    }


    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        var currentImage= image_List.get(position)
        holder.ivIsland.setImageResource(currentImage)

    }

    override fun getItemCount(): Int {
        return image_List.size
    }
}

class HomeViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
    var ivIsland=itemview.findViewById<ImageView>(R.id.ivIsland)
}