package www.revengerfitness.blogspot.com.coroutine6kotlinrunblocking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runBlocking {
            launch {
                delay(1000)
                println("world")
            }
            println("hello")
        }
    /**    GlobalScope.launch {
            delay(1000)
            println("world")
        }
        println("hello")
        Thread.sleep(2000) // manually sleep thread concept but we have run blocking concept in coroutine
*/
    }
}