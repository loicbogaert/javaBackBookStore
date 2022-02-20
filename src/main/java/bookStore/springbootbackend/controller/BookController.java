package bookStore.springbootbackend.controller;

import bookStore.springbootbackend.entities.Book;
import bookStore.springbootbackend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5500")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book) {
      return bookRepository.save(book);
    }
}
