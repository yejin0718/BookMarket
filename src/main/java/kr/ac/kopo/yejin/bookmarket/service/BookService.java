package kr.ac.kopo.yejin.bookmarket.service;

import kr.ac.kopo.yejin.bookmarket.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBookList();
}
