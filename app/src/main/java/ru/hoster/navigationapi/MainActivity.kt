package ru.hoster.navigationapi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import ru.hoster.navigationapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        setContentView(binding.root)

        val buttonNW = binding.ButtonNW

        val navController = Navigation.findNavController(this,R.id.BaseFragment)
        NavigationUI.setupWithNavController(buttonNW,navController)


    }
}