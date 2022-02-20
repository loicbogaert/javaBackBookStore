package bookStore.springbootbackend.repository;

import bookStore.springbootbackend.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookRepository extends JpaRepository <Book, Long>{

}
