package com.thisrahul.engilife.utils

import com.thisrahul.engilife.R
import com.thisrahul.engilife.model.Collection
import com.thisrahul.engilife.model.Kinda
import com.thisrahul.engilife.model.Location
import com.thisrahul.engilife.model.Wallet

class Data {

     fun getLocationList() :ArrayList<Location>{
        val list: ArrayList<Location> = ArrayList()
        list.add(Location("Banglore", R.drawable.banglore))
        list.add(Location("Chennai",R.drawable.chennai))
        list.add(Location("Delhi",R.drawable.delhi))
        list.add(Location("Gurgaon",R.drawable.gurgaon))
        list.add(Location("Hyderabad",R.drawable.hyderabad))
        list.add(Location("Kolkata",R.drawable.kolkat))
        list.add(Location("Mumbai",R.drawable.mumbai))
        list.add(Location("Noida",R.drawable.noida))
        list.add(Location("Pune",R.drawable.pune))

        return list;
    }

     fun getBannerList() : ArrayList<Int>{
          val list: ArrayList<Int> = ArrayList()
          list.add( R.drawable.banglore)
          list.add(R.drawable.chennai)
          list.add(R.drawable.delhi)
          list.add(R.drawable.gurgaon)
          list.add(R.drawable.hyderabad)
          list.add(R.drawable.kolkat)
          list.add(R.drawable.mumbai)
          list.add(R.drawable.noida)
          list.add(R.drawable.pune)

          return list;
     }

      fun getCollectionList() :ArrayList<Collection>{
          val list: ArrayList<Collection> = ArrayList()
          list.add(Collection(R.drawable.h,"Belvilla","Premium Holiday Homes","5.0","NEWLY LAUNCHED",true,"tag"))
           list.add(Collection(R.drawable.h1,"OYO TOWNHOUSE","Chic stays at affordable retes","5.0","PREMIUM UNLOCKED",true,"tag1"))
           list.add(Collection(R.drawable.h5,"CAPITAL O","Beautifuly designed spaces","4.5","",false,"0"))
           list.add(Collection(R.drawable.h3,"POWER BREAK","6 hr stays at discounted rates","4.2","",false,""))
           list.add(Collection(R.drawable.h4,"COLLECTION O","Premium business stays","4.2","",false,"0"))
           list.add(Collection(R.drawable.h6,"OYO HOME","Modern & stylish homestays","4.2","RELAXATION UNLOCKED",true,"tag2"))
           list.add(Collection(R.drawable.h1,"STAR COLLECTION","Aesthetically designed rooms","5.0","",false,"0"))
           list.add(Collection(R.drawable.h,"SPOT ON","Comfortable budget stays","3.5","",false,"0"))

           return list;
     }

    fun getKindaList(): ArrayList<Kinda> {
        val list: ArrayList<Kinda> = ArrayList()

        list.add(Kinda(R.drawable.h6,true,"EXCLUSIVE OFFER"))
        list.add(Kinda(R.drawable.h3,false,""))
        list.add(Kinda(R.drawable.h1,false,""))
        list.add(Kinda(R.drawable.h,false,""))

        return list;
    }

    fun getWalletList(): ArrayList<Wallet> {
        val list: ArrayList<Wallet> = ArrayList()

        list.add(Wallet(R.drawable.h6,"₹ 500"))
        list.add(Wallet(R.drawable.h,"₹ 0"))
        return list;
    }

}
