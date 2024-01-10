package com.enesas.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesas.gitpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("2. comment için yazdığım satır")
        println("3. commit için yazdığım satır")

        // Project kısmındaki .gitignore file her zaman ignore edilir. Yani bunun içindekiler public repository'e gönderilmez.
        // Bu nedenle api_key gibi önemli veriler orada tutulur.

        println("Şimdi checkout öğrenmek için yeni bir commit yapacağım.")
        println("Bu committen 6. commite gitmek için bunu yazıyorum.")

        println("Diyelim ki bir local change yaptık. Yani bu satırı yazdıktan sonra commit etmeden bir başka commit'e checkout yapmak istedik. " +
                "Çünkü bazen yazdığımız şey çok karışık olabilir ve commit edip git'e yüklemeden önce başka bir yere gitmek yani checkout etmek isteyebiliriz" +
                "Burada bize 2 seçenek çıkıyor. 1. Smart Checkout: Yani yazdıklarını geçici olarak STASH eder ve diğer commite checkout yapar. " +
                "2. Force checkout: Yazdığın her şeyi siler ve direkt istediğin başka bir commit'e checkout eder. Yani ya önce yazdıklarımızı commit edeceğiz." +
                "Yada etmeden stash edip diğer commite checkout edeceğiz. ")

        println("Az önce YeniBranch adındaa bir branch oluşturdum ve ona geçiş yaptım. O nedenle bu satırı commit ettiğimde YeniBranch içine commit olacak. Master içine değil." +
                "YeniBranch2 içinde buraya merge cümlesi ekliyorum")


        println("Bu satırı Github'tan cloneladığım GitPractice repository'sine göndermek için ekliyorum.")


    }
}