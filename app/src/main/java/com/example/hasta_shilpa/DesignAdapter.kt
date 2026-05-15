package com.example.hasta_shilpa

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class DesignAdapter(
    private val designList: List<DesignModel>
) : RecyclerView.Adapter<DesignAdapter.DesignViewHolder>() {

    class DesignViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val image: ImageView =
            itemView.findViewById(R.id.productImage)

        val title: TextView =
            itemView.findViewById(R.id.productTitle)

        val price: TextView =
            itemView.findViewById(R.id.productPrice)

        val card: CardView =
            itemView.findViewById(R.id.designCard)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DesignViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_marketplace, parent, false)

        return DesignViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: DesignViewHolder,
        position: Int
    ) {

        val design = designList[position]

        holder.image.setImageResource(design.image)

        holder.title.text = design.title

        holder.price.text = design.price

        holder.card.setOnClickListener {

            val intent = Intent(
                holder.itemView.context,
                DesignDetailActivity::class.java
            )

            intent.putExtra("title", design.title)

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {

        return designList.size
    }
}