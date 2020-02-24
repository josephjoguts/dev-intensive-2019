package ru.skillbranch.dev_intensive_2019.utils

object Utils {
        fun ParseFullName(fullName:String?):String{
            val parts : List<String>? = fullName?.split(" ")
            val firstName = parts?.getOrNull(0)
            val lastName = parts?.getOrNull(1)
            var res1:String
            var res2:String
            res1 = when (firstName){
                null -> "null"
                "" -> "null"
                " " -> "null"
                else -> firstName
            }



            res2 = when (lastName){
                null -> "null"
                "" -> "null"
                " " -> "null"
                else -> lastName
            }
            return "$res1 $res2"
        }


}