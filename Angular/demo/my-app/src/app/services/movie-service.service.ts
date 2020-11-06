import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Movie } from '../model/movie.model';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  private apiEndPoint = 'http://localhost:3900/api'
  private url = this.apiEndPoint + '/movies';

  constructor(private httpClient: HttpClient) { }

  public getAllMovies(): Observable<Movie[]> {
    return this.httpClient.get<Movie[]>(this.url).pipe(
      catchError(this.handleError)
    )
  }

  //fetch a movie from backend based on given id
  public getMovie(id: string): Observable<Movie> {
    return this.httpClient.get<Movie>(this.url + '/' + id).pipe(
      catchError(this.handleError)
    )
  }

  public saveMovie(movie): Observable<Movie> {

    //console.log(movie)
    //post 
    if (!movie._id) {

      

      return this.httpClient.post<Movie>(this.url, movie).pipe(
        catchError(this.handleError)
      )
    } else {
      const movieToUpdate = {
        title: movie.title,
        numberInStock: movie.numberInStock,
        dailyRentalRate: movie.dailyRentalRate,
        genreId: movie.genre._id
      }
      return this.httpClient.put<Movie>(this.url + '/' + movie._id, movieToUpdate).pipe(
        catchError(this.handleError)
      )
    }
  }

  //construct a delete request 
  public deleteMovie(id: string): Observable<Movie> {

    return this.httpClient.delete<Movie>(this.url + '/' + id).pipe(
      catchError(this.handleError)
    )

    // .pipe(
    //   catchError((error: HttpErrorResponse) => {
    //     if (error.status >= 400 && error.status < 500) {
    //       return throwError(error.error)
    //     } else {
    //       alert('Something went wrong')
    //       console.log('logging the error into logger')
    //       //......
    //       //...
    //     }
    //   })
    // )
  }



  handleError(error) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      //client error 
      errorMessage = 'Error ' + error.error.message;
    } else {
      //server error 
      errorMessage = `Error Code : ${error.status} \n Message :  ${error.message}`
    }
    return throwError(errorMessage)
  }

}
