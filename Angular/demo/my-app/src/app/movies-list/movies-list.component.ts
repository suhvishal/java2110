import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from '../model/movie.model';

@Component({
  selector: 'app-movies-list',
  templateUrl: './movies-list.component.html',
  styleUrls: ['./movies-list.component.css']
})
export class MoviesListComponent implements OnInit {

  public moviesList: any[];

  constructor(private httpClient:HttpClient) { 

    httpClient.get<Movie[]>('http://localhost:3900/api/movies')
                .subscribe(
                  (response:Movie[]) => {
                    console.log("Response Successfully recd. from server")
                    console.log(response)
                    this.moviesList = response;
                  },
                  (errorResponse:HttpErrorResponse) => {
                    console.log('some error from the server..')
                    console.log(errorResponse)
                  }
                )
      
    

  }

  ngOnInit(): void {
  }

}
