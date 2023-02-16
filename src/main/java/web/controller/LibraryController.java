package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import web.model.Authors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.AuthorService;
import web.service.AuthorServiceImpl;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private AuthorService authorService;


    @GetMapping(value = "/authors")
    public List<Authors> getById(int id){
        return authorService.getAllAuthors();
    }
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView allAuthors() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("authors");
//        return modelAndView;
//    }

   }

