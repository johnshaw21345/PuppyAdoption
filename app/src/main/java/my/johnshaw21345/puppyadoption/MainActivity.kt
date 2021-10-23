package my.johnshaw21345.puppyadoption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*findViewById<Button>(R.id.btn).setOnClickListener{

            val intent = Intent(this, MyActivity::class.java)

            intent.putExtra("date","2021-10-17")

            startActivity(intent)

        }*/





        val list = findViewById<RecyclerView>(R.id.list)
        val adapter = SearchAdapter()

        list.adapter = adapter
        list.layoutManager = LinearLayoutManager (this)

        val items = arrayListOf<puppy>()



        items.add(puppy("1", R.drawable.doga, "2","A"))
        items.add(puppy("2", R.drawable.dogb, "3","B"))
        items.add(puppy("3", R.drawable.dogc, "4","C"))
        items.add(puppy("1", R.drawable.doga, "2","A"))
        items.add(puppy("2", R.drawable.dogb, "3","B"))
        items.add(puppy("3", R.drawable.dogc, "4","C"))
        items.add(puppy("1", R.drawable.doga, "2","A"))
        items.add(puppy("2", R.drawable.dogb, "3","B"))
        items.add(puppy("3", R.drawable.dogc, "4","C"))
        items.add(puppy("1", R.drawable.doga, "2","A"))
        items.add(puppy("2", R.drawable.dogb, "3","B"))
        items.add(puppy("3", R.drawable.dogc, "4","C"))
        items.add(puppy("1", R.drawable.doga, "2","A"))
        items.add(puppy("2", R.drawable.dogb, "3","B"))
        items.add(puppy("3", R.drawable.dogc, "4","C"))
        items.add(puppy("1", R.drawable.doga, "2","A"))
        items.add(puppy("2", R.drawable.dogb, "3","B"))
        items.add(puppy("3", R.drawable.dogc, "4","C"))
        items.add(puppy("1", R.drawable.doga, "2","A"))
        items.add(puppy("2", R.drawable.dogb, "3","B"))
        items.add(puppy("3", R.drawable.dogc, "4","C"))
        items.add(puppy("1", R.drawable.doga, "2","A"))
        items.add(puppy("2", R.drawable.dogb, "3","B"))
        items.add(puppy("3", R.drawable.dogc, "4","C"))


        adapter.updateItems(items)

        var thisContext = this
        adapter.setItemClickListener(object : SearchAdapter.ItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(thisContext, Detail::class.java)

                        intent.putExtra("position", position)

                startActivity(intent)
            }
        })


    }
}