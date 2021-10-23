package my.johnshaw21345.puppyadoption

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SearchAdapter : RecyclerView.Adapter<TextViewHolder>() {

    private val items = arrayListOf<puppy>()
    private var itemClickListener: ItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        return  TextViewHolder(parent)
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.update(items.get(position))
        holder.itemView.setOnClickListener{
            itemClickListener?.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun updateItems(items: ArrayList<puppy>){

        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()

    }

    fun setItemClickListener(itemClickListener: ItemClickListener){
        this.itemClickListener = itemClickListener
    }

    interface ItemClickListener{
        fun onItemClick(position: Int)
    }

}