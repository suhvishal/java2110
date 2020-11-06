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
  public errMessage: string;
  public hasError:boolean = false;

  constructor(private movieService: MovieService) {

  }

  createMovie() {
    //create movie object manually and send it to server 
    const movie = { title: "new movie", numberInStock: 2, genreId: '5fa3c9b5f741cd1ba6d13038' }
    this.movieService.saveMovie(movie)
      .subscribe(
        (movie: Movie) => {
          //console.log('movie added to db;', movie)
          this.moviesList.unshift(movie);
        },
        (error:string) => {
          this.hasError = true;
          this.errMessage = error;
        }
      )
  }

  ngOnInit(): void {
    this.movieService.getAllMovies()
      .subscribe(
        (moviesData: Movie[]) => {
          this.moviesList = moviesData;
          this.hasError = false;
        },
        (error:string) => {
          this.hasError = true;
          this.errMessage = error;
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
        (error:string) => {
          this.hasError = true;
          this.errMessage = error;
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
          this.hasError = false;
        },
        (error:string) => {
          this.hasError = true;
          this.errMessage = error;
        }
      )

  }

}
