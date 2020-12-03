package utils

fun readResourceToString(day: String, name: String) = String.javaClass.getResource("/$day/$name.txt").readText()