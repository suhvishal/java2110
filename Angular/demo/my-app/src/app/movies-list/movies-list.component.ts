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

  constructor(private movieService:MovieService) { 

        this.movieService.getAllMovies()
            .subscribe(
              (moviesData:Movie[])=> {
                 this.moviesList = moviesData;
              },
              (error:HttpErrorResponse)=> {
                console.log(error)
              }
            )
   
  }

  createMovie(){
    //create movie object manually and send it to server 
  }

  ngOnInit(): void {
  }

}
