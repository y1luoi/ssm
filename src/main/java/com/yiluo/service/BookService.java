package com.yiluo.service;

import com.yiluo.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author y1luo
 * @date 09-28
 */
public interface BookService {

    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();

    //通过书名查书籍返回一个Book
    Books queryBookByName( String bookName);

}
