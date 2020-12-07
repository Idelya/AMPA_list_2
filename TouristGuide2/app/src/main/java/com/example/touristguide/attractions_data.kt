package com.example.touristguide

val attractions_list_static: MutableList<AttractionModel> = mutableListOf(
    AttractionModel("Malbork Castle", "Cultural", R.mipmap.img_malbork_foreground, false),
    AttractionModel("Lazienki Park", "Cultural", R.mipmap.img_lazienki_krolewskie_foreground, true),
    AttractionModel("Warsaw Rising Museum", "Cultural", R.mipmap.img_warsaw_rising_foreground, true),
    AttractionModel("Morskie Oko Lake", "Natural", R.mipmap.img_morskie_oko_foreground, false),
    AttractionModel("The Errant Rocks", "Natural", R.mipmap.img_errant_rocks_foreground, true),
    AttractionModel("Paradise Cave", "Natural", R.mipmap.img_paradise_cave_foreground, false),
    AttractionModel("Energylandia", "Recreation", R.mipmap.img_energylandia_foreground, true),
    AttractionModel("Black Cat Escape Room", "Recreation", R.mipmap.img_black_cat_foreground, true),
    AttractionModel("VRepublic", "Recreation",R.mipmap.img_vrepublic_foreground, false),
    AttractionModel("Wieliczka Salt Mine", "Cultural", R.mipmap.img_wieliczka_foreground, false)
)