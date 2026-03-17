package kr.ac.kopo.yejin.bookmarket.repository;

import kr.ac.kopo.yejin.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository{
    private List<Book> listOfBooks = new ArrayList<Book>();
    
    public BookRepositoryImpl () {
        Book book1 = new Book();
        book1.setBookId("isbn1001");
        book1.setName("스프링부트 완전정복");
        book1.setDescription("스프링 부트는 스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구이다. 이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있다. 그리고 단계별 실습을 따라 하다 보면 도서 쇼핑몰 구축 프로젝트를 완성할 수 있다. 개념-실습-프로젝트의 3단계 학습으로 스프링 부트를 제대로 익힌다면 개발 시간을 단축하고 생산성을 높일 수 있는 개발자로 성장할 수 있다.\n");
        book1.setPublisher("길벗캠퍼스");
        book1.setCategory("IT전문서");
        book1.setAuthor("송미영");
        book1.setUnitPrice(new BigDecimal(35000));
        book1.setReleaseDate("2024/12/31");

        Book book2 = new Book();
        book2.setBookId("isbn1002");
        book2.setName("시스템 분석과 설계");
        book2.setDescription("간결한 설명과 프로젝트로 배우는 시스템 분석과 설계는 비즈니스 시스템을 개발하는 데 필요한 요구 분석 및 설계 방법론을 다룬 책으로, 프로그래밍을 공부한 후 시스템 개발에 관심이 있는 학생과 실제 시스템 개발 업무에 종사하는 사람이 보면 좋다. 구조적 방법론, 정보공학 방법론, 객체지향 방법론의 주요 개념과 원리를 살펴본 후 미니 프로젝트로 해당 방법론의 적용 사례를 보여주어 원론적인 내용 이해에 그치지 않고 실제적인 지식이 될 수 있도록 했다.\n");
        book2.setPublisher("한빛아카데미");
        book2.setCategory("IT전문서");
        book2.setAuthor("허원실");
        book2.setUnitPrice(new BigDecimal(25000));
        book2.setReleaseDate("2015/11/30");

        Book book3 = new Book();
        book3.setBookId("isbn1003");
        book3.setName("C언어 Express");
        book3.setDescription("C언어는 공학 전반의 실무 현장에서 가장 많이 사용되는 언어 중의 하나이다. C언어는 간결하고 효율적이며 저수준의 하드웨어 제어도 가능한 강력한 언어이다. 이 책을 저술하게 된 가장 큰 이유는, 프로그래밍 입문자들이 이 책을 통하여 보다 쉽고 재미있게 프로그래밍의 세계로 들어올 수 있도록 하자는 것이었다. 그러기 위해 다음과 같이 이 책을 구성하였다. 첫째, 적절한 그림을 가능한 많이 사용하여 보다 친숙하고, 지루하지 않으며 독자들이 이해하기 쉽도록 구성하였다. 입문자들은 그림을 통하여 보다 쉽게 관련 개념들을 빠르게 이해할 수 있다. 둘째, 각각의 주제에 대하여 개념과 원리를 자세하게 설명하였으며 설명은 문답식이어서 독자들이 친숙하게 느끼도록 하였다. 셋째, 페이지가 허용하는 한도에서 충분한 예제 프로그램을 제공하여 입문자들이 참고할수 있도록 하였다. 넷째, 실습 책을 따로 구입하지 않아도 혼자서 실습을 진행할 수 있도록 단계식 실습 문제를 제공하였다. 사용자들은 주어진 예제 소스를 첨삭해가면서 학습한 내용을 체득할 수 있도록 하였다.\n");
        book3.setPublisher("생능출판사");
        book3.setCategory("IT전문서");
        book3.setAuthor("천인국");
        book3.setUnitPrice(new BigDecimal(32000));
        book3.setReleaseDate("2023/01/17");

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
    }

    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }
}
