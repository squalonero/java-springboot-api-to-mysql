package com.sqlnr.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class App implements CommandLineRunner {

  public static void main(String[] args) {
    try {
      SpringApplication.run(App.class, args);
    } catch (Exception e) {
      System.out.println("Errore");
      System.out.println(e);
    }
  }

  public void run(String... args){
    /**
     * This application does not run any command line arguments
     */
    System.out.println("Application started");
  }

  // @Override
  // public void run(String... args) {
  //   System.out.println(" ๐งน๐งน๐งน Empty trash ๐งน๐งน๐งน \n");
  //   bookService.deleteAllBooks();
  //   System.out.println(" โณ๏ธโณ๏ธโณ๏ธ Create some Books โณ๏ธโณ๏ธโณ๏ธ \n");
  //   bookService.createBook();
  //   System.out.println("\n ๐ List all Books ๐ \n");
  //   bookService.showAllBooks();
  //   System.out.println("\n ๐ Get item By title ๐ \n");
  //   bookService.getBookByTitle("The Way of the Kings");
  //   System.out.println("\n ๐ Get Books By genre ๐ \n");
  //   bookService.getItemsByGenre("horror");
  //   System.out.println("\n ๐พ Update genre name of fantasy name ๐พ \n");
  //   bookService.updateGenreTitle("fantasy");
  //   System.out.println("\n โ Delete a Book โ \n");
  //   bookService.deleteBook("630670ea730c4cac165437ab");
  //   System.out.println("\n ๐ Final Count of Books ๐ \n");
  //   bookService.findCountOfBooks();
  //   System.out.println("\n RIP ๐");
  // }


}