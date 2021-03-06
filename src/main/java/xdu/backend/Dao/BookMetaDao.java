package xdu.backend.Dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xdu.backend.pojo.BookMeta;
import xdu.backend.vo.BookInfo;

import java.util.List;

/**
 * @author 邓乐丰
 */
@Repository
public interface BookMetaDao {

    List<BookInfo> queryBookMetaByISBNCode(String isbnCode);

    List<BookInfo> queryBookInfoByAuthor(String author);

    List<BookInfo> queryBookInfoByName(String bookName);

    List<BookInfo> queryBookInfoByISBNNumber(String isbnNumber);

    List<BookInfo> queryBookInfoByCategory(String category);

    List<BookInfo> queryBookInfoByISBN(String isbnNumber);

    List<BookMeta> queryBookMetaByISBNNumber(String isbnNumber);

    void updateBookMeta(String isbnNumber, Integer deltaNum);

    void insertBookMeta(BookMeta bookMeta);

    void deleteBookMeta(String isbn_code);

    List<BookInfo> getAllBookInfos();

    Integer queryBookMetaNumber();

    void updateLocationAndCategoryByISBNNumber(@Param("location") String location, @Param("category") String category, @Param("isbnNumber") String isbnNumber);
}
