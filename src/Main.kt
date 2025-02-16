fun main() {
    val myBook = Book()
    myBook.title = "title"
    myBook.author = "author"
    myBook.yearPublished = 2016

}

class Book {
    var title: String = ""
    var author: String = ""
    var yearPublished: Int = 2000
}