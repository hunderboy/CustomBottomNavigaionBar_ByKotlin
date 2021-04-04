package com.example.custombottomnavigaionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.example.custombottomnavigaionbar.databinding.ActivityMeowNaviBinding



class MeowNaviActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMeowNaviBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMeowNaviBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_profile))
        binding.bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_union))
        binding.bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_setting))



        binding.bottomNavigation.setOnClickMenuListener {

            when(it.id){
//                1 -> Toast.makeText(baseContext, "1번!!", Toast.LENGTH_SHORT).show()
//                2 -> Toast.makeText(baseContext, "2번!!", Toast.LENGTH_SHORT).show()
//                3 -> Toast.makeText(baseContext, "3번!!", Toast.LENGTH_SHORT).show()
            }

        }
        binding.bottomNavigation.show(1)
//        binding.bottomNavigation.setOnShowListener {
//
//        }


    }


}