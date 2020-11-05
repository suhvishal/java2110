import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from '../model/movie.model';
import { MovieService } from '../services/movie-service.service';

@Component({
  selector: 'app-movies-list',
  templateUrl: './movies-list.component.html',
  styleUrls: ['./movies-list.component.css']
})
export class MoviesListComponent implements OnInit {

  public moviesList: any[];

  constructor(private movieService: MovieService) {

  }

  createMovie() {
    //create movie object manually and send it to server 
    const movie = { title: "new movie", dailyRentalRate: 3, numberInStock: 2, genreId: '5fa3c9b5f741cd1ba6d13038' }
    this.movieService.saveMovie(movie)
      .subscribe(
        (movie: Movie) => {
          //console.log('movie added to db;', movie)
          this.moviesList.unshift(movie);
        },
        (error) => {
          console.log(error)
        }
      )
  }

  ngOnInit(): void {
    this.movieService.getAllMovies()
      .subscribe(
        (moviesData: Movie[]) => {
          this.moviesList = moviesData;
        },
        (error: HttpErrorResponse) => {
          console.log(error)
        }
      )
  }


  updateMovie(movie) {

    movie.title = "updated title";

    this.movieService.saveMovie(movie)
      .subscribe(
        (updatedMovie: Movie) => {
          //console.log('movie updated...', updatedMovie)
          let index = this.moviesList.indexOf(movie);
          this.moviesList[index] = updatedMovie;
        },
        (error) => {
          console.log(error)
        }
      )

  }


  deleteMovie(id) {

    this.movieService.deleteMovie(id)
      .subscribe(
        (movie: Movie) => {
          //console.log('movie deleted...', movie)
          let m = this.moviesList.find((item) => item._id == id)
          let index = this.moviesList.indexOf(m)
          this.moviesList.splice(index, 1);
        },
        (error) => {
          console.log(error)
        }
      )

  }

}
