fun main() {
    val myBook = Book("Extremely Loud and Incredibly Close",
        "Jonathon", 2016)
    myBook.getBookInfo()

}

class Book (  var title: String, var author: String, var yearPublished: Int ){

    fun getBookInfo() {
        println("$title by $author ($yearPublished)")
    }

}