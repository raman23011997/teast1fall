
import java.time.Year;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shanty
 */
public class Movie {
    
  public String movieName,genre,description;
  public int  yearReleased;
  public Movie(String movieName,String genre,String description,int yearReleased){
      setMovieName(movieName);
    
      setDescription(description);
     
    setYearReleased(yearReleased);
   setGenre(genre);
  }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setMovieName(String movieName) {
        if(movieName.isEmpty()){
            throw new IllegalArgumentException("Enter a Movie Name");
        }else {
        this.movieName = movieName;
        }
    }

    public void setGenre(String genre) {
        if(genre.equalsIgnoreCase("Adventure") ||genre.equalsIgnoreCase("Comedy")
                || genre.equalsIgnoreCase("drama")||genre.equalsIgnoreCase("thriller")
                || genre.equalsIgnoreCase("western")||genre.equalsIgnoreCase("action")
             || genre.equalsIgnoreCase("animation")||genre.equalsIgnoreCase("Documentary")){
            this.genre=genre;
            
        }else{
            throw new IllegalArgumentException("Enter a valid genre");
        }
    }

    public void setDescription(String description) {
          if(description.isEmpty()){
            throw new IllegalArgumentException("Enter description");
        }else {
           this.description = description;
        }
     
    }

    public void setYearReleased(int yearReleased) {
        if(yearReleased>1889 && yearReleased<2018)
        this.yearReleased = yearReleased;
        else
             throw new IllegalArgumentException("Year should be in between 1889-2018");
    }

  
    public String toString() {
        return  String.format(movieName+ ", released in "+yearReleased);
    }
  
}
