import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from '../model/movie.model';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  private apiEndPoint = 'http://localhost:3900/api'
  private url = this.apiEndPoint + '/movies';

  constructor(private httpClient: HttpClient) { }


  public getAllMovies(): Observable<Movie[]> {
    return this.httpClient.get<Movie[]>(this.url)
  }

  //fetch a movie from backend based on given id
  public getMovie(id: string): Observable<Movie> {
    return this.httpClient.get<Movie>(this.url + '/' + id);
  }

  public saveMovie(movie): Observable<Movie> {

    //console.log(movie)
    //post 
    if (!movie._id) {
      return this.httpClient.post<Movie>(this.url, movie);
    } else {
      const movieToUpdate = {
          title: movie.title, 
          numberInStock: movie.numberInStock,
          dailyRentalRate : movie.dailyRentalRate,
          genreId : movie.genre._id
         }
      return this.httpClient.put<Movie>(this.url + '/' + movie._id, movieToUpdate)
    }
  }

  //construct a delete request 
  public deleteMovie(id: string): Observable<Movie> {

    return this.httpClient.delete<Movie>(this.url + '/' + id);
  }

}
