fun main() {
    // Membuat array berisi angka 1 sampai 5
    val arr = Array(5) { i -> i + 1 }
    // Menampilkan elemen array dengan get(index)
    println(arr.get(0))  // 1
    println(arr[1])      // 2 (sama saja dengan get)
    // Mengubah elemen dengan set(index, value)
    arr.set(2, 99)
    println(arr[2])      // 99
    // Iterasi array
    for (x in arr) {
        print("$x ")
    }
}