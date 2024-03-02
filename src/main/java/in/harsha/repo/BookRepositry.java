package in.harsha.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.harsha.entity.Book;

public interface BookRepositry extends JpaRepository<Book, Serializable>{

}
