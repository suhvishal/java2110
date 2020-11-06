import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private apiEndPoint = 'http://localhost:3900/api'
  private url = this.apiEndPoint + '/auth';

  constructor() { }

  public login(){
    //make a post request
  
  }

  
}
