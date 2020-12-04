package dev.codinghive.spring5webapp.bootstrap;

import dev.codinghive.spring5webapp.domain.Author;
import dev.codinghive.spring5webapp.domain.Book;
import dev.codinghive.spring5webapp.domain.Publisher;
import dev.codinghive.spring5webapp.repositories.AuthorRepository;
import dev.codinghive.spring5webapp.repositories.BookRepository;
import dev.codinghive.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher=new Publisher("Ali","C 405","Lahore","Pakistan","1122");
        publisherRepository.save(publisher);

        Author author=new Author("Imran","Bajwa");
        Book book=new Book("Flutter cook book","1122");

        author.getBooks().add(book);
        book.getAuthors().add(author);
        book.setPublisher(publisher);
        publisher.getBooks().add(book);

        authorRepository.save(author);
        bookRepository.save(book);
        publisherRepository.save(publisher);


        Author author2=new Author("Musab","Bajwa");
        Book book2=new Book("Life","111");

        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        book2.setPublisher(publisher);
        publisher.getBooks().add(book2);

        authorRepository.save(author2);
        bookRepository.save(book2);
        publisherRepository.save(publisher);




        System.out.println("Stated in BootStrap");
        System.out.println("Number of Books: "+bookRepository.count());
    }
}
