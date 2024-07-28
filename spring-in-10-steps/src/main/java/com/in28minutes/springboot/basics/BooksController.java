package in28minutes.springboot.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Books> getAllBooks(){
        return Arrays.asList(new Books(12, "Spring mastering 5.3", "Sang"));
    }
}
