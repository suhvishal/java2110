import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from '../model/movie.model';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private httpClient:HttpClient) { }


   public getAllMovies(): Observable<Movie[]>{
      return this.httpClient.get<Movie[]>('http://localhost:3900/api/movies')
   }

   //fetch a movie from backend based on given id
   public getMovie(id:string): Observable<Movie>{

     return null;
   }

   //construct a put request 
   public updateMovie(movie:Movie) : Observable<Movie>{

    return null;
  }

  //construct a post request 
  public createMovie(movie:Movie) : Observable<Movie>{

    return null;
  }

  //construct a delete request 
  public deleteMovie(idd:string) : Observable<Movie>{

    return null;
  }


}
