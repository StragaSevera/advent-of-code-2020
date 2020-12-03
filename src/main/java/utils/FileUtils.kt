package utils

fun resourceToString(day: String, name: String) = day.javaClass.getResource("/$day/$name.txt").readText()