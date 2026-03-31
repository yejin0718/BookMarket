package kr.ac.kopo.yejin.bookmarket.controller;

import kr.ac.kopo.yejin.bookmarket.domain.Book;
import kr.ac.kopo.yejin.bookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping(value="/books", method = RequestMethod.GET)
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public String requestBookList(Model model) {
        List<Book> listOfBook = bookService.getAllBookList();
        model.addAttribute("bookList", listOfBook);
        return "books";
    }

    @GetMapping("/all")
    public ModelAndView requestAllBooks() {
        ModelAndView modelAndView =  new ModelAndView();
        List<Book> list = bookService.getAllBookList();
        modelAndView.addObject("bookList", list);
        modelAndView.setViewName("books");
        return modelAndView;
    }
}
