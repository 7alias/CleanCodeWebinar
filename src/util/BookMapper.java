package util;

import model.impl.DigitalBook;
import model.impl.PaperBook;

public class BookMapper {


       /** Forbidden to create class
      @param digital Book input data
      @return digital Book object
*/

    private BookMapper(){

    }

    /*
    * convert digital book to paper book
    * */

    public static PaperBook mapToPaperBook(DigitalBook digitalBook){

PaperBook paperBook = new PaperBook();
paperBook.setBookTitle(digitalBook.getBookTitle());
paperBook.setAuthor(digitalBook.getAuthor());
paperBook.setPages(digitalBook.getPages());
paperBook.setCoverType("");
    return paperBook;
    }

}
