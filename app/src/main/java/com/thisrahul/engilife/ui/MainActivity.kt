package com.thisrahul.engilife.ui

import android.graphics.Rect
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import com.thisrahul.engilife.R
import com.thisrahul.engilife.adapter.*
import com.thisrahul.engilife.databinding.ActivityMainBinding
import com.thisrahul.engilife.utils.Data

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainLinear = binding.linearLayout
        val llToolbar = binding.toolbar
        val nestedScrollView = findViewById<NestedScrollView>(R.id.nestedScrollView)

        nestedScrollView.setOnScrollChangeListener { v: NestedScrollView?, scrollX: Int, scrollY: Int, oldScrollX: Int, oldScrollY: Int ->
            val isSearchViewVisible = isSearchViewVisible(v!!, mainLinear)
            if (isSearchViewVisible) {
                llToolbar.visibility = View.GONE
                mainLinear.visibility = View.VISIBLE
            } else {
                llToolbar.visibility = View.VISIBLE
                mainLinear.visibility = View.GONE
            }
        }

        setLocationRecyclerView()
        setBannerRecyclerView()
        setCollectionRecylcerView()
        setKindaRecyclerView()
        setWalletRecyclerView()
    }

    private fun setLocationRecyclerView(){
        val rvLocation = binding.rvLocation
        rvLocation.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvLocation.layoutManager = linearLayoutManager

        val locationAdapter = LocationAdapter(this, Data().getLocationList())
        rvLocation.adapter = locationAdapter
    }

    private fun setBannerRecyclerView(){
        val rvBanner = binding.rvBanner
        rvBanner.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvBanner.layoutManager = linearLayoutManager

        val bannerAdapter = BannerAdapter(Data().getBannerList())
        rvBanner.adapter = bannerAdapter
    }

    private fun setCollectionRecylcerView(){
        val rvCollection = binding.rvCollection
        rvCollection.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvCollection.layoutManager = linearLayoutManager

        val collectionAdapter = CollectionAdapter(this,Data().getCollectionList())
        rvCollection.adapter = collectionAdapter
    }
    
    private fun setKindaRecyclerView(){
        val rvKinda = binding.rvKinda
        rvKinda.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvKinda.layoutManager = linearLayoutManager

        val collectionAdapter = KindaAdapter(this,Data().getKindaList())
        rvKinda.adapter = collectionAdapter
    }

    private fun setWalletRecyclerView(){
        val rvWallet = binding.rvWallet
        rvWallet.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvWallet.layoutManager = linearLayoutManager

        val collectionAdapter = WalletAdapter(Data().getWalletList())
        rvWallet.adapter = collectionAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun isSearchViewVisible(nestedScrollView: NestedScrollView, view: View): Boolean {
        val scrollBounds = Rect()
        nestedScrollView.getDrawingRect(scrollBounds)
        var top = 0f
        var view1 = view
        while (view1 !is NestedScrollView) {
            top += view1.y
            view1 = view1.parent as View
        }
        val bottom = top + view.height
        return scrollBounds.top < bottom && scrollBounds.bottom > top
    }
}