package kr.ac.kopo.yejin.bookmarket.repository;

import kr.ac.kopo.yejin.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
