package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.businesslogic;

import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.database.BookReader;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BookService {

    /*private final ProductRepository productRepository;
    private final ValidationServiceV2 validationService;

    public ProductService(ProductRepository productRepository,
                          ValidationServiceV2 validationService) {
        this.productRepository = productRepository;
        this.validationService = validationService;
    }

    public AddProductResult addProduct(Product product) {
        ErrorDto[] errors = validationService.validate(product);
        AddProductResult addProductResult = new AddProductResult();
        if (errors.length == 0) {
            productRepository.add(product);
            addProductResult.setProduct(product);
        }
        addProductResult.setErrors(errors);
        return addProductResult;
    }*/

    private final BookReader bookReader;
    private final ValidationBookReader validationBookReader;

    public BookService(BookReader bookReader,
                       ValidationBookReader validationBookReader) {
        this.bookReader = bookReader;
        this.validationBookReader = validationBookReader;
    }

    public void addBook(Book book) {
        if (validationBookReader.validateForDublicate(bookReader.getDatabase(), book) &&
                validationBookReader.validate(book)) {
            bookReader.addBook(book);
        } else {
            System.out.println("Validation error");
        }
    }

    public void deleteBook(Book book){
        if (validationBookReader.validateForDelete(bookReader.getDatabase(), book) &&
                validationBookReader.validate(book)){
            bookReader.deleteBook(book);
        }else {
            System.out.println("Validation error");
        }
    }

    public Book[] getDatabase() {
        return bookReader.getDatabase();
    }
}

