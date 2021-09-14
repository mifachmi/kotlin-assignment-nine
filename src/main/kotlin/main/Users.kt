package main

class Users {
    val user = "Ini adalah Class Outer Users"

    class Dosen {
        val nestedDosen = "Ini adalah class Dosen"

        fun namaDosen() {
            println("Daftar Nama Dosen")
            println("1. Pak Hero")
            println("2. Pak Udin")
            println("3. Pak Rosyid")
        }
    }

    inner class Mahasiswa {
        val innerUser = user + " yang diakses dari inner class Mahasiswa"

        fun namaMahasiswa() {
            println("Daftar Nama Mahasiswa")
            println("1. Fachmi Dimas Ardhana")
            println("2. Muhammad Al-rasyid")
            println("3. Rachel Virdi")
        }
    }
}

fun main() {
    println("Aplikasi Implementasi Inner dan Nested Class")
    val user = Users()
    //mengakses inner class Mahasiswa
    println("")
    user.Mahasiswa().namaMahasiswa()
    //mengakses outer property dari inner class
    println("")
    println(user.Mahasiswa().innerUser)
    //mengakses nested class
    val userNested = Users.Dosen()
    println("")
    println(userNested.nestedDosen)
    //mengakses fun nested class
    println("")
    userNested.namaDosen()
}