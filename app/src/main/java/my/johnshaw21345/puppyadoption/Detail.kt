package my.johnshaw21345.puppyadoption

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val itemd = arrayListOf<puppyDetail>()


        itemd.add(puppyDetail("1", R.drawable.doga, "2","A","AA区AA路AA号","比熊","3000","Test1"))
        itemd.add(puppyDetail("2", R.drawable.dogb, "3","B","BB区BB路BB号","金毛","4000","Test2"))
        itemd.add(puppyDetail("3", R.drawable.dogc, "4","C","CC区CC路CC号","泰迪","5000","Test3"))
        itemd.add(puppyDetail("1", R.drawable.doga, "2","A","AA区AA路AA号","比熊","3000","Test1"))
        itemd.add(puppyDetail("2", R.drawable.dogb, "3","B","BB区BB路BB号","金毛","4000","Test2"))
        itemd.add(puppyDetail("3", R.drawable.dogc, "4","C","CC区CC路CC号","泰迪","5000","Test3"))
        itemd.add(puppyDetail("1", R.drawable.doga, "2","A","AA区AA路AA号","比熊","3000","Test1"))
        itemd.add(puppyDetail("2", R.drawable.dogb, "3","B","BB区BB路BB号","金毛","4000","Test2"))
        itemd.add(puppyDetail("3", R.drawable.dogc, "4","C","CC区CC路CC号","泰迪","5000","Test3"))
        itemd.add(puppyDetail("1", R.drawable.doga, "2","A","AA区AA路AA号","比熊","3000","Test1"))
        itemd.add(puppyDetail("2", R.drawable.dogb, "3","B","BB区BB路BB号","金毛","4000","Test2"))
        itemd.add(puppyDetail("3", R.drawable.dogc, "4","C","CC区CC路CC号","泰迪","5000","Test3"))
        itemd.add(puppyDetail("1", R.drawable.doga, "2","A","AA区AA路AA号","比熊","3000","Test1"))
        itemd.add(puppyDetail("2", R.drawable.dogb, "3","B","BB区BB路BB号","金毛","4000","Test2"))
        itemd.add(puppyDetail("3", R.drawable.dogc, "4","C","CC区CC路CC号","泰迪","5000","Test3"))
        itemd.add(puppyDetail("1", R.drawable.doga, "2","A","AA区AA路AA号","比熊","3000","Test1"))
        itemd.add(puppyDetail("2", R.drawable.dogb, "3","B","BB区BB路BB号","金毛","4000","Test2"))
        itemd.add(puppyDetail("3", R.drawable.dogc, "4","C","CC区CC路CC号","泰迪","5000","Test3"))
        itemd.add(puppyDetail("1", R.drawable.doga, "2","A","AA区AA路AA号","比熊","3000","Test1"))
        itemd.add(puppyDetail("2", R.drawable.dogb, "3","B","BB区BB路BB号","金毛","4000","Test2"))
        itemd.add(puppyDetail("3", R.drawable.dogc, "4","C","CC区CC路CC号","泰迪","5000","Test3"))
        itemd.add(puppyDetail("1", R.drawable.doga, "2","A","AA区AA路AA号","比熊","3000","Test1"))
        itemd.add(puppyDetail("2", R.drawable.dogb, "3","B","BB区BB路BB号","金毛","4000","Test2"))
        itemd.add(puppyDetail("3", R.drawable.dogc, "4","C","CC区CC路CC号","泰迪","5000","Test3"))



        val num = intent.extras?.getInt("position")


        findViewById<ImageView>(R.id.imaged).setImageResource(itemd[num!!].imageId)
        findViewById<TextView>(R.id.name).setText(itemd[num!!].name)
        findViewById<TextView>(R.id.age).setText(itemd[num!!].age)
        findViewById<TextView>(R.id.location).setText(itemd[num!!].location)
        findViewById<TextView>(R.id.address).setText(itemd[num!!].address)
        findViewById<TextView>(R.id.breed).setText(itemd[num!!].breed)
        findViewById<TextView>(R.id.price).setText(itemd[num!!].price)
        findViewById<TextView>(R.id.others).setText(itemd[num!!].others)
    }


}