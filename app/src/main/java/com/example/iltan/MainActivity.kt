package com.example.iltan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.iltan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private var type
    private lateinit var binding: ActivityMainBinding
    // var type
    //var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding!!.viewModel = this
    }

    //SignUp
    fun SignUp(view: View){
        Toast.makeText(view.context, "Qilicked: $title", Toast.LENGTH_SHORT).show()
    }
    
}
