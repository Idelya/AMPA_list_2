package com.example.touristguide

val attractions_list_static: MutableList<AttractionModel> = mutableListOf(
    AttractionModel("Malbork Castle", "Cultural", R.mipmap.img_malbork_foreground,
        false,
        "The Castle of the Teutonic Order in Malbork is a " +
                "13th-century Teutonic castle and fortress located near the town of Malbork, Poland. " +
                "It is the largest castle in the world measured by land area and a UNESCO World Heritage Site.",
                listOf(
                    R.mipmap.img_lazienki_krolewskie_foreground,
                    R.mipmap.img_errant_rocks_foreground,
                    R.mipmap.img_black_cat_foreground
                ),
                listOf(
                    "Armory","Chapel","Palace Of Grand Master","Malbork Castle View From Nogat River", "Museums"
                )
    ),
    AttractionModel("Lazienki Park", "Cultural", R.mipmap.img_lazienki_krolewskie_foreground, true,
    "The Łazienki Park in Warsaw was originally designed as a bath park in the " +
            "17th century and then converted into a royal summer residence by King Stanisław August. " +
            "Today, it is the largest public park in Warsaw, an important venue for music and culture " +
            "and a must-see for architecture and nature lovers.",
        listOf(
            R.mipmap.img_lazienki_krolewskie_foreground,
            R.mipmap.img_malbork_foreground,
            R.mipmap.img_energylandia_foreground
        ),
        listOf("Amphitheatre", "Myślewicki Palace", "Palace on the Isle")),
    AttractionModel("Warsaw Rising Museum", "Cultural", R.mipmap.img_warsaw_rising_foreground, true,
        "The Warsaw uprising museum – first opened in 2004 to commemorate the 60th " +
                "Anniversary of the Warsaw Uprising –  recreates the atmosphere, history and struggles " +
                "that Varsovians went through in the attempt to " +
                "liberate their city from Nazi oppressors.",
        listOf(
            R.mipmap.img_black_cat_foreground,
            R.mipmap.img_malbork_foreground,
            R.mipmap.img_wieliczka_foreground,
            R.mipmap.img_warsaw_rising_foreground
        ),
        listOf("Section I - daily struggles of life in Warsaw ", "Section II - the first days of the " +
                "Uprising and the terrible living conditions that " +
                "Varsovians had to suffer",
                "Section III - s the fights that took place in September in in Warsaw",
                "remarkable replica of a “B24 liberator”")),
    AttractionModel("Morskie Oko Lake", "Natural", R.mipmap.img_morskie_oko_foreground, false,
        "Morskie Oko is the largest and most famous lake in the Tatra Mountains.",
        listOf(
            R.mipmap.img_errant_rocks_foreground,
            R.mipmap.img_wieliczka_foreground,
            R.mipmap.img_morskie_oko_foreground,
            R.mipmap.img_paradise_cave_foreground),
        listOf("The hike from the entrance to the lake","Czarny Staw")),
    AttractionModel("The Errant Rocks", "Natural", R.mipmap.img_errant_rocks_foreground, true,
        "Errant Rocks is a set of blocks of rock at a height of 853 m above sea level, forming a picturesque labyrinth (rock city), located in south-western Poland",
        listOf(
            R.mipmap.img_paradise_cave_foreground,
            R.mipmap.img_morskie_oko_foreground,
            R.mipmap.img_malbork_foreground),
        listOf("Tourist path in the reserve", "The rock town", "Nature in the Stołowe Mountains", "Stołowe Mountains National Park")),
    AttractionModel("Paradise Cave", "Natural", R.mipmap.img_paradise_cave_foreground, false,
        "Paradise Cave is a horizontal karstic limestone cave located inside the Malik hill, " +
                "to the south of Kielce, Świętokrzyskie Voivodship, Poland. ",
        listOf(
            R.mipmap.img_paradise_cave_foreground,
            R.mipmap.img_morskie_oko_foreground,
            R.mipmap.img_wieliczka_foreground,
            R.mipmap.img_vrepublic_foreground),
        listOf("the introductory museum exhibition in the subject of karst phenomena")),
    AttractionModel("Energylandia", "Recreation", R.mipmap.img_energylandia_foreground, true,
        "Energylandia is the biggest Amusement Park in Poland, offering an impressive number " +
                "of varied attractions situated on the area of 35 hectares, designed with all age groups in mind: children, teens, and adults.",
        listOf(
            R.mipmap.img_energylandia_foreground,
            R.mipmap.img_vrepublic_foreground),
        listOf("Fairytale Land ", "Family zone", "Extreme zone", "Water Park", "Dragon Town")),
    AttractionModel("Black Cat Escape Room", "Recreation", R.mipmap.img_black_cat_foreground, true,
        "The biggest escape room in Poland",
        listOf(
            R.mipmap.img_wieliczka_foreground,
            R.mipmap.img_vrepublic_foreground),
        listOf("Room: Cursed Painting","Room: Warsaw Uprising","Room: Nazi Gold")),
    AttractionModel("VRepublic", "Recreation",R.mipmap.img_vrepublic_foreground, false,
        "VRepublic Virtual Reality Park is a new unique place on the map of Krakow. There " +
                "is a space of 100 m2 and six fully professionally prepared VR stations ready to play " +
                "together in a group or for individuals",
        listOf(
            R.mipmap.img_malbork_foreground,
            R.mipmap.img_energylandia_foreground,
            R.mipmap.img_morskie_oko_foreground),
        listOf("Multiplayer Mode", "Escaperoom Mode")),
    AttractionModel("Wieliczka Salt Mine", "Cultural", R.mipmap.img_wieliczka_foreground, false,
        "The Wieliczka Salt Mine, in the town of Wieliczka, southern Poland, lies within the Kraków metropolitan area.",
        listOf(
            R.mipmap.img_malbork_foreground,
            R.mipmap.img_lazienki_krolewskie_foreground,
            R.mipmap.img_paradise_cave_foreground),
        listOf("Chambers – spaces hollowed out in salt rock", "Mining sites", "Endless corridors"))
)