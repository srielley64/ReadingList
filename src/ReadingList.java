import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingList {

  public static void main(String[] args) throws IOException {
    byte[] mapData = Files.readAllBytes(Paths.get("books.json"));
    ObjectMapper mapper = new ObjectMapper();
    BookList bookList = mapper.readValue(mapData, BookList.class);
    System.out.println(bookList);
  }
}
