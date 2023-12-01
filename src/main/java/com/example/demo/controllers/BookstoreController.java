package com.example.demo.controllers;


import com.example.demo.domain.*;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
@RequestMapping("bookstore")
// This means that this class is a Controller
public class BookstoreController {

    @Autowired
    private GenreRepository genreRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;


    @PostMapping(path = "/genre", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Genre addNewGenre(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }

    @GetMapping(path = "/genre")
    public @ResponseBody Iterable<Genre> getAllUsers() {
        return genreRepository.findAll();
    }

    // Address

    @PostMapping(path = "/address", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Address addNewAddress(@RequestBody Address address) {
        System.out.println(String.format("Saving address ", address));
        return addressRepository.save(address);
    }

    @GetMapping(path = "/address")
    public @ResponseBody Iterable<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    // Author

    @PostMapping(path = "/author", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Author addNewAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @GetMapping(path = "/author")
    public Iterable<Author> getAllAuthor() {
        return authorRepository.findAll();
    }


    // Book
    @PostMapping(path = "/book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Book addNewBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping(path = "/book")
    public @ResponseBody Iterable<Book> getAllBook() {
        return bookRepository.findAll();
    }

    // Customer

    @PostMapping(path = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Customer addNewCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
    @PostMapping(path = "/customer-with-address", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Customer addCustomerWithAddress(@RequestBody Customer.Request request) {
        System.out.println(request);
        Integer addressId = addNewAddress(request.getAddress()).getId();
        Customer customer = request.getCustomer();
        customer.setAddress_id(addressId);
        return customerRepository.save(customer);
    }

    @GetMapping(path = "/customer")
    public @ResponseBody Iterable<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    // Order
    @PostMapping(path = "/order", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Order addNewOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping(path = "/order")
    public @ResponseBody Iterable<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    // OrderDetail

    @PostMapping(path = "/orderdetail", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody OrderDetail addNewOrderDetail(@RequestBody OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @GetMapping(path = "/orderdetail")
    public @ResponseBody Iterable<OrderDetail> getAllOrderDetail() {
        return orderDetailRepository.findAll();
    }


}