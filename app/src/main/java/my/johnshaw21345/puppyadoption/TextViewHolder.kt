package my.johnshaw21345.puppyadoption

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextViewHolder(parent:ViewGroup) : RecyclerView.ViewHolder (
    LayoutInflater.from(parent.context).inflate(R.layout.layout_text, parent, false)
) {


    fun update(item: puppy) {

        itemView.findViewById<ImageView>(R.id.image).setImageResource(item.imageId)
        itemView.findViewById<TextView>(R.id.name).setText(item.name)
        itemView.findViewById<TextView>(R.id.age).setText(item.age)
        itemView.findViewById<TextView>(R.id.location).setText(item.location)

    }

}